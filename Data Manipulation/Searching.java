import java.util.*;

public class Searching{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String[] students = {
    "Allen",
    "Mark",
    "John",
    "Maria",
    "Kevin",
    "Sarah",
    "James",
    "Anna"
    };

    System.out.print("Enter a name: ");
    String name = sc.nextLine();
    System.out.println(" ");

    boolean found = false;
    int count = 1;

    for(int i = 0; i < students.length; i++){    
       
        if (students[i].equalsIgnoreCase(name)) {
        found = true;
        System.out.println("Student found!");
        System.out.println("Index: " + i);
        }

        if(name[i].equals(students)){
          
        }

        

    }
    if (!found) {
        System.out.println("Student not found! ");
    }

    


    }
}