# Trie Autocomplete

#**AIM- Trie Autocomplete for language learning purposes.**

***Project Methodology***

1. **INTRO** 
We use Java to create a program implementing the autocomplete aspect of Trie.
We collected a list of the 1000 most frequently used words in Spanish into a text file.
We then used file handling to read it and insert the words one by one into the trie data structures.

2. We use 128 children to incorporate the special characters. This ensures fast insertion and fast retrieval of data from memory. 

3. **Program Explanation** 

  The trie creation function defines the nodes of the tree. the insertion function serves to add the nodes to the tree. 
  Autocomplete function is where we take a prefix as a parameter and then return other words with the same prefix using the recursive helper function.
  The Helper function traverses until it reaches the end, then returns all the words stored with the particular prefix.

  We use the file function to load the file and insert the words one by one.

  In the main function, we ask the user for input and then output all the words with the same prefix.


4. **THE NEW APPLICATION EXPLORED HERE** is that it can be used to make language learning more interactive. Especially because root words have a lot of meaning in the field of linguistics and experimenting and seeing the power of root words, which this data structure seems so aptly designed for might make language learning a lot more fun.
