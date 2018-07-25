package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getColor() {
        String ss = "Hi hello    goodbye\n";
        ss = ss.replaceAll("\\s{2,}", " ");
        System.out.println(ss.trim());
        Person person = new Person("33", "44", "55", "66");
        assertEquals("66", person.getColor());
        person.setColor("Red");
        assertEquals("Red", person.getColor());
    }


}