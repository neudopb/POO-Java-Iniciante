package j9exercprat;

public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("------------------------------------------------------");
        System.out.print("TITULO: " + this.getTitulo());
        System.out.println(" | AUTOR: " + this.getAutor());
        System.out.print("TOTAL DE PAGINAS: " + this.getTotPag());
        System.out.print(" | PAGINA ATUAL: " + this.getPagAtual());
        System.out.println(" | ABERTO: " + this.isAberto());
        System.out.print("LEITOR: " + this.getLeitor().getNome());
        System.out.print(" | IDADE: " + this.getLeitor().getIdade());
        System.out.println(" | SEXO: " + this.getLeitor().getSexo());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (this.isAberto() && (p <= this.getTotPag())) {
            this.setPagAtual(p);
        } else {
            System.out.println("ERRO...");
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto() && (this.getPagAtual() <= this.getTotPag())) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("ERRO...");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto() && (this.getPagAtual() > 0)) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("ERRO...");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
