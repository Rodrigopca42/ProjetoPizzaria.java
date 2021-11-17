package Pizzaria.Salao.Cozinha;

public class SaidaDeComida {

    private String calabresa;
    public String montarAPizza = calabresa;
    protected char pronto;
    public boolean pedido;
    public boolean cozinha;// visibilidade public

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
        return cozinha;
    }

    public void stecozinha(boolean cz) {
        this.cozinha = cz;
    }

    public void status() {
        System.out.println("A cozinha pode receber pedidos? " + this.cozinha);
        System.out.println("Qual é o pedido? " + this.calabresa);
        System.out.println("O pedido está sendo preparado. " + this.pedido);
        System.out.println("Pedido pronto. " + this.pronto);
    }

    public SaidaDeComida(){
        this.aberto();
        
    }

    private void aberto() {
    }

    public void stecozinha(String string) {
    }

}
