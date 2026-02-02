import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Your name: "+s);
        int a=sc.nextInt();
        System.out.println(a);
        float b=sc.nextFloat();
        System.out.println(b);

        int z=10;
        System.out.format("Value of x = %d\n",z);
        System.out.format("Value of x = %d and value of a=%d\n",z,a);
        sc.close();
    }
    
}
