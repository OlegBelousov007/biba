import org.example.Example;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class ExampleTest {
    private static Example example;

    @BeforeAll
    static void initObj(){
        example = new Example();
        System.out.println("Odj was created");
    }
    @BeforeEach
    void showBefore() {
        System.out.println("Before each passed");
    }

    @AfterAll
    static void showInfo(){
        System.out.println("All test passed");
    }
    @Test
    public void test(){
        assertEquals(10, example.max(10, 5));
        assertEquals(25, example.max(25, 13));
        assertEquals(-10, example.max(-100, -10));
        assertEquals(78, example.max(78, 8));
        assertEquals(256, example.max(256, 256));
        assertEquals(0, example.max(0, 0));
        System.out.println("Test 1: ");
    }

    @Test
    public void seconsTest(){
        assertEquals(15, example.sum(10, 5));
        assertEquals(38, example.sum(25, 13));
        assertEquals(-110, example.sum(-100, -10));
        assertEquals(86, example.sum(78, 8));
        assertEquals(0, example.sum(256, -256));
        assertEquals(0, example.sum(0, 0));
        System.out.println("Test 2: ");
    }
}