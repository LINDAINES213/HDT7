/**
* Clase BinaryTree que tiene todas funciones de un arbol binario.
* @author Linda Ines Jimenez Vides
* @version 8 de abril de 2022
* Referencia: https://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
*/
public class BinaryTree<E>{

    protected E val;
    protected BinaryTree<E> padre;
    protected BinaryTree<E> izquierdo, derecho;
    Nodo raiz;

    public BinaryTree(){
        val = null;
        padre = null;
        izquierdo = null;
        derecho = null;
        raiz = null;
    }

    public void deleteKey(int key){
        raiz = deleteRec(raiz, key);
    }

    Nodo deleteRec(Nodo raiz, int key){
        if(raiz == null)
            return raiz;

        if (key < raiz.key)
            raiz.izquierdo = deleteRec(raiz.izquierdo, key);
        else if (key > raiz.key)
            raiz.derecho = deleteRec(raiz.derecho, key);

        else{
            if(raiz.izquierdo == null)
                return raiz;
            else if (raiz.derecho == null)
                return raiz.izquierdo;
            raiz.key = minVal(raiz.derecho);

            raiz.derecho = deleteRec(raiz.derecho, raiz.key);
        }   
        return raiz;
    }

    public int minVal(Nodo raiz){

        int minv = raiz.key;
        while(raiz.izquierdo != null){
            minv = raiz.izquierdo.key;
            raiz = raiz.izquierdo;
        }
        return minv;
    }

    public BinaryTree(E value){
        val = value;
        izquierdo = derecho = new BinaryTree<E>();
        setIzquierdo(izquierdo);
        setDerecho(derecho);
    }

    public BinaryTree(E value, BinaryTree<E> izquierdo, BinaryTree<E> derecho){
        val = value;
        if(izquierdo == null){
            izquierdo = new BinaryTree<E>();
        }
        setIzquierdo(izquierdo);
        if(derecho == null){
            derecho = new BinaryTree<E>();
        }
        setDerecho(derecho);
    }

    public void InOrder(){ 
        InOrderRec(raiz); 
    }
 
    // A utility function to do inorder traversal of BST
    public void InOrderRec(Nodo raiz)
    {
        if (raiz != null) {
            InOrderRec(raiz.izquierdo);
            System.out.print(raiz.key + " ");
            InOrderRec(raiz.derecho);
        }
    }

    public void setIzquierdo(BinaryTree<E> newIzquierdo){
        if(isEmpty()) return;
        if(izquierdo != null && izquierdo.padre() == this) izquierdo.setPadre(null);
        izquierdo = newIzquierdo;
        izquierdo.setPadre(this);
    }

    protected void setPadre(BinaryTree<E> newPadre){
        if(isEmpty()){
            padre = newPadre;
        }
    }

    public void setDerecho(BinaryTree<E> newDerecho){
        if(isEmpty()) return;
        if(derecho != null && derecho.padre() == this) derecho.setPadre(null);
        derecho = newDerecho;
        derecho.setPadre(this);
    }

    public void setValue(E value){
        val = value;
    }

    public BinaryTree<E> izquierdo(){
        return izquierdo;
    }
    
    public BinaryTree<E> derecho(){
        return derecho;
    }

    public E value() {
        return val;
    }

    public BinaryTree<E> padre(){
        return padre;
    }

    public boolean isEmpty(){
        if(val == null){
            return true;
        } else{
            return false;
        }
    }

    

}

    
