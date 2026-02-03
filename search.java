import java.util.*;
public class search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String your want to enter: ");
        String sam=sc.nextLine();
        System.out.print("Enter Pattern your want to enter: ");
        String pat=sc.nextLine();
        
        patt(sam,pat);
        
    }   
    public static void patt(String txt,String pat){
        int pos=txt.indexOf(pat);
        while(pos>=0){
            System.out.print(pos+" ");
            pos=txt.indexOf(pat,pos+1);
        }
        System.out.println();
    } 
}
