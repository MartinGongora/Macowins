public class Liquidacion implements Estado{
    @Override
    public double obtenerPrecio(double precioBase){
        return (precioBase * 0.5);
    }
}
