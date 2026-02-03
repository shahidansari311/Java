import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the decimal: ");
        String sam=sc.nextLine();
        String sam2=sc.nextLine();
        System.out.println(ana(sam,sam2));
    }
    public static Boolean ana(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<s1.length();i++){
            if(a1[i]==a2[i]){
                return true;
            }
        }
        return false;
    }
}
