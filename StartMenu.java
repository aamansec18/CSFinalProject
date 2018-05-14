import java.util.*;
/**
 * Get the user's id and use the search method in the search class
 * to find the position of the user's id
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu
{
    //Scanner
    Scanner in;
    //StudentMenu
    StudentMenu personStudent;
    //TeacherMenu
    TeacherMenu personTeacher;
    int userId;
    //instance of Search
    Search find;

    //constructor that is called to update arraylist
    StartMenu(ArrayList<Person> people)
    {
        in = new Scanner(System.in);
        userId = 0;
        find = new Search(people);

        
    }   //ends constructor
    
    //enter id method
    public void enterId(ArrayList<Person> people)
    {
        System.out.println("Enter ID.");
        userId = in.nextInt();
        
        int searchResult = find.searchId(userId);
        
        /*while (searchResult < 0 || userId > 0)
        {
            System.out.println('\u000C');
            System.out.println("ID not found. Please enter another ID or exit.");
            userId = in.nextInt();
            searchResult = find.searchId(userId);
            
        }   //ends while loop
        */
        if (searchResult >= 0 && (people.get(searchResult).getType().equals("Student")))
        {
            personStudent = new StudentMenu(people, userId);
            personStudent.mainMenu();
           
        }   //ends if statement
        
        else if (searchResult >= 0 && people.get(searchResult).getType().equals("Teacher"))
        {
            personTeacher = new TeacherMenu(people, userId);
            personTeacher.mainMenu(); 
            
        }   //ends else statement 
        
        if (userId == 0)
        {
            System.out.println("Goodbye");
            return; 
            
        }   //ends else statement
        
    }   //ends enterId method
    
}   //ends StartMenu class
