import java.util.*;

/**
* Clase Archivo que lee los archivos de texto y diccionario.
* @author Linda Ines Jimenez Vides
* @version 8 de abril de 2022
*/
public class Main {
    public static void main(String[] args) {
        
        Archivo archivo = new Archivo();
        BinaryTree bt = new BinaryTree();
        Vista vista = new Vista();

        int opcion = 0;

        while (opcion != 5){

            opcion = vista.menu();
 
            if (opcion == 1){
 
             
 
            } else if (opcion == 2){
 
             
 
            } else if (opcion == 3){
 
                archivo.editarDiccionario();
                archivo.imprimirDiccionario();
                 
            } else if(opcion == 4){

                archivo.editarTexto();
                archivo.imprimirTexto();

            } else if(opcion == 5){

                vista.salir();

            }
        }
    }   
}
