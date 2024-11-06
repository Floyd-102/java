import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("What is your name:" );
        String name = scanner.nextLine();

        System.out.print("What is your age:" );
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your favorite food:" );
        String food = scanner.nextLine();

        System.out.print("What is your favorite game:" );
        String game = scanner.nextLine();

        System.out.print ("Where is your school:" );
        String school = scanner.nextLine();

        System.out.print("What is the name of your mother:" );
        String mother = scanner.nextLine();
        
        System.out.print("Where did you finished Senior High School:" );
        String shs = scanner.nextLine();

        System.out.print ("Do you have a pet:" );
        String pet = scanner.nextLine();

        System.out.print("How many are your siblings:" );
        int siblings = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your mobile number:" );
        String mobile  = scanner.nextLine();


        System.out.print("your name" + name);
        System.out.print("your age" + age);
        System.out.print("your favorite food" + food);
        System.out.print("your favorite game" + game);
        System.out.print("your school" + school);
        System.out.print("name of your mother" + mother);
        System.out.print("Where did you finished Senior High School:" );
        System.out.print("your pet:" + pet);
        System.out.print("Number of siblings:" + siblings);
        System.out.print("Your mobile number:" + mobile);


    

    



  
    
  
  
  
  
  
  
  
    }
}
