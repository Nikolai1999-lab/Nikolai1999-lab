public class Factorial {
    public static void main(String[] args) {
        int a = 0, f = 1;
        int[] massif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (a = 0; a < 10; a++) {
            f = f * massif[a];
        }
        System.out.println("10! = " + f);
    }
}
