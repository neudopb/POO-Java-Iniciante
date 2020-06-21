package j12polimorfismo;

public class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super.peso = peso;
        super.idade = idade;
        super.membros = membros;
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public void print() {
        System.out.println("Mamifero{" + "\nPeso= " + super.peso + "\nIdade= " + super.idade
                + "\nMembros= " + super.membros + "\ncorPelo= " + corPelo + "}\n");
    }

}
