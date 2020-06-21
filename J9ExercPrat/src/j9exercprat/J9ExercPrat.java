package j9exercprat;

public class J9ExercPrat {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Neudo", 20, "M");
        p[1] = new Pessoa("Maria", 18, "F");
        
        l[0] = new Livro("Aprendendo Java", "Jose S.", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro P.", 500, p[1]);
        l[2] = new Livro("Java avançado", "Maria C.", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(124);
        
        for (Livro livro : l) {
            livro.detalhes();
        }
    }
    
}
