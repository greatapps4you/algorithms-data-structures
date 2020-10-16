package us.greatapps4you.cs.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCasesTest {

    @Test
    void stringObjectCreationTest(){
        String s1 = new String("durga"); //New object on the heap and new object on the SCP (String Constant Pool)
        String s2 = new String("durga"); //New object on the heap but no new object on the SCP
        String s3 = "durga"; //No new object on the heap or scp
        String s4 = "durga"; //No new object on the heap or scp
        //Total objects created: 3 objects. 2 on the heap and 1 on the SCP

        Assertions.assertFalse(s1 == s2); // Both live on the heap but each one points to a different object
        Assertions.assertFalse(s1 == s3); // s1 lives on the heap and s3 on the SCP
        Assertions.assertFalse(s1 == s4); // s1 lives on the heap and s4 on the SCP
        Assertions.assertFalse(s2 == s3); // s2 lives on the heap and s3 on the SCP
        Assertions.assertFalse(s2 == s4); // s2 lives on the heap and s4 on the SCP
        Assertions.assertTrue(s3 == s4); //Both pointing to "durga" on the SCP
    }

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