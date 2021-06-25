/*
 * @author devMatheusR
 */
public class PessoaJuridica extends Contribuinte implements CalculoIR{
    //Atributos
    private String cnpj;
    
    //Métodos
    public void status() {
        System.out.println("\n==-=-=-==-=-=-== Pessoa Juridica ==-=-=-==-=-=-==");
        System.out.println("Nome> "+this.getNome());
        System.out.println("Idade> "+this.getIdade());
        System.out.println("Renda Bruta> "+this.getRendaBruta());  
        System.out.println("CNPJ> "+this.getCnpj());
        System.out.println("Imposto de renda> "+this.calculoIR());
    }
    
    @Override
    public double calculoIR() {
        double imposto;
        imposto = this.getRendaBruta()*0.10;
        return imposto;
    }
        
    //Métodos Especiais
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    } 
}
