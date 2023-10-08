package array;

import java.util.Scanner;

public class copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n=sc.nextInt();

        int [] a=new int [n];
                int [] b=new int [n];

        System.out.println(" enter the array :");
        for(int i =0;i<a.length;i++){
           a [i]=sc.nextInt();
    }

    for(int i =0;i<a.length;i++){
        b[i]=(a[i]);
 }
 System.out.println("the copied array is:");
 for(int i =0;i<a.length;i++){
System.out.println(b[i]); }
}
}