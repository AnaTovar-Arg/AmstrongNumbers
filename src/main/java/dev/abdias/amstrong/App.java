package dev.abdias.amstrong;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println(Amstrong.isAmstrongNumnb(371 ));
        System.out.println(Amstrong.isAmstrongNumnb(1634 ));
        System.out.println(Amstrong.isAmstrongNumnb(351 ));
        System.out.println(Amstrong.isAmstrongNumnb(2015 ));
    }
}
