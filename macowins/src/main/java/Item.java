public class Item {

    public Prenda prendaItem;
    private Integer cantidad;

    public Integer precioItem(){
        return prendaItem.precio() * cantidad;

    }
}


