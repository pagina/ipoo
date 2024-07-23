package practico3IPOO.ej3Reimplementar;

import java.util.ArrayList;
import java.util.List;

public class GraphEditor {
    private List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

    public void addFigura(FiguraGeometrica f){
        figuras.add(f);    
    }
     
    public void removeFigura(FiguraGeometrica f){
        figuras.remove(f);    
    } 

    public void mover(int value, Direccion d){
        for(FiguraGeometrica f :figuras)
            f.mover(value, d);
    }

    public double sumarAreas(){
        double areaTotal = 0;
        for(FiguraGeometrica f :figuras)
            areaTotal += f.area();
        return areaTotal;
    }

}

