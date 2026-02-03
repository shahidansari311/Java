import java.util.*;
public class decimalstr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the decimal: ");
        String sam=sc.nextLine();
        System.out.println(dec(sam));
    }
    public static String dec(String sa){
        int pos=sa.indexOf('.');
        if(pos<0){
            return " ";
        }
        else{
            return sa.substring(pos+1);
        }
    }
}
