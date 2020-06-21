package j10heranca;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String n, int i, String s) {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
    }

    public void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public String getSexo() {
        return this.sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
