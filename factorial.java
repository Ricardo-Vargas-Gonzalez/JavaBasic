public class factorial {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i < 11; i++) {
            factorial *= i;
            System.out.println("factorial de " +i + "=" + factorial);
        }
    }
}
