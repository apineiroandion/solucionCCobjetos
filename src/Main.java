public class Main {
    static Integer contador = 0;
    static final Object lock = new Object();

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}