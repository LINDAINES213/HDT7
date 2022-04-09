public class BinaryTree<E>{

    protected E val;
    protected BinaryTree<E> padre;
    protected BinaryTree<E> izquierdo, derecho;

    public BinaryTree(){
        val = null;
        padre = null;
        izquierdo = null;
        derecho = null;
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

    
