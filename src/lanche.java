public class lanche {

    public static String getTotal(int cod, int quant){
        double preco = 0;
        String resul;
        double total;

        if (cod == 1){
            preco = 4.00;
        }
        if (cod == 2){
            preco = 4.50;
        }
        if (cod == 3){
            preco = 5.00;
        }
        if (cod == 4){
            preco = 2.00;
        }
        if (cod == 5){
            preco = 1.50;
        }
        return resul = "Total: R$ " + quant*preco;
    }

}