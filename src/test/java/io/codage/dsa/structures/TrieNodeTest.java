package io.codage.dsa.structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieNodeTest {
    @Test
    public void testContactList() {
        TrieNode contacts = new TrieNode();
        contacts.addString("john");
        contacts.addString("guilherme");
        contacts.addString("gui");
        contacts.addString("mike");
        contacts.addString("mikella");
        assertEquals(0, contacts.findCount("johnny", 0));
        assertEquals(2, contacts.findCount("gui", 0));
        assertEquals(2, contacts.findCount("mike", 0));
    }

}