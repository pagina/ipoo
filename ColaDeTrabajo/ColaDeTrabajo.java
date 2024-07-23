package practico4IPOO.ej3;
import java.util.LinkedList;
import java.util.Queue;
/** Cree la clase ColaDeTrabajo que permite encolar diversos trabajos. O sea, los trabajos a
encolar deben implementar la interfaz Trabajo. Defina en la clase ColaDeTrabajo un
método sacar() que retorna el próximo trabajo a procesar. Además, agregue en dicha
clase los atributos nombre y lista que representan el nombre de la cola y si está lista o no para retornar trabajos. 
Tenga presente, que cuando no existan trabajos en la cola o
cuando la misma no esté lista se debe lanzar las siguientes excepciones:
NoListaException y SinTrabajoEnColaException
Implementar la clase ColaDeTrabajo y definir el método sacar() en dicha clase.
b) ¿Cómo se lanzan las excepciones anteriores dentro del método?
c) ¿Cómo se capturan las excepciones al llamar al método sacar()?*/
public class ColaDeTrabajo implements Trabajo{

    private String nombre;
    private boolean lista = false;
    private Queue<Trabajo> cola = new LinkedList<Trabajo>();

    public ColaDeTrabajo(String nombre, boolean lista){
        this.nombre = nombre;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getLista() {
        return lista;
    }

    public void setLista(boolean lista) {
        this.lista = lista;
    }

    public Queue<Trabajo> getCola() {
        return cola;
    }

    public void setCola(Queue<Trabajo> cola) {
        this.cola = cola;
    }

    public void encolar(Trabajo t){
        cola.add(t);
    }

    public void sacar() throws SinTrabajoEnColaException,NoListaException{
        if (size() == 0){
            throw new SinTrabajoEnColaException(nombre);
        }
        if(!lista){
            throw new NoListaException(nombre, cola.size());
        }
        cola.remove();
    }

    public int size(){
        return cola.size();
    }

    public boolean isEmpty(){
        return cola.isEmpty();
    }
 
    public static void main(String[] args) {
        ColaDeTrabajo c1 = new ColaDeTrabajo("mamiol1",false);
        c1.encolar(new Trabajo() {});
        try{
            c1.sacar(); //metodo que puede lanzar la excepción
        }catch(NoListaException e){ //capturamos una de las 2 excepciones a ver si es
            e.getMessage(); //la manejamos con getMessage
        }catch(SinTrabajoEnColaException e){ //capturamos la 2 excepcion a ver si es
            e.getMessage();//la manejamos
        }
    }
}

