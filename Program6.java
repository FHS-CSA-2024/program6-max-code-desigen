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
        
        
        radius = ((int)(radius*1000+0.5));
        radius = (radius/1000);
        
        diameter = ((int)(diameter*1000+0.5));
        diameter = (diameter/1000);
        
        area = ((int)(area*1000+0.5));
        area = (area/1000);
        
        circumference = ((int)(circumference*1000+0.5));
        circumference = (circumference/1000);
        
        
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = "+ area);
        System.out.println("The Circumference of the circle = " + circumference);      
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
