import java.util.Set;

public interface MetodoPago {
    Integer precioFinal(Venta venta);

    class Efectivo implements MetodoPago {
        public Integer precioFinal(Venta venta) {
            return venta.precioBase();
        }
    }
//----------- lo pensamos de dos maneras porque no entendimos muy bien que piden
    class Tarjeta implements MetodoPago {
        private Integer cantidadCoutas;
        private Integer coeficienteFijo;


//----------- primera forma pensada
        public Integer precioFinal(Venta venta) {
            return venta.precioBase() + this.recargo(venta.precioBase());
        }

        public Integer recargo(Integer precioBase){
            return  cantidadCoutas*coeficienteFijo + ( precioBase/100);
        }
//--------- Segunda forma pensada

        public Integer precioFinalI(Venta venta) {
            return venta.precioBase() + recargoI(venta.getItemsVendidos());
        }

        public Integer recargoI(Set<Item> items){
            return items.stream().map(item -> item.prendaItem.precio()).reduce(0, Integer::sum);
        }
    }
}
