import java.util.Scanner;

public class c{
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for(int i=1 ; i<=a ; i++){
            if(a%i == 0){
                System.out.println(i);     
            }
        }
    }
}