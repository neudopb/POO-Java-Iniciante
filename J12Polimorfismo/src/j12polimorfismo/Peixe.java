package j12polimorfismo;

public class Peixe extends Animal {

    private String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super.peso = peso;
        super.idade = idade;
        super.membros = membros;
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não faz som");
    }

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void print() {
        System.out.println("Peixe{" + "\nPeso= " + super.peso + "\nIdade= " + super.idade
                + "\nMembros= " + super.membros + "\ncorEscama= " + corEscama + "}\n");
    }

}
