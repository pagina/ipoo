public class Circulo implements FiguraGeometrica{
    private Punto origen;
    private double radio;

    public Circulo(double radio, Punto origen){
        this.radio = radio;
        this.origen = origen;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public double area(){
        return Math.PI*radio;
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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}