

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AliceAndBobEngineTest.
 *
 * @Zeth Kane  (your name)
 * @02/05/2020 (a version number or a date)
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
        
        assertEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Alicia"));
        assertNotEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Alice"));
        
    }
    
    @Test
    public void evaluateAliceOrBobTestBob(){
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        
        assertEquals("Hello Bob", aliceAndBobEngineTest.evaluateAliceOrBob("Bob"));
        assertNotEquals("Hello Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Pamela. Pamela the tropical citrus tree."));
        
        assertEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Bobert"));
        assertNotEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Bob"));
    }
    
    @Test
    public void evaluateAliceOrBobTestScary(){
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        
        assertNotEquals("I don't know you, you are scary?", aliceAndBobEngineTest.evaluateAliceOrBob("Cynthia"));
        assertNotEquals("I don't know you, you are scary!", aliceAndBobEngineTest.evaluateAliceOrBob("Simba"));
        assertNotEquals("New method, who dis?", aliceAndBobEngineTest.evaluateAliceOrBob("Luna"));
    }
        
}
