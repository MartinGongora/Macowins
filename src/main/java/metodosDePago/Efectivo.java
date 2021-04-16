package metodosDePago;

public class Efectivo implements MetodoDePago{
    @Override
    public double obtenerPrecio(double precioBase){
        return precioBase;
    }
}
