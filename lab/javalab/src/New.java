public class New {
    void display(){
        System.out.println("Hello world");
    }
    int add(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        New obj =new New();
        obj.display();
        int x=10;
        int y=20;
        System.out.println(obj.add(x,y));
    }    
}
