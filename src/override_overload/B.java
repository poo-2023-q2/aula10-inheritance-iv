package override_overload;

/**
 * A classe B eh uma classe derivada de A
 * que prove:
 * 
 * - uma sobrescrita do metodo m1 (da versao com 0 argumentos)
 * - duas versoes sobrecarregadas do metodo m1
 */
public class B extends A {

    @Override
    public void m1() {
        super.m1();
        System.out.printf("Called m1 at %s.\n", 
            getClass().getName());
    }

    public void m1(boolean p1, int p2) {
        super.m1();
        System.out.printf("Called m1 at %s with %b.\n", 
            getClass().getName(), p1);
    }

    public boolean m1(int p2, boolean p1) {
        return p1;
    }
}