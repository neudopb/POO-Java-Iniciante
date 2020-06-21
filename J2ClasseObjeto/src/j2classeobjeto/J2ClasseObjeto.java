package j2classeobjeto;

public class J2ClasseObjeto {

    public static void main(String[] args) {
           Caneta c1 = new Caneta();
           c1.modelo = "bic";
           c1.cor = "Azul";
           c1.ponta = 0.5f;
           c1.carga = 100;
           c1.destampar();
           
           c1.status();
           c1.rabiscar();
           
           Caneta c2 = new Caneta();
           c2.modelo = "bic";
           c2.cor = "Vermelho";
           c2.ponta = 0.7f;
           c2.carga = 90;
           c2.tampar();
           
           c2.status();
           c2.rabiscar();
           
           
    }
    
}
