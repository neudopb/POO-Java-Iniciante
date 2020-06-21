package j14projetofinal;

public class J14ProjetoFinal {
    
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 10 de Java");
        v[2] = new Video("Aula 20 de POO + JAVA");
        
        System.out.println("VIDEOS\n--------------------");
        for (Video n : v) {
            System.out.println(n.toString());
        }
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Neudo", 20, "M", "neudo11");
        g[1] = new Gafanhoto("Maria", 25, "F", "maria25");
        
        System.out.println("GAFANHOTOS\n--------------------");
        for (Gafanhoto p : g) {
            System.out.println(p.toString());
        }
        
        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[0]);
        vis[1].avaliar(8);
        vis[2] = new Visualizacao(g[1], v[2]);
        vis[2].avaliar(85.0f);
        
        System.out.println("VISUALIZACAO\n--------------------");
        for (Visualizacao n : vis) {
            System.out.println(n.toString());
        }
    }
    
}
