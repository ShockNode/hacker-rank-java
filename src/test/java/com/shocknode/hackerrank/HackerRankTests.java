package com.shocknode.hackerrank;

import org.junit.Test;

public class HackerRankTests {

    @Test
    public void sockMerchant() throws Exception { 
            
        assert SockMerchant.test(6, new int[]{4,3,3,3,4,3}) == 3;

    }
    
    @Test
    public void alternatingCharacters() throws Exception {
        
        assert AlternatingCharacters.test("AAAA") == 3;
        assert AlternatingCharacters.test("BBBBB") == 4;
        assert AlternatingCharacters.test("ABABABAB") == 0;
        assert AlternatingCharacters.test("AAABBB") == 4;
        
    }
    
    @Test
    public void sherlockString() throws Exception {
        
        assert !SherlockString.test("aabbcd");
        assert !SherlockString.test("aabbccddeefghi");
        assert SherlockString.test("abcdefghhgfedecba");
        
    }

    @Test
    public void anagrams() throws Exception {

        assert Anagrams.test("cde", "abc") == 4;
        assert Anagrams.test("brek", "broek") == 1;

    }
    
}

