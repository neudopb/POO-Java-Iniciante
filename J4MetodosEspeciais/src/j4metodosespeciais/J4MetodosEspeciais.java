package j4metodosespeciais;

public class J4MetodosEspeciais {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Cristal", "Azul", 0.7f);
        c1.status();
        
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.destampar();
        c1.status();
    }
    
}
