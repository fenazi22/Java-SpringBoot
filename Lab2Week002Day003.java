import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lab2Week002Day003 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // ---      1      ---
        // System.out.println("\t---      1      ---\n");
        // longest();

        // ---      2      ---
        // System.out.println("\n\t---      2      ---\n");
        //  checknum();


        // ---      3      ---
        //   System.out.println("\n\t---      3      ---\n");
        // largest();


        // ---      4      ---
        // System.out.println("\n\t---      4      ---\n");
        //   reversNumber();


        // ---      5      ---
        // System.out.println("\n\t---      5      ---\n");
        // menu();



        // ---      6      ---
        // System.out.println("\n\t---      6      ---\n");
        // randme();



        // ---      7      ---
        // System.out.println("\n\t---      7      ---\n");
        // ceckPass();


        // ---      8      ---
        // System.out.println("\n\t---      8      ---\n");
        //   fibonacci();


    }   //--- End-Main.

    private static void ceckPass() {
        System.out.println("Enter your password:");
        String pass = input.next();
        boolean check1 = Pattern.matches("[a-z,0-9]{0,5}", pass);
        if (check1 == true) {
            System.out.println("0 points");
            System.out.println("weak!");
        }
        //boolean check2=Pattern.matches("[a-z,0-9]{6,7}",pass) ;
        else if (check1 = Pattern.matches("[a-z,0-9]{6,7}", pass)) {
            System.out.println("2 points");
            System.out.println("weak!");
        }

        //boolean check3=Pattern.matches("[a-z,0-9]{6,7}",pass) ;
        else if (check1 = Pattern.matches("[a-z,0-9]{6,7}", pass)) {
            System.out.println("2 points");
            System.out.println("weak!");
        } else if (check1 = Pattern.matches("[a-z,0-9]{0,5}", pass)) {
            System.out.println("3 points");
            System.out.println("weak!");

        } else if (check1 = Pattern.matches("([a-z,A-Z,0-9]{8,10})([!@#$%^&*()_+])", pass)) {
            System.out.println("3 points");
            System.out.println("Strong password :)");
        } else {
            System.out.println("weak!");
        }

    }

    public static void longest() {
        String[] arrayString = {"cat", "dog", "red", "is", "am"};
        ArrayList<String> logArray = new ArrayList<>();
        for (int i = 0; i < arrayString.length - 1; i++) {
            if (arrayString[i].length() > logArray.size()) {
                logArray.add(arrayString[i]);
            }
        }
        for (int i = 0; i < logArray.size(); i++) {
            System.out.print(logArray.get(i) + " ");
        }

    }


    public static void checknum() {
        int[] num = {1, 1, 1, 3, 3, 5};
        System.out.print("Enter number for check: ");
        int num2 = input.nextInt();
        int count = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num2) {
                count++;
            } else {


            }


        }

        System.out.println(num2 + " occurs " + count + " times");

    }


    public static void largest() {
        int[] largerNum = {1, 4, 17, 7, 25, 3, 100};
        for (int i = 0; i < largerNum.length - 1; i++) {
            int Max = largerNum[i];
            for (int j = i + 1; j < largerNum.length; j++) {
                if (largerNum[i] > largerNum[j]) {
                    int temp = largerNum[i];
                    largerNum[i] = largerNum[j];
                    largerNum[j] = temp;

                }
            }

        }

        System.out.print("3 largest elements of the said array are: ");
        for (int i = largerNum.length - 1; i > 3; i--) {
            System.out.print(+largerNum[i] + " ");
        }

    }


    public static void reversNumber() {

        int[] num = {5, 4, 3, 2, 1};
        for (int i = 0; i < num.length - 1; i++) {
            int Max = num[i];
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }
            }

        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }


    public static void menu() {
        boolean isTrue = true;
        System.out.println("Enter Size Arry:");
        int size = input.nextInt();
        int[] num = new int[size];
        while (true) {

            System.out.println("" +
                    "1. Accept elements of an array \n" +
                    "2. Display elements of an array \n" +
                    "3. Search the element within array \n" +
                    "4. Sort the array \n" +
                    "5. To Stop\n");
            char choice = input.next().charAt(0);
            switch (choice) {

                case '1':
                    // Accept elements of an array
                    for (int i = 0; i < num.length; i++) {
                        System.out.print("Enter " + (i + 1) + "- number: ");
                        int num2 = input.nextInt();
                        num[i] += num2;
                    }
                    break;

                case '2':
                    // Display elements of an array
                    for (int i = 0; i < num.length; i++) {
                        System.out.print(num[i] + " ");
                    }
                    System.out.println("\n");
                    break;

                case '3':
                    //Search the element within array
                    System.out.print("Enter number for search: ");
                    int Search = input.nextInt();
                    boolean isfound = true;
                    for (int i = 0; i < num.length; i++) {
                        if (Search == num[i]) {
                            System.out.println("I found " + num[i]);
                            isfound = true;
                        }

                    }
                    if (isfound == false) {
                        System.out.println("sorry not Found!!");
                    }
                    break;

                case '4':
                    //  Sort the array
                    for (int i = 0; i < num.length - 1; i++) {
                        int Max = num[i];
                        for (int j = i + 1; j < num.length; j++) {
                            if (num[i] > num[j]) {
                                int temp = num[i];
                                num[i] = num[j];
                                num[j] = temp;

                            }
                        }

                    }
                    for (int i = 0; i < num.length; i++) {
                        System.out.print(num[i] + " ");
                    }
                    System.out.println("\n");
                    break;

                case '5':
                    // To Stop
                    System.out.println("thank you :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }

    }

    public static void randme() {
        System.out.print("Enter mines: ");
        int mins = input.nextInt();
        System.out.print("Enter max: ");
        int maxs = input.nextInt();
        System.out.print("Enter how many number: ");
        int numRandom = input.nextInt();
        for (int i = 0; i < numRandom; i++) {
            int rand = (int) Math.floor(Math.random() * (maxs - mins + 1) + mins);
            System.out.println(rand);
        }


    }


    public static void fibonacci() {
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int numFibonacci = input.nextInt();
        int num1 = 0, num2 = 1, sum = 0;
        for (int i = 2; i < numFibonacci; i++) {
            System.out.print(num1 + " + " + num2);
            sum = num1 + num2;
            System.out.println(" = " + sum);
            num1 = num2;
            num2 = sum;
        }
    }


}   // ---- End - Class.
