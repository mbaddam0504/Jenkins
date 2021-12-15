package helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Junit5ExampleTest {
	
	@Test
    void justAnExample() {
		int result = HelloWorld.returnOne();
	   assertEquals(result, 1);
    }

}
