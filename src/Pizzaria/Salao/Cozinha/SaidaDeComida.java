package Pizzaria.Salao.Cozinha;

public class SaidaDeComida {

    public static final String s1 = null;// visibilidade public
    private String calabresa;// visibilidade private
    public String montarAPizza = calabresa;// visibilidade public
    protected char pronto;// visibilidade public
    public boolean pedido;// visibilidade public
    public boolean cozinhaAberta;// visibilidade public
    
    // metodo de acesso

    public boolean getpedido() {
        return pedido;
    }

    protected String getmontarAPizza() {
        return montarAPizza;
    }

    protected char getpronto() {
        return pronto;
    }

    public void setpedido(boolean p) {
        this.pedido = p;
    }

    protected void setmontarAPizza(String calbresa) {
        this.montarAPizza = calabresa;
    }

    protected void setpronto(char pr) {
        this.pronto = pr;
    }

    public boolean getcozinha() {
        return cozinhaAberta;
    }

    public void setcozinha(boolean cz) {
        this.cozinhaAberta = cz;
    }

    public void status() {
        System.out.println("A cozinha pode receber pedidos? " + this.cozinhaAberta);
        System.out.println("Qual é o pedido? " + this.calabresa);
        System.out.println("O pedido está sendo preparado. " + this.pedido);
        System.out.println("Pedido pronto. " + this.pronto);
    }

    public SaidaDeComida(boolean cz,boolean p, String calabresa, char pr){//Metodo construtor
        this.cozinhaAberta= cz;
        this.pedido = p;
        this.montarAPizza = calabresa;
        this.pronto = pr;
        
        this.cozinhaAberta();
        
    }

    public SaidaDeComida() {
    }

    private void cozinhaAberta() {
    }

    public void cozinha () {
        this.cozinhaAberta = true;
    }

    public void cozinhaFechada(String cz) {
        this.cozinhaAberta = false;
    }

    public void setcozinha(String string) {
    }

}
