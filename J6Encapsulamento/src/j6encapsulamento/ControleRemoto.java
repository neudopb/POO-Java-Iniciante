package j6encapsulamento;

public class ControleRemoto implements Controlador {

    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //CONSTRUTOR
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }

    //METODOS INTERFACE
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("----------MENU----------");
            System.out.println("LIGADO: " + this.getLigado());
            System.out.println("TOCANDO: " + this.getTocando());
            System.out.print("VOLUME: " + this.getVolume() + " ");
            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("");
        } else {
            System.out.println("Impossivel abrir menu");
        }

    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("FECHANDO MENU...");
        } else {
            System.out.println("Impossivel fechar menu");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Impossivel ligar mudo!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("Impossivel desligar mudo!");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Impossivel dar play!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Impossivel pausar!");
        }
    }

    //GETTERS E SETTERS
    private void setVolume(int v) {
        this.volume = v;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    private boolean getTocando() {
        return this.tocando;
    }

}
