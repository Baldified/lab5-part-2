import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.*;

/**
 * The responder class represents a response generator object. It is used
 * to generate an automatic response. This is the second version of this 
 * class. This time, we generate some random behavior by randomly selecting 
 * a phrase from a predefined list of responses.
 * 
 * @author   Michael Kölling and David J. Barnes
 * @version 7.2
 */
public class Responder
{
    private Random randomGenerator;
    private HashMap<String, String> responses;

    /**
     * Construct a Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new HashMap<>();
        fillResponsesMap();
    }

    /**
     * Generate a response.
     * 
     * @return  A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> x)
    {
        String answer;
        for(String x2 : x) {
           answer = responses.get(x2);
           if (answer != null) {
            return answer;
           }
        } 
        
        return pickDefaultResponse();
    }

    public String pickDefaultResponse()
    {
        return "Default reponse to anything";
    }
    /**
     * Build up a list of default responses from which we can pick one
     * if we don't know what else to say.
     */
    private void fillResponsesMap()
    {
        responses.put("a", "That sounds odd. Could you describe this in more detail?");
        responses.put("b", """
                      No other customer has ever complained about this before.
                      What is your system configuration?
                      """);
        responses.put("c", "I need a bit more information on that.");
        responses.put("d", "Have you checked that you do not have a dll conflict?");
        responses.put("e", "That is covered in the manual. Have you read the manual?");
        responses.put("f", """
                      Your description is a bit wishy-washy. Have you got an expert
                      there with you who could describe this more precisely?
                      """);
        responses.put("g", "That's not a bug, it's a feature!");
        responses.put("h", "Could you elaborate on that?");
        responses.put("i", "Have you tried running the app on your phone?");
        responses.put("j", "I just checked StackOverflow - they don't know either.");
        responses.put("k", "No");
        responses.put("l", "Yes");
        responses.put("m", "Maybe");
    }
   
}

