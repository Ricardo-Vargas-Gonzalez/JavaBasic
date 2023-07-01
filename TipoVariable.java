public class TipoVariable {
    
    public static void main (String[] args) {

        double variable1 = 230.89;
        int variable1Entero = (int) variable1;  //cast
        System.out.println(variable1Entero);

        int resultado = (int) variable1 + variable1Entero;
        System.out.println(resultado);
    }
}
