package assignment8april;
import java.util.Scanner;

import java.util.Scanner;

public class TrianglePattern19
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        obj.close();
        //int num = 4;
        int temp = num-1;
        
        for(int i=0; i<num-1; i++)
        {
            for(int j=0; j<temp; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=0; k<(2*i)-1; k++)
            {
                System.out.print(" ");
            }
            if(i>0)
                System.out.print("*");
            System.out.print("\n");
            temp--;
        }
        for(int j=0; j<(2*num)-1; j++)
            System.out.print("*");
    }
}
