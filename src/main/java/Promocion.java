public class Promocion implements Estado{
    float valor=0;
    public void setValor(float valor) {
        this.valor = valor;
    }
    @Override
    public double obtenerPrecio(double precioBase){
        return precioBase-valor;
    }
}
