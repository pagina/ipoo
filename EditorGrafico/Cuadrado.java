package practico3IPOO.ej3Reimplementar;

public class Cuadrado implements FiguraGeometrica{
    private double lado;
    private Punto origen;
    
    public Cuadrado(int lado, Punto origen){
        this.lado = lado;
        this.origen = origen;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public double area(){
        return this.lado * this.lado;
    }

    public void mover(int value, Direccion d){
        Punto p = new Punto();
        if(d == d.NORTE || d == d.SUR){
            p.setY(value);
            setOrigen(p);   
        }
        if(d == d.ESTE || d == d.OESTE){
            p.setX(value);
            setOrigen(p);   
        }
    }
}
