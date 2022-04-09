import java.util.Scanner;

/**
* Clase Vista que muestra la vista del programa al usuario.
* @author Linda Ines Jimenez Vides
* @version 8 de abril de 2022
*/
public class Vista {

    Scanner sn = new Scanner(System.in);

    /**
     * Metodo que muestra el menu
    */
    public int menu(){
        
        int opcion;

        System.out.println();
        System.out.println();
        System.out.println("------------ TRADUCTOR ESPANOL - INGLES - FRANCES ------------");
        System.out.println();
        System.out.println("Bienvendo al traductor de espanol - ingles - frances");
        System.out.println("Hora de Empezar! Elija una opcion:");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------");

        String menuPrincipal =  "1. Traduccion ingles - espanol\n" + 
                                "2. Traduccion ingles - frances\n" + 
                                "3. Agregar Vocabulario a Diccionario\n" +
                                "4. Agregar / eliminar texto a traducir\n" +
                                "5. Salir\n";

        System.out.println(menuPrincipal);
        opcion = sn.nextInt();
        return opcion;
    }

    /**
     * Metodo que muestra el mensaje de despedida
    */
    public void salir(){
        System.out.println("Gracias por utilizar el traductor!");
    }
}
