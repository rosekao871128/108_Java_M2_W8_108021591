import java.util.Scanner;

public class d{
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        double sum = 0;
        for(double i=1 ; i<=a ; i++){
            sum = sum + Math.pow(2,i);
        }
        System.out.println((int)sum); 
    }
}