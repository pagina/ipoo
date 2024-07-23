package practico3IPOO.ej3Reimplementar;

public interface FiguraGeometrica {

    public double area();//devuelve el area de la figura.
    public Punto origen();//devuelve el obj Punto de cada figura.
    public void mover(int value, Direccion d);//mueve a una figura.
    public default double imprimir(){ //metodo que todas las figuras saben hacer, queda como default.
        return area();
    }

}
