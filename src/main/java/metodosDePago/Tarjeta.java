package metodosDePago;

public class Tarjeta implements MetodoDePago{
    private int cuotas=1;
    private double recargo=0;
    @Override
    public double obtenerPrecio(double precioBase){
        return (cuotas*recargo+0.01*precioBase+precioBase);
    }
}
