package override_overload;
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.m1();
        a.m1(10, 20);
        System.out.println();
        b.m1();

        b.m1();
        b.m1(10);
        b.m1(10, 20);
        // b.m1(true);
    }
}