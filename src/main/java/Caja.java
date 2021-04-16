import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Caja {
    private List<Venta> ventas=new ArrayList<>();
    private LocalDateTime fecha=LocalDateTime.now();

    public void nuevaVenta(Venta venta){
        ventas.add(venta);
    }

    public float ganancias(){
        float total=0;
        for(Venta venta: ventas){
            total+= venta.precioTotal();
        }
        return total;
    }
}
