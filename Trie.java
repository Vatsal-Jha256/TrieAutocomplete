import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
public class Trie {
    static final int NUM_OF_CHARS = 128 ; //including special characters and spaces
    static class TrieNode {
        char data;  //stores the character at the node
        TrieNode[] children = new TrieNode[NUM_OF_CHARS]; //children array
        boolean isEnd = false; //indicates end of word
        TrieNode(char c) {
            data = c;
        }
    }
    static class Trie1 {
        TrieNode root = new TrieNode(' ') ;
        void insert(String word) {
            TrieNode node = root;
            for (char ch: word.toCharArray()) {
                if (node.children[ch] == null)
                    node.children[ch] = new TrieNode(ch);
                node = node.children[ch];
            }
            node.isEnd = true;
        }
        ArrayList<String> autocomplete(String prefix) { //autocomplete uses a helper function to find words with similar prefix
            TrieNode node = root;
            ArrayList<String> res = new ArrayList<>();
            for (char ch: prefix.toCharArray()) {
                node = node.children[ch];
                if (node == null)
                    return new ArrayList<>();
            }
            helper(node, res,  prefix.substring(0, prefix.length()-1));
            return res;
        }
        void helper(TrieNode node,ArrayList<String> res, String prefix) {
            if (node == null ) //base condition
                return;
            if (node.isEnd)
                res.add(prefix + node.data);    //terminating condition
            for (TrieNode child: node.children)
                helper(child, res, prefix + node.data);
        }
    }
    public static ArrayList<String> file(String filename) {
        ArrayList<String> lines=new ArrayList<>();
        try (BufferedReader br=new BufferedReader(new FileReader(filename))) {     //try block for exception handling
            String line;
            while ((line=br.readLine())!= null) {
                lines.add(line);
            }
        } catch(IOException e){
            System.err.println("Error reading file: " + e.getMessage());
        }
        return lines;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<String> lines=file("C:\\Users\\hp\\Desktop\\spanish.txt");
        Trie1 t = new Trie1();
        for(String l:lines){
            t.insert(l);    //inserting each word into the trie
        }
        String wd;
        System.out.println("Enter the prefix to autocomplete");
        wd=in.next();
        System.out.println(t.autocomplete(wd));
    }
}