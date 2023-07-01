public class scope {
    public static void main(String[] args) {
        System.out.println("hello world!");

        int edad = 28;
        int cantidadPersonas = 2;
        // System.out.println("Te value of conditional is:" + esPareja);
        // sysout = atajo para System.out.println();

        boolean esPareja;
        
        if(cantidadPersonas > 1) {
            esPareja = true;
        } else {
            esPareja = false;
        }
        boolean puedeEntrar =  edad >= 18 && esPareja;

        if (puedeEntrar ) {
            System.out.println("You can enter");
        } else {
            System.out.println("You can´t come inside");
        }
    
    }
}
