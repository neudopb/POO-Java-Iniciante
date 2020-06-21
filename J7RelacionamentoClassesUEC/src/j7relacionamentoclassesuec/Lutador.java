package j7relacionamentoclassesuec;

public class Lutador {

    private String nome, nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura,
            float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public void apresentar() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("CHEGOU A HORA! \nO lutador " + this.getNome());
        System.out.print(" veio diretamente de " + this.getNacionalidade());
        System.out.print(", tem " + this.getIdade() + " anos, mede " + this.getAltura() + "m ");
        System.out.println("e pesa " + this.getPeso() + "Kg");
        System.out.print("Ele tem " + this.getVitorias() + " vitorias, ");
        System.out.print(this.getDerrotas() + " derrotar, e ");
        System.out.println(this.getEmpates() + " empates.");
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public void status() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print(this.getNome() + " é um peso " + this.getCategoria());
        System.out.print(" e já ganhou " + this.getVitorias() + " vezes, ");
        System.out.print("perdeu " + this.getDerrotas() + " vezes e ");
        System.out.println("empatou " + this.getEmpates() + " vezes.");
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getEmpates() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso < 70.3) {
            this.categoria = "Leve";
        } else if (this.peso < 83.9) {
            this.categoria = "Medio";
        } else if (this.peso < 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
