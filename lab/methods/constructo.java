
public class constructo {
    static class A{
        int a;
        String name;
        A(){
            a=0;
            name="Shahid";
        }
        void display(){
            System.out.println(a+" "+name);
        }
    }
    public static void main(String[] args) {
        A obj=new A();
        obj.display();
    }
}
