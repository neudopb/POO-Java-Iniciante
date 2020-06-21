package j10heranca;

public class J10Heranca {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Neudo", 20, "M");
        Aluno p2 = new Aluno("Maria", 25, "F", 111, "Informatica");
        Professor p3 = new Professor("Jose", 35, "M", "Redes", 3500);
        Funcionario p4 = new Funcionario("Joana", 30, "F", "Limpeza");

        p1.fazerAniv();
        p3.receberAum(500);
        p4.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

}
