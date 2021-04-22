import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Height(M):");
    double height = in.nextDouble();

    Scanner weight2 = new Scanner(System.in);
    System.out.println("Enter Weight(Kg):");
    double weight = weight2.nextDouble();

    double bmi =  weight / (height * height);

  System.out.println( "your BMI is:" + bmi);

  }
}
