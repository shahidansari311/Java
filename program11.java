import java.util.*;
public class program11{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.print("Positive ");
            if(a%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        else if(a<0){
            System.out.print("Negative ");
            if(a%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        else{
            System.out.print("Zero");
        }
    }
}