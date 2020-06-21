package j10heranca;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario(String n, int i, String s, String setor) {
        super(n, i, s);
        this.setor = setor;
        this.trabalhando = false;
    }

    public void mudarTrabalho() {
        if (this.isTrabalhando()) {
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + super.getNome() + ", idade=" + super.getIdade() + ", sexo="
                + super.getSexo() + " setor=" + this.getSetor() + ", trabalhando=" + this.isTrabalhando() + '}';
    }
}
