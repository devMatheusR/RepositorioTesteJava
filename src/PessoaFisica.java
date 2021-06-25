/*
 * @author devMatheusR
 */
public class PessoaFisica extends Contribuinte implements CalculoIR{
    //Atributos
    private String cpf;
    
    //Métodos
    public void status() {
        System.out.println("\n==-=-=-==-=-=-== Pessoa Fisica ==-=-=-==-=-=-==");
        System.out.println("Nome> "+this.getNome());
        System.out.println("Idade> "+this.getIdade());
        System.out.println("Renda Bruta> "+this.getRendaBruta());  
        System.out.println("CPF> "+this.getCpf());
        System.out.println("Imposto de renda> "+this.calculoIR());
    }
    
    @Override
    public double calculoIR() {
        double imposto;
        if(this.getRendaBruta()<=2000){
            imposto = this.getRendaBruta()*0.10;
        }else{
            imposto = this.getRendaBruta()*0.20;
        }
        return imposto;
    }
    
    //Métodos Especiais
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }           
}
