
package proyecto_1_2023;
import javax.swing.JOptionPane;

/**
 *
 * @author yoita5
 */
public class ListaProductos {
    private NodoLista inicio;
    private NodoLista fin;
    private NodoLista nombre;
    private NodoLista cantidadProducto;
    private NodoLista almacen;
    int Tamano;

    public ListaProductos(NodoLista inicio, NodoLista fin, NodoLista nombre, NodoLista cantidadProducto, NodoLista almacen, int Tamano) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
        this.cantidadProducto = cantidadProducto;
        this.almacen = almacen;
        this.Tamano = Tamano;
    }
    
    public ListaProductos(){
        this.inicio = null;
        this.fin = null;
        this.Tamano = 0;
    }  
    
    public boolean esta_vacia(){
        return getInicio() == null;
    }
    
    public void Imprimir(){
        if(!esta_vacia()){
            NodoLista aux = inicio;
            for (int i = 0; i < Tamano; i++) {
                System.out.println(aux.getData()+"");
                aux = (NodoLista) aux.getSiguiente();
            }
        }else{
            System.out.println("Lista Vacia");
        }
    }
    
    public void mostrar_elementos(){
        if(esta_vacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia.");
        }
        else{
            NodoLista temporal;
            temporal = (NodoLista) getInicio();
            String mostrar_completo = "";
            for (int i=0; i < getTamano(); i++){
                mostrar_completo += "Nombre: " + temporal.getNombre() + "\n";
                temporal = temporal.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,mostrar_completo);
        }
    } 

    public NodoLista getInicio() {
        return inicio;
    }

    public void setInicio(NodoLista inicio) {
        this.inicio = inicio;
    }

    public NodoLista getFin() {
        return fin;
    }

    public void setFin(NodoLista fin) {
        this.fin = fin;
    }

    public NodoLista getNombre() {
        return nombre;
    }

    public void setNombre(NodoLista nombre) {
        this.nombre = nombre;
    }

    public NodoLista getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(NodoLista cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public NodoLista getAlmacen() {
        return almacen;
    }

    public void setAlmacen(NodoLista almacen) {
        this.almacen = almacen;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }
    
    
}
