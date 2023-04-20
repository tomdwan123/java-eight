package defaults;

public interface Interface4 extends Interface3 {

    default void methodD() {

        System.out.println("Inside Method D");
    }
}
