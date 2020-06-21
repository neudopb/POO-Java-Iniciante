package j11heranca2;

public class J11Heranca2 {

    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa(); ERRO
        Visitante v1 = new Visitante();
        v1.setNome("Neudo");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("João");
        a1.setIdade(30);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Maria");
        b1.setIdade(25);
        b1.setSexo("F");
        b1.setMatricula(2222);
        b1.setCurso("Alimentos");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());

    }

}
