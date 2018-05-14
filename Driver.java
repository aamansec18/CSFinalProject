import java.util.ArrayList;

/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String[] args)
    {
        FillList newArray = new FillList();
        ArrayList<Person> masterList = newArray.fillArray();

        StartMenu runProgram = new StartMenu(masterList);
        runProgram.enterId(masterList);

        //Aishteru Nyanata
    }   //ends main menu

}   //ends Driver class
