package j13polimorfismo2;

//Polimorfismo de sobrecarga: Assinaturas diferentes, mesma classe
public class J13Polimorfismo2 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro ch = new Cachorro();

        //Polimorfismo Sobreposição
        m.emitirSom();

        l.emitirSom();

        ch.emitirSom();

        //Polimorfismo Sobrecarga
        ch.reagir("ola");
        ch.reagir("vai apanhar");
        ch.reagir(9, 15);
        ch.reagir(15, 50);
        ch.reagir(20, 0);
        ch.reagir(true);
        ch.reagir(false);
        ch.reagir(3, 5.8f);
        ch.reagir(4, 15.1f);
        ch.reagir(7, 8.4f);
        ch.reagir(8, 12.8f);
    }

}
