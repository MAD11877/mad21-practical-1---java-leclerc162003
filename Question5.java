import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    ArrayList<Integer> intset = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter Integer: ");
    int integer = in.nextInt();

    for(int j=1; j <= integer; j ++){
      Scanner set = new Scanner(System.in);
      //System.out.printf("Enter Integer %s: ", j);
      int setin = set.nextInt();
      intset.add(setin);
    }
    int maxvalue = 0;
    int maxcount = 0;
    for(int k=1; k < intset.size(); ++k){
      int count = 0;
      for(int p=1; p< intset.size(); ++p){
        if(intset.get(k) == intset.get(p)){
          ++count;
        }

      }
      if (count > maxcount){
        maxcount = count;
        maxvalue = intset.get(k);
      }
    }
    System.out.println(maxvalue);
  }

}
