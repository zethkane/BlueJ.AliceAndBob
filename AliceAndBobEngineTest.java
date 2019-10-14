

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AliceAndBobEngineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AliceAndBobEngineTest
{

    public AliceAndBobEngineTest()
    {
    }

    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void evaluateAliceOrBobTestAlice(){
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        
        assertEquals("Hello Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Alice"));
        assertNotEquals("Hello Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Jeff. Jeff the Elephant."));
        
        assertEquals("I don't know you, you are scary.", aliceAndBobEngineTest.evaluateAliceOrBob("Alicia"));
        assertNotEquals("I don't know you, you are scary.", aliceAndBobEngineTest.evaluateAliceOrBob("Alice"));
        
    }
    
    @Test
    public void evaluateAliceOrBobTestBob(){
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        
        assertEquals("Hello Bob", aliceAndBobEngineTest.evaluateAliceOrBob("Bob"));
        assertNotEquals("Hello Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Pamela. Pamela the tropical citrus tree."));
        
        assertEquals("I don't know you, you are scary.", aliceAndBobEngineTest.evaluateAliceOrBob("Bobert"));
        assertNotEquals("I don't know you, you are scary.", aliceAndBobEngineTest.evaluateAliceOrBob("Bob"));
    }
        
}
