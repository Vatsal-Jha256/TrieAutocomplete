# TrieSearch

AIM- Trie Autocomplete for language learning purpopses.

Project Methodology-

We use Java to create a program implementing the autocomplete aspect of Trie.
We collected a list of 1000 most frequently used words in spanish into a text file.
We then used file handling to read it, and insrt the words one by one into the trie data structures.
We use 128 children to incorporate the special characters. This ensures fast insertion and fast retrieval of data from memory. 

The trie creation function defines the nodes of the tree. the insertion function serves to add the nodes into the tree. 
Autocomplete function is where we take prefix as parameter and then return other words with same prefix using teh recursive helper function.
The Helper function traverses
