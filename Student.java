
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    //private variables
        //myName
        //myType
        //myId
    private int myYear;
    private double myGPA;
        
    //constructor
    Student(String type, String name, int id, int year, double gpa)
    {
        super(type, name, id);
        myYear = year;
        myGPA = gpa;
    }   //ends Student constructor
    
    public int getYear()
    {
        return myYear;
        
    }   //ends getGrade method
    
    public void setYear(int newYear)
    {
        myYear = newYear;
        
    }   //ends setGrade
    
    public void setGPA(double newGPA)
    {
        myGPA = newGPA;
        
    }   //ends setGPA method
    
    public double getGPA()
    {
        return myGPA;
        
    }   //ends getGPA method
    
    public void personQuote()
    {
        System.out.println("I am a student.");
    }   //ends personQuote
    
}   //ends Student class
