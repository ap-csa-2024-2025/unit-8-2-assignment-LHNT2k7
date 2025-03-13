import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    double[] arr = new double[5];
    String[] arrs = new String[6];



    // TODO: Make an array of Strings, and test your averageLength method

    // TODO: Make an array of ints, and test your arrayMax method

    // TODO: Make an array of Strings as well as a target, and test your linearSearch method
  }


  public static double sumArray(double[] arr)
  {
    double sum = 0.0;
    for(int row = 0, row < arr.length; row++)
    {
       sun += arr[i];
    }
     return sum;
  }

  public static double averageLength(String[] arr)
  {
    double average = 0.0;
    for(String n : arrs)
    {
      average += n.length();
    }
    return average/(arrs.length);
  }

  public static int arrayMax(int[] arr)
  {
    int maxIndex = 0
    for (int n : arrss)
    {
      if (n.length() > maxIndex.length())
      {
        maxIndex = n.getIndex();
      }
    }
    return maxIndex;
  }

  public static boolean linearSearch(String[] arr,String target)
  {
    for (i=0;i<arr.length;i++)
    {
      if(arr[i].equals(target))
      {
        return true;
      }
    }
    return false;
  
}
