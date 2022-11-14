package io.codage.dsa.structures;

/**
 * Contacts list implemented as a trie, by Gayle Laakmann McDowell.
 * <a href="https://www.youtube.com/watch?v=vlYZb68kAY0">Hacker Rank Video Explanation</a>
 * <a href="https://www.hackerrank.com/challenges/contacts/problem">Contacts</a>
 */
public class TrieNode {
    private static final int NUMBER_OF_CHARACTERS = 26;
    TrieNode[] children = new TrieNode[NUMBER_OF_CHARACTERS];
    int size = 0;

    private static int getCharIndex(char c) {
        return c - 'a';
    }

    private TrieNode getNode(char c) {
        return this.children[getCharIndex(c)];
    }

    private void setNode(char c, TrieNode node) {
        children[getCharIndex(c)] = node;
    }

    public void addString(String s) {
        add(s, 0);
    }

    public void add(String s, int index) {
        size++;
        if (index == s.length()) return;
        char current = s.charAt(index);
        TrieNode child = getNode(current);
        if (child == null) {
            child = new TrieNode();
            setNode(current, child);
        }
        child.add(s, index + 1);
    }

    public int findCount(String s, int index) {
        if (index == s.length()) return size;
        TrieNode child = getNode(s.charAt(index));
        if (child == null) return 0;
        return child.findCount(s, index + 1);
    }
}