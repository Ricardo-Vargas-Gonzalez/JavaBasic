public class condicionales {
    public static void main(String[] args) {
        System.out.println("hello world!");

        int edad = 28;
        int cantidad = 2;

        if (edad >= 18) {
            System.out.println("You can enter");
        }
        else {
            if (cantidad >= 2) {
                System.out.println("You're younger, but you can enter");
            }
            System.out.println("You can´t come inside");
        }
    
    }
}
