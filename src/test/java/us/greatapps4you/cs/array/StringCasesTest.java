package us.greatapps4you.cs.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCasesTest {

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