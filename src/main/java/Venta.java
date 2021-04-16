import metodosDePago.MetodoDePago;

import java.time.LocalDateTime;

public class Venta{
    private MetodoDePago metodoDePago;
    private int cantidad;
    private LocalDateTime fechaVenta= LocalDateTime.now();
    private Ropa ropa;

    public Venta(MetodoDePago metodoDePago, int cantidad, Ropa ropa) {
        this.metodoDePago = metodoDePago;
        this.cantidad = cantidad;
        this.ropa = ropa;
    }

    public double precioTotal(){
        return metodoDePago.obtenerPrecio(ropa.obtenerPrecio()*cantidad);
    }

}
