import java.io.*;

/**
* Clase Archivo que lee los archivos de texto y diccionario.
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
}