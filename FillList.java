import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class FillList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillList extends GetFile
{
    //ArrayList
    ArrayList<Person> people;

    //constructor
    FillList()
    {
        people = new ArrayList<Person>();

    }   //ends constructor

    //fill ArrayList method -- using passed in scanner
    public void fillArray()
    {
        while(fIn.hasNext())
        {
            String type = new String(fIn.nextLine());
            type = type.trim();
            String name = fIn.nextLine();
            Integer convId = new Integer(Integer.parseInt(fIn.nextLine()));
            int id = convId.intValue();
            if (type.compareTo("Student") == 0)
            {

                Integer convYear = new Integer(Integer.parseInt(fIn.nextLine()));
                int year = convYear.intValue();
                Double convGPA = new Double(Double.parseDouble(fIn.nextLine()));
                double gpa = convGPA.doubleValue();
                people.add(new Student(type, name, id, year, gpa));

            }   //ends if statement

            else
            {
                String subject = fIn.nextLine();

                people.add(new Teacher(type, name, id, subject));

            }   //ends else statement

        }   //ends while loop
        StartMenu newMenu = new StartMenu(people);
        newMenu.enterId();
    }   //ends fillArray method
}   //ends FillList class
