package j10heranca;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    public Professor(String n, int i, String s, String especialidade, float salario) {
        super(n, i, s);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAum(float v) {
        this.setSalario(this.getSalario() + v);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + super.getNome() + ", idade=" + super.getIdade() + ", sexo="
                + super.getSexo() + " especialidade=" + this.getEspecialidade() + ", salario=" + this.getSalario() + '}';
    }

}
