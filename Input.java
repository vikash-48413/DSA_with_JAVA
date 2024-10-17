import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println("User input is : " +input);

        
        String name = sc.nextLine(); // Here nextLine is used for taking the whole name as the input including the sapces in between the names like vikash Kumar
        System.out.println("User name is : " +name);

        
        sc.close();
    }
    
}

// Note: To take other datatypes as the input we can use like- next,nextLine,nextInt, nextByte, nextFloat, nextDouble, nextBoolean, nextShort, nextLong