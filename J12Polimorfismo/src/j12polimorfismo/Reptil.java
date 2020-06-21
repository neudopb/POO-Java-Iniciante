package j12polimorfismo;

public class Reptil extends Animal {

    private String corEscama;

    public Reptil(float peso, int idade, int membros, String corEscama) {
        super.peso = peso;
        super.idade = idade;
        super.membros = membros;
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void print() {
        System.out.println("Reptil{" + "\nPeso= " + super.peso + "\nIdade= " + super.idade
                + "\nMembros= " + super.membros + "\ncorEscama= " + corEscama + "}\n");
    }

}
