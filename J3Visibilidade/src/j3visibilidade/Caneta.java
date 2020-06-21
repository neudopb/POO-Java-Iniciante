package j3visibilidade;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void escrever() {
        if (this.tampada) {
            System.out.println("ERRO...");
        } else {
            System.out.println("ESCREVENDO...");
        }
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO...");
        } else {
            System.out.println("RABISCANDO...");
        }
    }

    private void pintar() {
        if (this.tampada) {
            System.out.println("ERRO...");
        } else {
            System.out.println("PINTANDO...");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
