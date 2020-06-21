package j10heranca;

public class Aluno extends Pessoa {
    
    private int matr;
    private String curso;
    
    public Aluno(String n, int i, String s, int m, String c) {
        super(n, i, s);
        this.setMatr(m);
        this.setCurso(c);
    }
    
    public void cancelarMatr() {
        this.setMatr(0);
    }
    
    public void setMatr(int m) {
        this.matr = m;
    }
    
    public int getMatr() {
        return this.matr;
    }
    
    public void setCurso(String c) {
        this.curso = c;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + super.getNome() + ", idade=" + super.getIdade() + ", sexo="
                + super.getSexo() + " matr=" + this.getMatr() + ", curso=" + this.getCurso() + '}';
    }
    
}
