import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.min;

public class Week01day007Lab01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //----      1      ------
//        System.out.print("Enter first number: ");
//        int num1= input.nextInt();
//        System.out.print("Enter first number: ");
//        int num2= input.nextInt();
//        System.out.println(num1+" + "+ num2+" ="+(num1+num2));
//        System.out.println(num1+" - "+ num2+" ="+(num1-num2));
//        System.out.println(num1+" * "+ num2+" ="+(num1*num2));
//        System.out.println(num1+" / "+ num2+" ="+(num1/num2));
//        System.out.println(num1+" % "+ num2+" ="+(num1%num2));





        //----      2      ------
//        for (int i = 8; i <9 ; i++) {
//            for (int j = 1; j <=10 ; j++) {
//                System.out.println(i+" * "+j+" = "+(i*j));
//
//            }
//        }






        //----      3      ------
//        System.out.print("Enter radius: ");
//        double redius = input.nextDouble();
//        double pi = 3.14159;
//        double area = pi * (redius * redius);
//        double perimeter = 2 * pi * redius;
//        System.out.println("Perimeter is = " + perimeter);
//        System.out.println("Area is = " + area);





        //----      4      ------
//        float average=0.0f;
//        float count=0.0f;
//        System.out.print("how many number you want calc average: ");
//        float Lingth=input.nextInt();
//        for (int i = 0; i <Lingth ; i++) {
//            System.out.print((i+1)+"- Enter a number: ");
//            float num= input.nextInt();
//            count+=num;
//        }
//        System.out.println(count);
//        System.out.println("average "+((float)count/(float) Lingth));





        //----      5      ------
//        System.out.print("Input the first number : ");
//        int num1= input.nextInt();
//        System.out.print("Input the second number: ");
//        int num2= input.nextInt();
//        System.out.print("Input the third number : ");
//        int num3= input.nextInt();
//        if ((num1+num2)==num3){
//            System.out.println("The result is: true ");
//        }else {
//            System.out.println("The result is: false");
//        }







        //----      6      ------
//    String text="lasiaF";
//        System.out.println(text);
//        for (int i = text.length()-1; i >=0 ; i--) {
//            System.out.print(text.charAt(i));
//        }






        //----      7      ------
//        System.out.print("Enter a number:  ");
//        int num = input.nextInt();
//       if (num>0){
//           if (num%2!=0)
//               System.out.println("The number is Odd\n");
//           else{
//               System.out.println("The number is Even");
//           }
//       }else{
//           System.out.println("your input nigative number!");
//       }






        //----      8      ------
//        System.out.print("Enter temperature in Centigrade: ");
//        double centigrade = input.nextInt();
//        double fahrenheit =((centigrade*9)/5)+32;
//        System.out.println("Temperature in Fahrenheit is: "+fahrenheit);






        //----      9      ------
//        String text="Java Bootcamp";
//        System.out.print("Input a number: ");
//        int index=input.nextInt();
//        System.out.println(text.charAt(index));






        //----      10      ------
//        System.out.print("Width: ");
//        double Width = input.nextDouble();
//        System.out.print("Height: ");
//        double Height = input.nextDouble();
//        System.out.println("Area is : "+Width+" * "+Height +" = "+(Width*Height) );
//        System.out.println("Perimeter is 2*: "+Width+" * "+Height +" = "+2*(Width+Height) );






        //----      11      ------
//        System.out.print("Input first integer: ");
//        int fristnum= input.nextInt();
//        System.out.print("Input second integer: ");
//        int secondnum= input.nextInt();
//        if (fristnum>=0 && secondnum>=0){
//            System.out.println(fristnum+" != "+secondnum+" = "+(fristnum!=secondnum));
//            System.out.println(fristnum+" < "+secondnum+" = "+(fristnum<secondnum));
//            System.out.println(fristnum+" <= "+secondnum+" = "+(fristnum<=secondnum));
//        }else{
//            System.out.println("\n\tsorry your input negative number \n");
//        }








        //----      12      ------
//        int hours = 0, mentes = 0, mod = 0;
//        int seconds = 86399;
//        hours = seconds / 3600;
//        mod = seconds % 3600;
//        seconds = mod;
//        mentes = mod / 60;
//        mod = mentes % 60;
//        seconds = mod;
//        System.out.println(hours + ":" + mentes + ":" + seconds);






        //----      13      ------
//        System.out.println("Input first number: ");
//        int num1= input.nextInt();
//        System.out.println("Input second number: ");
//        int num2= input.nextInt();
//        System.out.println("Input third number: ");
//        int num3= input.nextInt();
//        System.out.println("Input fourth number: ");
//        int num4= input.nextInt();
//        if (num1==num2&&num1==num3&&num1==num4){
//            System.out.println("Numbers are equal!\n");
//        }else{
//            System.out.println("Numbers are not equal!\n");
//        }








        //----      14      ------
//        System.out.println("Please  Enter a number");
//        int num= input.nextInt();
//        if (num==0){
//            System.out.println("Zero");
//        } else if (num>0) {
//            System.out.println("positive");
//        }else {
//            System.out.println("negative");
//        }







        //----      15      ------
//        int postivConunt = 0;
//        int negitvCount = 0;
//        int ZerovCount = 0;
//        while (true) {
//            System.out.println("Please  Enter a number");
//            int num = input.nextInt();
//            if (num == 0) {
//                System.out.println(num + " Zero");
//                ZerovCount++;
//            } else if (num > 0) {
//                System.out.println(num + " positive");
//                postivConunt++;
//            } else {
//                if (num == -1) {
//                    break;
//
//                }
//                System.out.println(+num + " negative");
//                negitvCount++;
//            }
//
//        }
//
//        System.out.println("Positive total: " + postivConunt);
//        System.out.println("negative total: " + negitvCount);
//        System.out.println("Zero total: " + ZerovCount);









        //----      16      ------
//        System.out.print("Enter numbers: ");
//        String num = input.nextLine();
//        System.out.println(num);
//        for (int i = num.length() - 1; i >= 0; i--) {
//            System.out.print(num.charAt(i));
//        }
//



        //----      17      ------
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        while (true) {
//
//            System.out.println("Please enter a number: ");
//            int num1 = input.nextInt();
//            if (num1 == -1) break;
//
//            if (num1 > max) {
//                max = num1;
//            }
//
//
//            if (num1 < min) {
//                min = num1;
//            }
//
//        }
//
//        System.out.println("Max number: " + max + " main number:" + min);





        //----      18      ------

//        String text="Java bootcamp\n";
//        System.out.println(text);
//        int cont=0;
//        for (int i = 0; i <text.length() ; i++) {
//        if (text.charAt(i)=='a'){
//            cont++;
//
//        }
//        }
//
//
//        System.out.println(cont);



    }
}
