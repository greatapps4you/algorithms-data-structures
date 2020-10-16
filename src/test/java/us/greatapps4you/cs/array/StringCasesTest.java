package us.greatapps4you.cs.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCasesTest {

    @Test
    void stringBufferComparisonTest(){
        StringBuffer sb1 = new StringBuffer("durga");
        StringBuffer sb2 = new StringBuffer("durga");

        Assertions.assertFalse(sb1 == sb2); // Because == compares reference not content
        Assertions.assertFalse(sb1.equals(sb2)); // Because Object.equals() is meant for reference comparison and StringBuffer does not override it for content comparison.
    }

    @Test
    void stringComparisonTest(){
        String s1 = new String("durga");
        String s2 = new String("durga");

        Assertions.assertFalse(s1 == s2); // Because == compares reference not content
        Assertions.assertTrue(s1.equals(s2)); // Because String overrides Object.equals() for content comparison
    }

    @Test
    void stringTest(){
        String s = new String("durga");
        s.concat(" software"); // A new String Object is created but not assigned to any variable
        Assertions.assertEquals("durga", s); //Because String is immutable
        System.out.println(s);
    }

    @Test
    void stringBufferTest(){
        StringBuffer sb = new StringBuffer("durga");
        sb.append(" software");
        Assertions.assertEquals("durga software", sb.toString()); //Because StringBuffer is mutable
        System.out.println(sb);
    }

    @Test
    void stringBuilderTest(){
        StringBuilder sb = new StringBuilder("durga");
        sb.append(" software");
        Assertions.assertEquals("durga software", sb.toString()); //Because StringBuilder is mutable
        System.out.println(sb);
    }

}