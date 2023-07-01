public class Condicionales2 {
    public static void main(String[] args) {
        System.out.println("hello world!");

        int edad = 28;
        int cantidadPersonas = 2;

        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar =  edad >= 18 && esPareja;

        if (puedeEntrar ) {
            System.out.println("You can enter");
        } else {
            System.out.println("You can´t come inside");
        }
    
    }
}
