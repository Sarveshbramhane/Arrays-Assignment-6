import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrays{
  public static void main(String[] args) {
    
  
//create an array
  // initialize an array using scanner and for loop
  // iterate the values using for each loop
  Scanner s=new Scanner(System.in);
        System.out.println("Enter the length:");
        int len=s.nextInt();
        int []arr=new int [len];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value for index:"+i);
            arr[i]=s.nextInt();
        }
        System.out.println("Here your intered array values");
        System.out.println(Arrays.toString(arr));
        
      }
    }
