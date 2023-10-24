import java.util.Scanner;

public class BooksShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] BooksNames = new String[100];
        String[] BooksAuthors = new String[100];
        double[] BooksPrices = new double[100];
        boolean isTrue = true;
        int count = -1;
        while (isTrue) {
            System.out.println("-----Main Menu-----");
            System.out.println("1- Display All Book");
            System.out.println("2- Add Book");
            System.out.println("3- Update Book ");
            System.out.println("4- Delete Book");
            System.out.println("5- Search Book");
            System.out.println("6- Exit");
            System.out.print("    > Enter your choice: ");
            char choices = input.next().charAt(0);
            switch (choices) {
                case '1':
                    //Display
                    System.out.println("Names \t Author \t Price");
                    for (int i = 0; i <= count; i++) {
                        if (BooksNames[i] == null) continue;
                        System.out.print(BooksNames[i] + " \t " + BooksAuthors[i] + " \t " + BooksPrices[i] + "\n");

                    }
                    break;
                case '2':
                    // Add
                    System.out.print("How many books you want add: ");
                    int numBooks = input.nextInt();
                    for (int i = 0; i < numBooks; i++) {
                        if (BooksPrices[i] == 0) {
                            System.out.print("Please enter Book name: ");
                            String BooksName = input.next();
                            System.out.print("Please enter Book author: ");
                            String BooksAuthor = input.next();
                            System.out.print("Please enter Book price: ");
                            double BooksPrice = input.nextDouble();

                            BooksNames[i] = BooksName;
                            BooksAuthors[i] = BooksAuthor;
                            BooksPrices[i] = BooksPrice;
                            count++;
                        }
                    }


                    break;
                case '3':
                    //  Update
                    System.out.print("Please Enter bookName for Search: ");
                    String search1 = input.next();
                    boolean isFound1 = false;
                    for (int i = 0; i < BooksNames.length; i++) {
                        if (search1.equalsIgnoreCase(BooksNames[i])) {
                            System.out.println("I Found this Book");
                            System.out.print(BooksNames[i] + " \t " + BooksAuthors[i] + " \t " + BooksPrices[i] + "\n");
                            isFound1 = true;
                            System.out.print("Please enter Book name: ");
                            String BooksName = input.next();
                            System.out.print("Please enter Book author: ");
                            String BooksAuthor = input.next();
                            System.out.print("Please enter Book price: ");
                            double BooksPrice = input.nextDouble();

                            BooksNames[i] = BooksName;
                            BooksAuthors[i] = BooksAuthor;
                            BooksPrices[i] = BooksPrice;
                            break;
                        }

                    }
                    if (isFound1 == false) {
                        System.out.println("Sorry Not Found!!");
                    }
                    break;
                case '4':
                    // Delete
                    System.out.print("Please Enter bookName for Search: ");
                    String search2 = input.next();
                    boolean isFound2 = false;
                    for (int i = 0; i < BooksNames.length; i++) {
                        if (search2.equalsIgnoreCase(BooksNames[i])) {
                            System.out.println("I Found this Book");
                            System.out.print(BooksNames[i] + " \t " + BooksAuthors[i] + " \t " + BooksPrices[i] + "\n");
                            System.out.println("you want remove " + search2 + " Yes/No");
                            char remove = input.next().toLowerCase().charAt(0);
                            if (remove == 'y') {
                                BooksNames[i] = BooksNames[i + 1];
                                BooksAuthors[i] = BooksAuthors[i + 1];
                                BooksPrices[i] = BooksPrices[i + 1];
                            }
                            count--;
                            isFound2 = true;
                            break;
                        }

                    }
                    if (isFound2 == false) {
                        System.out.println("Sorry Not Found!!");
                    }

                    break;
                case '5':
                    // Search
                    System.out.print("Please Enter bookName for Search: ");
                    String search = input.next();
                    boolean isFound = false;
                    for (int i = 0; i < BooksNames.length; i++) {
                        if (search.equalsIgnoreCase(BooksNames[i])) {
                            System.out.println("I Found this Book");
                            System.out.print(BooksNames[i] + " \t " + BooksAuthors[i] + " \t " + BooksPrices[i] + "\n");
                            isFound = true;
                            break;
                        }

                    }
                    if (isFound == false) {
                        System.out.println("Sorry Not Found!!");
                    }

                    break;
                case '6':
                    //  Exit

                    System.out.println("thanks for use my BooksShop See you Soon");
                    System.exit(-1);
                    break;
                default:
                    System.err.println("Input is Wrong !!");
                    break;


            }

        }

    }

}
