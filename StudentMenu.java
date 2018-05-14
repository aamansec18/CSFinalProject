import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Write a description of class StudentMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentMenu implements PersonMenu
{
    //scanner -- user input
    Scanner in;
    //arraylist -- set equal to people arraylist 
    ArrayList <Person> students;
    //studentid -- set equal to id
    int studentID;
    //instance of Search
    Search searchArr;
    
    StartMenu returnTo;
    
    int input;
    //constructor -- parameters: people, id
    StudentMenu(ArrayList<Person> people, int id)
    {
        in = new Scanner(System.in);
        students = new ArrayList<Person>();
        students = people;
        studentID = id;
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
        System.out.println("\t\tStudent Menu");
        System.out.println("\t1. View Names");
        System.out.println("\t2. Change Name");
        System.out.println("\t3. Change Year");
        System.out.println("\t4. Change GPA");
        System.out.println("\t5. Add Student");
        input = in.nextInt();
        in.nextLine();

        switch(input)
        {
            case 0: //call main menu -- create instance of menu class here to pass in current state of arraylist
            returnTo = new StartMenu(students);
            returnTo.enterId(students);
            break;

            case 1: //view names -- a subclass class that extends StudentMenu 
            //temporary method that will view all names
            viewNames();
            break;

            case 2: //change names
            changeName();
            break;

            case 3: //change grade
            changeYear();
            break;

            case 4: //add student
            addNewPerson();
            break;
        }   //ends switch statement

    }   //ends mainMenu method

    //view names -- main menu
    //view students in a certain year -- only view students in 9th grade for example
    //view students with a certain GPA -- i.e. students with gpa > 3.0
    //view students -- normal method with 
    public void viewNames()
    {
        System.out.println('\u000C');   //clears screen
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        Iterator iterator = students.iterator();
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        int i = 0;
        while (iterator.hasNext() && students.get(i).getType().equals("Student"))
        {

            System.out.print(students.get(i).getName() + "                  " + students.get(i).getId() + "         " + ((Student)(students.get(i))).getYear() + "   " +
                    ((Student)(students.get(i))).getGPA() + "     ");

            System.out.println();
            i++;
        }   //ends for loop

        input = in.nextInt();

        if (input == 0)
        {
            mainMenu();

        }   //ends if statement
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
        searchArr = new Search(students);
        int pos = searchArr.searchId(studentID);

        students.get(pos).setName(name);
        System.out.println("Name has been changed. Return to main menu.");
        input = in.nextInt();

        if (input == 0)
        {
            mainMenu();

        }   //ends if statement
    }   //ends changeName method

    //change year
    public void changeYear()
    {
        int year;
        System.out.println('\u000C');   //clears screen
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        System.out.println("Enter student's new year.");
        year = in.nextInt();
        searchArr = new Search(students);
        int pos = searchArr.searchId(studentID);

        ((Student)(students.get(pos))).setYear(year);
        
        System.out.println("Student's year has been changed. Return to main menu.");
        input = in.nextInt();

        if (input == 0)
        {
            mainMenu();

        }   //ends if statement

    }   //ends changeYear method

    //change gpa
    public void changeGPA()
    {
        double studentGPA;
        System.out.println('\u000C');   //clears screen
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        System.out.println("Enter student's new GPA.");
        studentGPA = in.nextDouble();
        searchArr = new Search(students);
        int pos = searchArr.searchId(studentID);

        ((Student)(students.get(pos))).setGPA(studentGPA);
        
        System.out.println("Student's GPA has been changed. Return to main menu.");
        input = in.nextInt();

        if (input == 0)
        {
            mainMenu();

        }   //ends if statement
        
    }   //ends changeGPA    
    
    
    //add new person
    public void addNewPerson()
    {
        String name;
        String type = "Student";
        int id;
        double gpa;
        int year;
        System.out.println('\u000C');   //clears screen
        System.out.println("<------------- Press 0 to return.");
        System.out.println();
        System.out.println("Enter student's name.");
        name = in.nextLine();

        System.out.println("Enter student's ID");
        id = in.nextInt();
        in.nextLine();

        System.out.println("Enter student's year");
        year = in.nextInt();
        in.nextLine();

        System.out.println("Enter student's gpa.");
        gpa = in.nextDouble();
        in.nextLine();

        students.add(new Student(type, name, id, year, gpa));

        System.out.println("New Student has been added. Return to main menu");
        input = in.nextInt();
        in.nextLine();

        if (input == 0)
        {
            mainMenu();

        }   //ends if statement
    }   //ends addNewPerson method
}   //ends StudentMenu
