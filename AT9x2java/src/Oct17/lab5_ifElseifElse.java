package Oct17;

import java.util.Scanner;

public class lab5_ifElseifElse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //x>y
        //x<y
        //x==y
        System.out.println("Enter x value");
        int x= sc.nextInt();
        System.out.println("Enter y value");
        int y= sc.nextInt();

        if(x>y){
            System.out.println("x>y");
        }
        else if(x<y){
            System.out.println("x<y");
        }
        else {
            System.out.println("x==y");
        }
         sc.close();
    }
}
