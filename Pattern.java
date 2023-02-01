public class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 14; j++) {
                if (j == 0 || j == 6 || j == 13 || (i > 0 && i < 6 && (j == i || j == 13 - i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}