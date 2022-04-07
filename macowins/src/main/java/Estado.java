import java.util.Set;

public interface Estado {

    Integer precio(Integer precioPrenda);


    class Nueva implements Estado{
        public Integer precio(Integer precioPrenda){
            return precioPrenda;
        }
    }

    class Promocion implements Estado{

        private Integer valorFijo;

        public void setValorFijo(Integer valorFijo) {
            this.valorFijo = valorFijo;
        }

        public Integer precio(Integer precioPrenda){
            return precioPrenda-valorFijo;
        }
    }

    class Liquidacion implements Estado{
        public Integer precio(Integer precioPrenda){
            return precioPrenda / 2;
        }
    }

}


