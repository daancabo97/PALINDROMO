
package javaapplication19;


public class JavaApplication19 {

    private static int londWorld;

    public static void main(String[] args) {
        String Frase1 = "Anita lava la tina";

        Frase1 = Frase1.toLowerCase().replace(" ", "").replace(", ", "");

        //Contador 
        int counter = 0, longWorld = Frase1.length() - 1;
        boolean esError = false;

        while ((counter < longWorld) && (!esError)) {
            if (Frase1.charAt(counter) == Frase1.charAt(longWorld)) {
                counter++;
                londWorld--;
            } else {
                esError = true;
            }

        }
        if (!esError) {
            System.out.println(Frase1 + " : La Frase1 es un PALINDROMO ");
        } else {
            System.out.println(Frase1 + " : La Frase1 no es un PALINDROMO");
        }
    }
;
}
