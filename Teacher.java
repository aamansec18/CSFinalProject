
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
       //private variables
        //myName
        //myType
        //myId

    private String mySubject;
        
    //constructor
    Teacher(String type, String name, int id, String subject)
    {
        super(type, name, id);
        mySubject = subject;
        
    }   //ends Student constructor
    
    public String getSubject()
    {
        return mySubject;
        
    }   //ends getGrade method
  
    
    public void personQuote()
    {
        System.out.println("I am a Teacher.");
    }
}   //ends Teacher class
