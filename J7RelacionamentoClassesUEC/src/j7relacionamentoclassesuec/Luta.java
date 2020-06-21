package j7relacionamentoclassesuec;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiador;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiador(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiador(null);
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            this.getDesafiado().apresentar();
            this.getDesafiador().apresentar();

            Random g = new Random();
            int vencedor = g.nextInt(3);
            
            System.out.print("RESULTADO: ");

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiador().empatarLuta();
                    break;
                case 1:
                    System.out.println(this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiador().perderLuta();
                    break;
                case 2:
                    System.out.println(this.getDesafiador().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiador().ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dso) {
        this.desafiado = dso;
    }

    public Lutador getDesafiador() {
        return desafiador;
    }

    public void setDesafiador(Lutador dr) {
        this.desafiador = dr;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int ro) {
        this.rounds = ro;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }

}
