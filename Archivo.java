import java.io.*;
import java.util.Scanner;

/**
* Clase Archivo que lee y edita los archivos de texto y diccionario.
* @author Linda Ines Jimenez Vides
* @version 8 de abril de 2022
*/
public class Archivo{
    
    public void leerDiccionario(){
        
        File diccionario = new File("diccionario.txt");
        BufferedReader traduccion = null;

        if(!diccionario.exists()){
            try {
                diccionario.createNewFile();
            } catch (IOException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }

        try {
            FileReader reader = new FileReader("diccionario.txt");
            traduccion = new BufferedReader(reader);
            String texto = traduccion.readLine();
            while(texto != null){
                texto = traduccion.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nDICCIONARIO NO ENCONTRADO\n");
            //TODO: handle exception
        } catch (Exception e) {
            System.out.println("\nERROR EN LA CARGA DE VOCABULARIO\n");
        }

        finally{
            try {
                if(traduccion != null){
                    traduccion.close();
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("\nERROR EN LA CARGA DE CONTENIDO\n");
                System.out.println(e.getMessage());
            }
        }
    }

    public void editarDiccionario(){
        try {
            //Objeto FileWriter para escribir y guradar las publicaciones en el archivo
            FileWriter vocab = new FileWriter("diccionario.txt", true);
            Scanner sn = new Scanner(System.in);

            //.write para guardar en el archivo la infromacion de la publicacion
            System.out.println("Ingrese el vocabulario de la siguiente manera: ingles,espanol,frances:  ");
            String vocabulario = sn.nextLine();
            vocab.write(vocabulario);
            vocab.write("\n");
           
            //Finaliza la escritura en el archivo
            vocab.close();

        } catch(Exception e) {
             System.out.println("NO FUE POSIBLE AGREGAR EL VOCABULARIO! INTENTA DE NUEVO");
        }
    }

    public void editarTexto(){
        try {
            //Objeto FileWriter para escribir y guradar las publicaciones en el archivo
            FileWriter txt = new FileWriter("texto.txt", true);
            Scanner sn = new Scanner(System.in);

            //.write para guardar en el archivo la infromacion de la publicacion
            System.out.println("Ingrese el vocabulario de la siguiente manera: ingles,espanol,frances:  ");
            String oracion = sn.nextLine();
            txt.write(oracion);
            txt.write("\n");
            //Finaliza la escritura en el archivo
            txt.close();

        } catch(Exception e) {
             System.out.println("NO FUE POSIBLE AGREGAR LA ORACION! INTENTA DE NUEVO");
        }
    }

    public void leerTexto(){
        
        File texto = new File("texto.txt");
        BufferedReader oraciones = null;

        if(!texto.exists()){
            try {
                texto.createNewFile();
            } catch (IOException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }

        try {
            FileReader reader = new FileReader("texto.txt");
            oraciones = new BufferedReader(reader);
            String contenido = oraciones.readLine();
            while(contenido != null){
                contenido = oraciones.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nARCHIVO NO ENCONTRADO\n");
            //TODO: handle exception
        } catch (Exception e) {
            System.out.println("\nERROR EN LA CARGA DE ORACIONES\n");
        }

        finally{
            try {
                if(oraciones != null){
                    oraciones.close();
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("\nERROR EN LA CARGA DE CONTENIDO\n");
                System.out.println(e.getMessage());
            }
        }
    }

        public void imprimirDiccionario(){

            String contenido = " ";
    
            try {
                //Creamos un archivo FileReader que obtiene lo que tenga el archivo
                FileReader leer = new FileReader("diccionario.txt");
    
                //El contenido de lector se guarda en un BufferedReader
                BufferedReader cont = new BufferedReader(leer);
    
                //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
                while((contenido = cont.readLine()) != null) {
                System.out.println(contenido);
                }   
            } catch(Exception e) { 
                System.out.println("ERROR EN LA CARGA DE VOCABULARIO");
            }
        }

        public void imprimirTexto(){

            String contenido = " ";
    
            try {
                //Creamos un archivo FileReader que obtiene lo que tenga el archivo
                FileReader leer = new FileReader("texto.txt");
    
                //El contenido de lector se guarda en un BufferedReader
                BufferedReader cont = new BufferedReader(leer);
    
                //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
                while((contenido = cont.readLine()) != null) {
                System.out.println(contenido);
                }   
            } catch(Exception e) { 
                System.out.println("ERROR EN LA CARGA DEL TEXTO");
            }
        }
}