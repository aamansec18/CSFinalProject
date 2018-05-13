import java.util.ArrayList;
/**
 * Write a description of class Search here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Search extends FillList
{
    //arraylist
    ArrayList<Person> personArr;
    //constructor -- pass in arraylist from fillList class
    Search(ArrayList<Person> people)
    {
        personArr = new ArrayList<Person>();
        personArr = people;
    }   //ends constructor

    
    //searchId -- return int
    public int searchId(int id)
    {
        for (int i = 0; i < personArr.size(); i++)
        {
            if (personArr.get(i).getId() == id)
            {
                return i;
                
            }   //ends if statement
            
        }   //ends for loop
        
        return -1;
    }   //ends searchId
    
}   //ends fillList class
