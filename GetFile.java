import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class GetFile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GetFile
{
    Scanner fIn;
    
    GetFile()
    {
        //try catch -- read in file
        try
        {
            fIn = new Scanner(new File("PersonFile.txt"));
            
        }   //ends try
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            
        }   //ends catch
        //call fill array list method that passes in scanner
        
    }   //ends constructor
    
}   //ends GetFile class
