import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class Week002Day002Exersice01 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //------   1  ----------
        //        smallest();


        //------   2  ----------
        //        cheecknum();

        //------   3  ----------
        passwordCheeck();


    }

    public static void smallest() {
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.println("smallest: " + num1);

        } else if (num2 < num1 && num2 < num3) {
            System.out.println("smallest: " + num2);
        } else {
            System.out.println("smallest: " + num3);
        }
    }


    public static void cheecknum() {
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero!");
        }
    }



    public static String passwordCheeck() {
        System.out.println("Enter your password: ");
        String password=input.next();
        int cont=0;

 if (password.length()<8){
     System.out.println("A password must have at least ten characters.\n");
 } else if (!password.matches("^[a-zA-Z0-9]*$")){
            System.out.println("A password consists of only letters and digits.\n");
        }else{

     for (int i = 0; i <password.length() ; i++) {
         char character = password.charAt(i);
         if (Character.isDigit(character)){
             cont++;
         }
     }
     System.out.println(cont);
 }
        if (cont >= 2) {
            System.out.println("Your password isValued."+password);
        } else {
            System.out.println("Password does not contain at least two digits.");
        }
        return null;
    }


}
