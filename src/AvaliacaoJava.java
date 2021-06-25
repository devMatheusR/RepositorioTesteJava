/*  Cabeçalho//
    Disciplina: Desenvolvimento de Sistemas            Turma: E73009
    Docente: Westn Melo                                Data: 10/06/2021
    Aluno: Matheus Ramos de Oliveira 
 */
public class AvaliacaoJava {

    public static void main(String[] args) {
       PessoaJuridica pj = new PessoaJuridica();
       PessoaFisica pf1 = new PessoaFisica();
       PessoaFisica pf2 = new PessoaFisica();
       
       pj.setCnpj("987.983.123/8888-25");
       pj.setIdade(55);
       pj.setNome("Westn");
       pj.setRendaBruta(3023.95);
       
       pf1.setCpf("329.487.842-55");
       pf1.setIdade(25);
       pf1.setNome("Melo");
       pf1.setRendaBruta(2000.00);
       
       pf2.setCpf("274.584.843-00");
       pf2.setIdade(30);
       pf2.setNome("Matheus");
       pf2.setRendaBruta(5000.00);
       
       pf1.status();
       pj.status();          
       pf2.status();
    }
}
