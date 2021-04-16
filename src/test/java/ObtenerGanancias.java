import metodosDePago.Efectivo;
import metodosDePago.MetodoDePago;
import metodosDePago.Tarjeta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObtenerGanancias {
    @Test
    public void crearVenta(){
        Estado nuevo= new Nuevo();
        MetodoDePago efectivo= new Efectivo();
        MetodoDePago tarjeta = new Tarjeta();
        Ropa ropa1= new Ropa("pantalon1", 100, Tipo.PANTALON, nuevo);
        Venta venta1= new Venta(efectivo,2, ropa1 );
        Caja caja = new Caja();
        caja.nuevaVenta(venta1);
        Assertions.assertEquals(200, caja.ganancias());
    }
}
