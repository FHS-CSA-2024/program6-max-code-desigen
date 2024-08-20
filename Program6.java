//import stuff here!

//Your code here
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();

    
        double diameter = 2 * radius;
        double area = (PI)*(radius*radius);
        double circumference = PI*diameter; 

        
        System.out.printf("The Radius of the circle = %.3f%n", radius);
        System.out.printf("The Diameter of the circle = %.3f%n", diameter);
        System.out.printf("The Area of the circle = %.3f%n", area);
        System.out.printf("The Circumference of the circle = %.3f%n", circumference);      
    }
}


//Paste console output below:
/*
Enter the radius: 
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323

*/
