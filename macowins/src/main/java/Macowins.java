import java.util.*;

public class Macowins {

    private static Set<Venta> registroVentas = new HashSet<>(); //Registro de ventas

    public Integer Ganancia(Date fecha) {

        return registroVentas.stream().filter(venta -> venta.getFechaVenta() == fecha).map(venta -> venta.precioFinal()).reduce(0, Integer::sum);
    }
}
