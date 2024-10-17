package Oct17;

import java.util.Scanner;

//Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
//
//side1, side2, side2 → eq, iso, scalene
public class triAngleTypes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of A:");
        int A=sc.nextInt();
        System.out.println("Enter value of B:");
        int B=sc.nextInt();
        System.out.println("Enter value of C:");
        int C=sc.nextInt();
        if(A == B && B==C){
            System.out.println("Equilateral triangle");
        }
        else if((A ==B || A  == C )||(B==C ||B==A )){
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }
    }
}
