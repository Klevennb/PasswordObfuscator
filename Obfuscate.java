import java.util.*;

public class Obfuscate {

    static void checkIfFits(String password) {
        if (password.length < 5 ) {
            throw new ArithmeticException("To Small: Will Fall Out");
        }
    }
    
    static void checkLetters(String password) {
            for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            // Process char
        }
    }

    public static void main(String[] args) {
        String wordOne = new String("");
        String wordTwo = new String("");
        String wordThree = new String("");
        ArrayList<Character> letters = new ArrayList<Character>();
        letters.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        //will need  this


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your first word");
        wordOne = myObj.nextLine();
        System.out.println("Enter your second word");
        wordTwo = myObj.nextLine();
        System.out.println("Enter your third word");
        wordThree = myObj.nextLine();
    }
}

// import java.util.*;

// public class Calculator {

//     public static void main(String[] args) {
//         int num1 = 0;
//         int num2 = 0;
//         char operator;
//         double answer = 0.0;

//         Scanner scanObject = new Scanner(System.in);
//         System.out.println("Enter your first number");
//         num1 = scanObject.nextInt();
//         System.out.println("Enter your second number");
//         num2 = scanObject.nextInt();
//         System.out.println("What operator?");
//         operator = scanObject.next().charAt(0);
//         switch (operator) {
//         case '+':
//             answer = num1 + num2;
//             break;
//         case '-':
//             answer = num1 - num2;
//             break;
//         case '*':
//             answer = num1 * num2;
//             break;
//         case '/':
//             answer = num1 / num2;
//             break;
//         }
//         System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
//         ;

//     }
// }