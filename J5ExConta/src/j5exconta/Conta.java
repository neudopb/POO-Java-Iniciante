package j5exconta;

public class Conta {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //CONSTRUTOR
    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //METODOS
    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("ESTADO DA CONTA:");
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("DONO: " + this.getDono());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("----------------------------");
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if ("CP".equals(tipo)) {
            this.setSaldo(150);
        } else if ("CC".equals(tipo)) {
            this.setSaldo(50);
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Impossivel depositar!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus() && this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Impossivel sacar!");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        } else {
            System.out.println("Impossivel pagar!");
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Impossivel pagar!");
        }
    }

    //GETTERS E SETTERS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
