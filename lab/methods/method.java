public class method {
    void display(){
        System.out.println("Hello world");
    }
    int add(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        method obj =new method();
        obj.display();
        int x=10;
        int y=20;
        System.out.println(obj.add(x,y));
    }    
}
