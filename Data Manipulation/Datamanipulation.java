import java.util.*;


public class Datamanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter you full name: ");
        String name = sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        System.out.println("=== STUDENT INFORMATION ===");
        System.out.println("");
        
        System.out.println("Original Name: " + name );
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Name Lenght: " + name.length());

        System.out.println("First Letter: " + name.charAt(0));
        for( int i = name.length() -1; i>=0; i--){
            System.out.println("Last Name: "+ name.charAt(i));
            break;
        }

        System.out.println("");

        if (name.toUpperCase().contains("A")){
            System.out.println("Contains 'A'? : Yes ");
        }else{
            System.out.println("Contains 'A'? : No");
        }
        
        System.out.print("First name: ");
        for(int i = 0; i < name.length(); i++ ){
            System.out.print(name.charAt(i));
            if (name.charAt(i) == ' ') {
           break;
           }
        }
        System.out.println(" ");
        
        
        
        int n = 0;
        for(int i = 0; i < name.length(); i++){
            
            if (name.charAt(i) == ' ') {
               n++; 
            }
        }
        System.out.println("Spaces: " + n);
        

        System.out.println("  ");

        System.out.println("Course: "+ course);
        System.out.println("Student ID: " +id);
       
       



         
      




    }
}
