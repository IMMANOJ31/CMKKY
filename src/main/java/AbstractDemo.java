public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        A a;
        a=b;
        a.display();
    }
}
abstract class A{
    abstract void display();
}

class B extends A{
    void display(){
        System.out.println("Inside class B");
    }
}
