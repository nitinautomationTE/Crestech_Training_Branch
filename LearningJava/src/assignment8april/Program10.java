package assignment8april;

public class Program10 {

    public static void main(String[] args) {
        for(int i=1;i<5;i++)
        {
            for(int j=4;j>=i;j--) {
                System.out.print(" ");
            }
                
        
            for(int p=1;p<i*2;p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int k=1;k<5;k++)
        {
            for(int x=1;x<=k;x++) {
                System.out.print(" ");
            }
            
        
            for(int y=9;y>k*2;y--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}