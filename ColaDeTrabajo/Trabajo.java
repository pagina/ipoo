package practico4IPOO.ej3;

public interface Trabajo {

    //metodos definidos de una Cola.
    public void encolar(Trabajo t);
    public void sacar(Trabajo t) throws SinTrabajoEnColaException, NoListaException;
    public int size();
    public boolean isEmpty();
}
