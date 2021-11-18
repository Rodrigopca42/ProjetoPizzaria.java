import Pizzaria.Salao.Atendimento;//herança
import Pizzaria.Salao.Cozinha.SaidaDeComida;//herança

public class Comercio { 
    //private static String calabresa;

    private static final String calabresa = null;
    private static final char saindo = 0;

    public static void main(String[] args) throws Exception {
// 1 - Metodos.
    Atendimento a1 = new Atendimento();//instância
    a1.atendimento = "pizzaria";
    a1.freezers = 100;
    a1.garçons = 100;
    a1.limpeza = 'S';
    a1.aberto = true;
    a1.estatus();
    a1.atender();
    a1.servir(); 

SaidaDeComida s1 = new SaidaDeComida(true, true, calabresa, saindo);//instancia
        s1.status();
    }
}