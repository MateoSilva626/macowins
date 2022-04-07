public class Prenda {

    public String tipoPrenda;
    public Estado estadoPrenda;
    private Integer precioPropio;


    public String getTipoPrenda(){
        return tipoPrenda;
    }
    public Integer precio(){
        return estadoPrenda.precio(precioPropio);
    }

}
