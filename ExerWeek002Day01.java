import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExerWeek002Day01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //----   1   -----

//        System.out.println("Enter size ArraY please: ");
//        int size=input.nextInt();
//        int[] checkArray = new int[0];
//        if (size>=2){
//            checkArray=new int[size];
//            for (int i = 0; i <checkArray.length ; i++) {
//                System.out.print("Please Enter number: ");
//                int num=input.nextInt();
//                checkArray[i]=num;
//            }
//            System.out.println("First: "+checkArray[0]);
//            System.out.println("last: "+checkArray[checkArray.length-1]);
//            System.out.println("-----------------------");
//            if (checkArray[0]==checkArray[checkArray.length-1]){
//                System.out.println("True\t:)");
//            }else {
//                System.out.println("False\t:(");
//            }
//            System.out.println("-----------------------");
//        }else{
//            System.out.println("indexofBound!!");
//        }
//


        //----   2   -----
//
//        int[] array = {101, 4, 17, 7, 25, 3, 100};
//        int sum=0,avge=0;
//        System.out.print("old  array  : ");
//        for (int i = 0; i <array.length ; i++) {
//            System.out.print(array[i]+" ");
//            sum+=array[i];
//        }
//
//        for (int i = 0; i < array.length -1; i++) {
//        if (array[i]>array[i+1]){
//            int temp = array[i];
//            array[i] = array[i + 1];
//            array[i + 1] = temp;
//        }
//        }
//        System.out.println("\n");
//        System.out.print("new array Sort: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }
//        System.out.println("\n");
//        System.out.println("Sum: "+sum);
//        System.out.println("-------------");
//        System.out.println("The average of the said array is: "+sum/array.length);
//        System.out.println("The numbers in the said array that are greater than the average are:"+array[array.length-2]+" "+array[array.length-1]);
//


        //----   3   -----
//        int[] array = {20, 51, 40,3,4,14};
//        System.out.println("\n");
//        System.out.print("new array Sort: ");
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1]) {
//                int temp = array[i];
//                array[i] = array[i + 1];
//                array[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("\n-------------");
//        System.out.println("Larger value between first and last element: "+array[array.length-1]);
//        System.out.println("\n-------------");
// int max = Arrays.stream(array).max().getAsInt();
// System.out.println("Maximum value in the array: " + max);


        //----   4   -----
//    int[] arra={20, 30,3,100,15,10,500, 40};
//              //min //j
//     System.out.print("old  array  : ");
//        for (int i = 0; i <arra.length ; i++) {
//            System.out.print(arra[i]+" ");
//        }
//
//
//        for (int i = 0; i <arra.length-1; i++) {
//            int Max=i;
//            for (int j = Max; j <arra.length-1 ; j++) {
//                if (arra[Max] < arra[j+1]) {
//                    int temp = arra[Max];
//                    arra[Max] =  arra[j+1];
//                    arra[j+1] = temp;
//                }
//            }
//        }
//
//
//        System.out.println("\n");
//        System.out.println("----------------------");
//        System.out.print("\nNew  array  : ");
//        for (int i = 0; i <arra.length ; i++) {
//            System.out.print(arra[i]+" ");
//        }


        //----   5   -----
//        int [] array={2,3,40,1,5,9,4,10,7};
//        for (int i = 0; i <array.length; i++) {
//            System.out.print(array[i]+" " );
//        }
//        for (int i = 0; i <array.length ; i++) {
//            int odd=i;
//            for (int j = odd; j <array.length-1 ; j++) {
//                if (array[odd]%2!=0){
//                    int temp=array[odd];
//                    array[odd]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }
//
//
//        System.out.println("\n-----------");
//        for (int i = array.length-1; i >=0 ; i--) {
//            System.out.print(array[i]+" ");
//        }


        //----   6   -----
//
//        int[] arryOne = {2, 3, 6, 6, 4};
//        System.out.print("arryOne: ");
//        for (int i = 0; i < arryOne.length; i++) {
//            System.out.print(arryOne[i] + " ");
//        }
//        int[] arryTwo = {2, 3, 6, 6, 4};
//        System.out.print("\narryTow: ");
//        for (int i = 0; i < arryTwo.length; i++) {
//            System.out.print(arryTwo[i] + " ");
//        }
//        int counTrue = 0;
//
//        for (int i = 0; i < arryOne.length; i++) {
//            for (int j = i; j < arryTwo.length; j++) {
//                if (arryOne[i] == arryTwo[i]) {
//                    counTrue++;
//                    break;
//                }
//
//            }
//        }
//        System.out.println("\nconutFalse: " + counTrue);
//        System.out.println("\n--------------- ");
//        if (counTrue == arryTwo.length) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }







    }
}
