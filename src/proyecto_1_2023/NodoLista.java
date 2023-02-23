
package proyecto_1_2023;

/**
 *
 * @author yoita5
 */
public class NodoLista {
    
    private NodoLista siguiente;
    private NodoLista anterior;
    private String nombre;
    private int cantidadProducto;
    private String almacen;

    public NodoLista(NodoLista siguiente, NodoLista anterior, String nombre, int cantidadProducto, String almacen) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.nombre = nombre;
        this.cantidadProducto = cantidadProducto;
        this.almacen = almacen;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }
    
    public String getData(){ 
        String Data = null;
        return Data;
    }

}
