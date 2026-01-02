public class Two {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
        }

        // another way using bit manipulation
        for (int i = 1; i < 50; i++) {
            if ((i & 1) == 0) {
                System.out.println(i + " is an even number");
            }
        }
    }
}
