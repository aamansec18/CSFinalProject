
/**
 * A Person must have:
 *      -a type
 *      -name
 *      -id
 *      -a way to change name
 *      
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Person
{
    private String myName;
    private String myType;
    private int myId;

    Person(String type, String name, int id)
    {
        myType = type;
        myName = name;
        myId = id;
    }   //ends Student constructor
    
    public int getId()
    {
        return myId;

    }   //ends getId method

    public String getType()
    {
        return myType;

    }   //ends getType

    public String getName()
    {
        return myName;

    }   //ends getName

    public void setName(String newName)
    {
        myName = newName;

    }   //ends setName method

    public abstract void personQuote();
}   //ends Person interface
