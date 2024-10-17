package Oct17;

import java.util.Scanner;

public class lab4_OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int value= sc.nextInt();

        if(value % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        sc.close();

    }
}
