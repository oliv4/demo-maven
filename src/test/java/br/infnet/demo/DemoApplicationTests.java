package br.infnet.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
	}

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( false );
	}

    @Test
    public void shouldAnswerWithString()
    {
        assertEquals( "Hello World!", "Hello World!" );
    }

}
