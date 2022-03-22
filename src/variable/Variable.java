
package variable;


public class Variable {

   
    public static void main(String[] args) {
        int numero = 5;
        String nombre = "Ibra";
        char letra = 'l';
        double temperatura = 38.5;
        boolean SiONo = false;
        long largo = 123456789;
        
        System.out.println(numero);
        System.out.println(nombre);
        System.out.println(letra);
        System.out.println(temperatura);
        System.out.println(SiONo);
        System.out.println(largo);
        System.out.println("************************************************");

        
        int num1, num2, resultado;
        num1 = 4;
        num2 = 2;
        resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("************************************************");

        int num3, num4;
        num3 = 15;
        num4 = 10;
        
        if (num3 > num4) {
            System.out.println("El num3 es mayor al num4");
            System.out.println("************************************************");

        }
        
        else {
            if (num3 == num4) {
                System.out.println("El num3 es igual al num4");
                System.out.println("************************************************");

            }
            else {
                System.out.println("El num3 es menor al num4");
                System.out.println("************************************************");
            }
 
        }
        
        
    }
    
}
