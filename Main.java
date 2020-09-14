import java.util.Scanner;
/**
 * This program helps calculate the slope of a line given two points
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for the user
    Scanner input = new Scanner(System.in);

    // ask user to enter in the x coordinate of the first point
    System.out.println("Please enter in the x coordinate of the first point");

    int point1 = input.nextInt();

    System.out.println("Please enter in the y coordinate of the first point");

    int point2 = input.nextInt();

    System.out.println("Please enter in the x coordinate of the second point");

    int point3 = input.nextInt();

    System.out.println("Please enter in the y coordinate of the second point");

    int point4 = input.nextInt();
    
    int total1 = point4 - point2;
    int total2 = point3 - point1;

    double total3 = total1 / total2;

    System.out.println("The slope of your line would be " + total3 + ".");
  }
}
