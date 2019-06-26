package modelo;

public class Box {

	private Nodo primero;
	private Nodo ultimo;
	private int tamaño;

	  public Box() {
	    ultimo = null;
	    tamaño = 0;
	  }

	  public void enqueue(Object dato) {
		  
	    Nodo nodoNuevo = new Nodo(dato);
	    
	    if (primero == null) {
	      primero = nodoNuevo;
	      ultimo = nodoNuevo;
	    } else {
	      ultimo.setSig(nodoNuevo);
	      ultimo = nodoNuevo;
	    }
	    tamaño++;
	  }; // inserts an object onto the queue

	  public Object dequeue() {
		  
	    if (primero == null)
	      return null;
	    
	    Object o = primero.getDato();
	    primero = primero.getSig();
	    tamaño--;
	    return o;
	  } // gets the object from the queue

	  public boolean isEmpty() {
	    return (tamaño == 0);
	  }

	  public int size() {
	    return tamaño;
	  }

	  public Object primero() {
	    if (primero == null)
	      return null;
	    else
	      return primero.getDato();
	  }
	  
	  public void listar() {
		  Nodo aux = new Nodo();
		  aux = this.primero;
		  do{
		  System.out.print(aux.getDato());
		  aux = aux.getSig();
		  }while (aux != null);		  
	  }
}//Fin clase Box
