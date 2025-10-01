import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap contacts;
    public MapTester()
    {
        contacts = new HashMap<>();
    }

    public void enterNumber(String name, String number)
    {
         contacts.put(name, number);
    }
    public void lookupNumber(String name)
    {
        //return contacts.get(name);
    }
}