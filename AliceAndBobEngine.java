
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {if (input.equals ("Alice") || input.equals ("Bob")){
        return "Hello " + input;
    }
    else if (input.equals ("Alicia") || input.equals ("Bobert")){
        return "I DON'T KNOW YOU, YOU ARE SCARY";
    }
   
    return result;

    }
}
