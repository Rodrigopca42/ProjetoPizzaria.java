import Pizzaria.Salao.Atendimento;
import Pizzaria.Salao.Cozinha.SaidaDeComida;

public class Comercio { 
    //private static String calabresa;

    public static void main(String[] args) throws Exception {
// 1 - Metodos.
    Atendimento a1 = new Atendimento();
       a1.atendimento = "pizzaria";
       a1.freezers = 100;
       a1.garçons = 100;
       a1.limpeza = 'S';
       a1.aberto = true;
       a1.estatus();
       a1.atender();
       a1.servir(); 

       SaidaDeComida s1 = new SaidaDeComida();
       s1.stecozinha("aberto");
       s1.status();
    }
}