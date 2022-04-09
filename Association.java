import java.util.Map.Entry;

/**
* Clase Archivo que lee los archivos de texto y diccionario.
* @author Linda Ines Jimenez Vides
* @version 8 de abril de 2022
* Referencia: //http://www.cs.williams.edu/JavaStructures/doc/structure5/structure5/Association.html
*/
public class Association<K, V> {
    
    private V value;
    private K key;
    private Association<K, V> izquierdo;
    private Association<K, V> derecho;
    private Association<K, V> padre;

    public Association(K key){
        this(key, null);
    }

    /*public String toString(){
        StringBuffer s = new StringBuffer();
        s.append("< Association: " + getKey() + " = " + getValue()+" >");
        return s.toString();
    }*/

    public Association(K key, V value){
        setKey(key);
        setValue(value);
        setIzquierdo(null);
        setDerecho(null);
        setPadre(null);
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key){
        this.key = key;
    }

    public Association<K, V> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Association<K, V> izquierdo){
        this.izquierdo = izquierdo;
    }

    public Association<K, V> getDerecho(){
        return derecho;
    }
    
    public void setDerecho(Association<K, V> derecho){
        this.derecho = derecho;
    }

    public Association<K, V> getPadre(){
        return padre;
    }
    
    public void setPadre(Association<K, V> padre){
        this.padre = padre;
    }
}
