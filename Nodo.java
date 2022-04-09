/**
* Clase Nodo que inclute a hijos derechos e izquierdos y llave.
* @author Linda Ines Jimenez Vides
* @version 8 de abril de 2022
*/
public class Nodo{
    
    int key;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int item){
        key = item;
        izquierdo = null;
        derecho = null;
    }

}
