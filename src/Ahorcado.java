import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
                //Clase scanner que nos permite que el usario escriba
        Scanner scanner = new Scanner(System.in);
        
        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
  
        //estructura de control tipo interativa (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
           letrasAdivinadas[i] = '_';
        }

         //otra estructura de control tipo interativa (bucle) en este caso while
            
         while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("introduce una letra por favor!!");
           
           //usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

              //estructura de control iterativa bucle for  
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estructura de control condicional if
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i]= letra;
                    letraCorrecta = true;
                }               
            }
            if(!letraCorrecta){
                intentos ++;
                System.out.println("Incorrecto!!! te quedan: " + (intentosMaximos - intentos) + " intentos.");
            }
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("FELICIDADES!!! has adivinado la palbra secreta: " + palabraSecreta);
            }
         } 
            if(!palabraAdivinada){
                System.out.println("¡Que pena, te has quedado sin intentos! GAME OVER!!");
            }
             scanner.close();   
    }
}
