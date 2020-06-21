package j4metodosespeciais;

public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("COR: " + this.getCor());
        System.out.println("PONTA: " + this.getPonta());
        System.out.println("TAMPADA: " + this.getTampada());
    }
    
    public void tampar(){
        this.setTampada(true);
    }
    
    public void destampar(){
        this.setTampada(false);
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
}
