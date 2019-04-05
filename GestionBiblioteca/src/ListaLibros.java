
/**
 * Lista de libro de una biblioteca
 * 
 * @author Jaime Zaloña
 * @version 1.0
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor 
     */
    public ListaLibros()
    {      
        primero = null;
    }
    
    
    
    /**
     * Método que incluye un nuevo libro en la lista
     *
     * @param valor Libro a incluir en la lista
     */
    public void pon( Libro valor){
        Libro nuevo = valor;
        nuevo.siguiente = primero;
        primero = nuevo;
        
    }
    
    /**
     * Método que devuelve si la lista esta vacia
     *
     * @return true si esta vacia
     */
    public boolean estaVacia(){
        return(primero == null);
          
    }
    
   
    /**
     * Método que devuelve un libro que es eliminado de la lista o null si no exite
     *
     * @param id Identificador o clave del libro
     * @return El valor de retorno
     */
    public Libro quitar ( int id ) {
       Libro aux = primero;
       
       if (estaVacia()) return null;
       
       if ( primero.id == id) {
           aux = primero;
           primero = primero.siguiente;
        }
       
        
        Libro p2 = primero;
        Libro p1 = primero.siguiente; //Puntero
        
        while ( p1 != null) {
            
            if ( p1.id == id ){
                p2.siguiente = p1.siguiente;
                aux = p1;   
            }
            
            p2 = p1;
            p1 = p1.siguiente;
        }
       return aux;
    }
       
    // 
    /**
     * Metodo que devuelve el id del libro o -1 si no esta
     *
     * @param titulo Titulo del libro
     * @return id del libro
     */
    public int buscarId ( String titulo ){
       int aux=0;
       
       //La lista esta vacia
       if (estaVacia()) {
           aux = -1;
        }
       
       //El libro buscado es el primero de la lista
       if ( titulo.equals(primero.titulo)) {
           aux = primero.id;
        }
             
        Libro p2 = primero;
        Libro p1 = primero.siguiente;//Puntero
        
        while ( p1 != null) {
            
            if ( titulo.equals(p2.titulo)){  
                aux = p1.id;
                break;
            }
            p2 = p1;
            p1 = p1.siguiente;
            
        }
        return aux;
    }
        
    // 
    /**
     * Metodo que muestra los libros almacenados
     *
     */
    public void verCatalogo (){
        Libro p2 = primero;
        Libro p1 = primero.siguiente;//Puntero
        
        while ( p1 != null) {
         System.out.println("-> " +p2);
         
         System.out.println("");  
            p2 = p1;
            p1 = p1.siguiente;
        }
    }
         
    

}
