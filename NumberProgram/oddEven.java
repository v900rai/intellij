package NumberProgram;

import java.util.Scanner;

public class oddEven {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" its even number");
        }
        else {
            System.out.println(num+" its odd number");
        }

    }
}
