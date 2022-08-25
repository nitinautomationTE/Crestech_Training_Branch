package basic;


import java.util.Arrays;

class MyntraPro
{
    static int totalCustomers;
    static int count = 10;
    static int arr[] = new int[10];
    static int id;
    int customerId;
    
    Myntra(int cartValue)
    {
        totalCustomers++;
        customerId = this.totalCustomers;
        
        if(cartValue >= 1000 && count>0)
        {    System.out.println("WOAH!! Coupon Applied!!");
            System.out.println("Customer id: "+customerId);
            arr[id] = customerId;
            id++;
            count--;
        }
        else
            System.out.println("Sorry, Coupon not applied!");
    }
}


public class Myntra {
    
    public static void main(String args[]) {
        Myntra m1 = new Myntra(1000);
        Myntra m2 = new Myntra(2000);
        Myntra m3 = new Myntra(2000);
        Myntra m4 = new Myntra(500);
        Myntra m5 = new Myntra(2000);
        Myntra m6 = new Myntra(2000);
        Myntra m7 = new Myntra(300);
        Myntra m8 = new Myntra(2000);
        Myntra m9 = new Myntra(2000);
        Myntra m10 = new Myntra(600);
        Myntra m11 = new Myntra(2000);
        Myntra m12 = new Myntra(2000);
        Myntra m13 = new Myntra(1000); //10
        Myntra m14 = new Myntra(2000);
        Myntra m15 = new Myntra(500);
        
        System.out.println(Myntra.count);
        System.out.println(Myntra.totalCustomers);
        System.out.println("Coupon applied for Customer Ids: "+Arrays.toString(Myntra.arr));
        
        /*
        for(int i=0; i<10; i++)
        {
            System.out.println("Array: "+Myntra.arr[i]);
        }*/
    }
    