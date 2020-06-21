package j12polimorfismo;

public class Ave extends Animal {

    private String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super.peso = peso;
        super.idade = idade;
        super.membros = membros;
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void print() {
        System.out.println("Ave{" + "\nPeso= " + super.peso + "\nIdade= " + super.idade
                + "\nMembros= " + super.membros + "\ncorPena= " + corPena + "}\n");
    }

}
