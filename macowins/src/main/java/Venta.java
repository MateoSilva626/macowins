
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Venta {

    private static Date fechaVenta = new Date();
    private static Set<Item> itemsVendidos = new HashSet<>(); // item vendidos
    private static MetodoPago metodoDePago;

    public Integer precioBase() {
        return itemsVendidos.stream().map(item -> item.precioItem()).reduce(0, Integer::sum);
    }

    public Integer precioFinal() {
        return metodoDePago.precioFinal(this);
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public Set<Item> getItemsVendidos() {
        return itemsVendidos;
    }
}
