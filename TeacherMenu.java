import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class TeacherMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeacherMenu implements PersonMenu
{
    //scanner -- user input
    Scanner in;
    //arraylist -- set equal to people arraylist 
    ArrayList <Person> teachers;
    //studentid -- set equal to id
    int teacherID;
    //instance of Search
    Search searchArr;

    StartMenu returnTo;

    int input;
    //constructor -- parameters: people, id
    TeacherMenu(ArrayList<Person> people, int id)
    {
        in = new Scanner(System.in);
        teachers = new ArrayList<Person>();
        teachers = people;
        teacherID = id;
        input = 0;
    }   //ends constructor

    //main menu
    //view names
    //separate menu that shows names based on iterators
    //change names
    //change year
    //change gpa
    //add student
    public void mainMenu()
    {

        System.out.println('\u000C');   //clears screen
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        System.out.println();
        System.out.println("\t\tTeacher Menu");
        System.out.println("\t1. View Names");
        System.out.println("\t2. Change Name");
        System.out.println("\t3. Add Teacher");
        input = in.nextInt();

        switch(input)
        {
            case 0: //call main menu -- create instance of menu class here to pass in current state of arraylist
            returnTo = new StartMenu(teachers);
            returnTo.enterId();
            break;

            case 1: //view names -- a subclass class that extends StudentMenu 
            //temporary method that will view all names
            viewNames();
            break;

            case 2: //change names
            changeName();
            break;

            case 3: //change grade
            addNewPerson();
            break;

        }   //ends switch statement

    }   //ends mainMenu method

    public void viewNames()
    {
        System.out.println('\u000C');   //clears screen
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        for(int i = 0; i < teachers.size(); i++)
        {
            if (teachers.get(i).getType() == "Teacher")
            {
                System.out.print(teachers.get(i).getName() + "                  " + teachers.get(i).getId() + "         " + ((Teacher)(teachers.get(i))).getSubject());

                System.out.println();    

            }   //ends if statement

            else
            {
                continue;

            }   //ends else
        }   //ends for loop

    }   //ends viewNames method
    //change name
    public void changeName()
    {
        String name;
        System.out.println('\u000C');   //clears screen
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        System.out.println("Enter new name.");
        name = in.nextLine();
        searchArr = new Search(teachers);
        int pos = searchArr.searchId(teacherID);

        teachers.get(pos).setName(name);
        System.out.println("Name has been changed. Return to main menu.");
        input = in.nextInt();

        if (input == 0)
        {
            mainMenu();

        }   //ends if statement
    }   //ends changeName method

    public void addNewPerson()
    {
        String name;
        String type = "Teacher";
        int id;
        String subject;
        System.out.println('\u000C');   //clears screen
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        System.out.println("Enter teacher's name.");
        name = in.nextLine();

        System.out.println("Enter teacher's ID");
        id = in.nextInt();

        System.out.println("Enter teacher's subject.");
        subject = in.nextLine();

        teachers.add(new Teacher(type, name, id, subject));

        System.out.println("New Teacher has been added. Return to main menu");
        input = in.nextInt();

        if (input == 0)
        {
            mainMenu();

        }   //ends if statement
    }   //ends addNewPerson method
}   //ends TeacherMenu class
