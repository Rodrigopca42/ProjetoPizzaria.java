package Pizzaria.Salao;
//1 - Atributos
public class Atendimento {
    public String atendimento;//visibilidade public
    public double freezers;//visibilidade public
    public double garçons;//visibilidade public
    public char limpeza;//visibilidade public
    public boolean aberto;//visibilidade public
   
     
    public void estatus(){
        System.out.println("Qual nivel de abastecimento dos freezers? " + this.freezers);
        System.out.println("Quantos garçons estao trabalhando hoje? " + this. garçons);
        System.out.println("O salao esta limpo? " + this.limpeza);
        System.out.println("A cozinha esta pronta para saida de comida? "+ this);
        System.out.println("A pizzaria esta aberta? " + this.aberto);
    }

    public void atender(){
        if(this.aberto == true){
            System.out.println("Podemos atender");
      } else{
          System.out.println("Nao podemos atender! ");
      }

    }
    public void servir(){
        this.aberto = true;
    }
}
