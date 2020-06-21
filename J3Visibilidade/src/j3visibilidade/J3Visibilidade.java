package j3visibilidade;

public class J3Visibilidade {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Vermelho";
        //c1.ponta = 0.7f; ERRO
        c1.carga = 85;
        c1.destampar();
        c1.escrever();
        //c1.pintar(); ERRO
        c1.status();
    }
    
}
