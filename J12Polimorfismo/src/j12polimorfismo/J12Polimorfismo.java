package j12polimorfismo;

//Polimorfismo de sobreposição: Mesma assinatura, classes diferentes
public class J12Polimorfismo {

    public static void main(String[] args) {
        Mamifero m = new Mamifero(9.8f, 5, 4, "Branco");
        Reptil r = new Reptil(2.4f, 3, 4, "Verde");
        Peixe p = new Peixe(1.6f, 2, 0, "Azul");
        Ave a = new Ave(0.7f, 1, 2, "Vermelho");
        Canguru ca = new Canguru(15f, 5, 4, "Caramelo");
        Cachorro ch = new Cachorro(5f, 7, 4, "Preto");
        Cobra co = new Cobra(1.5f, 3, 0, "cinza");
        Tartaruga ta = new Tartaruga(3f, 50, 4, "Cinza");
        Goldfish go = new Goldfish(0.3f, 1, 0, "Laranja");
        Arara ar = new Arara(0.5f, 3, 2, "Amarelo");

        //Polimorfismo sobreposição
        m.alimentar();
        m.locomover();
        m.emitirSom();
        m.print();

        r.alimentar();
        r.locomover();
        r.emitirSom();
        r.print();

        p.alimentar();
        p.locomover();
        p.emitirSom();
        p.print();

        a.alimentar();
        a.locomover();
        a.emitirSom();
        a.print();

        ca.alimentar();
        ca.locomover();
        ca.emitirSom();
        ca.usarBolsa();
        ca.print();

        co.alimentar();
        co.locomover();
        co.emitirSom();
        co.print();

        ta.alimentar();
        ta.locomover();
        ta.emitirSom();
        ta.print();

        go.alimentar();
        go.locomover();
        go.emitirSom();
        go.print();

        ar.alimentar();
        ar.locomover();
        ar.emitirSom();
        ar.print();

        ch.alimentar();
        ch.locomover();
        ch.emitirSom();
        ch.enterrarOsso();
        ch.abanarRabo();
        ch.print();

    }

}
