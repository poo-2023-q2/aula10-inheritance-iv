package override_overload;

/**
 * A classe A eh uma classe base que define
 * 3 versoes sobrecarregadas do metodo m1.
 * 
 */
public class A {
    public void m1() {
        System.out.printf("Called m1 at %s.\n", 
            "A");
    }

    public void m1(int p1) {
        System.out.printf("Called m1 with %d\n", p1);
    }

    public void m1(int p1, int p2) {
        System.out.printf("Called m1 with %d %d\n", p1, p2);
    }
}