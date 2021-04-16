public class Ropa {
    public String nombre;
    public double precioBase;
    public Tipo tipo;
    public Estado estado;

    public Ropa(String nombre, double precioBase, Tipo tipo, Estado estado) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public double obtenerPrecio(){
        return estado.obtenerPrecio(this.precioBase);
    }

}
