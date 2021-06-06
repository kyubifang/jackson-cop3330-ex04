package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_formats() {
        App myApp = new App();
        String noun = "dog";
        String verb = "walk";
        String adj = "blue";
        String adv = "quickly";

        String expectedOutput = "Do you walk your blue dog quickly? That's hilarious!";
        String actualOutput = myApp.generateOutputString(noun, verb, adj, adv);

        assertEquals(expectedOutput, actualOutput);
    }
}