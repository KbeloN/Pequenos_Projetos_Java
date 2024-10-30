package Cliente;

import java.util.Scanner;

public class Juridica extends Pessoa{

    private String cnpj;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }
    
    @Override
    public String getDocumentos(){
        return this.cnpj;
    }
    
    @Override
    public void imprimirInformacoes() {
        String retorno = "----------------------------------------" + "\n";
        retorno += "Nome: " + this.getNomePessoa() + "\n";
        retorno += "Telefone: " + this.getTelefone() + "\n";
        retorno += "Rua: " + this.getEnderecoRua() + "\n";
        retorno += "Bairro: " + this.getEnderecoBairro() + "\n";
        retorno += "Cidade: " + this.getEnderecoCidade() + "\n";
        retorno += "Documento: " + getDocumentos() + "\n";
        retorno += "----------------------------------------";
        System.out.println(retorno);
    }
    
    @Override
    public void cadastro() {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("Digite seu nome:");
        String nomeP = tec.next();
        this.setNomePessoa(nomeP);
        
        System.out.println("Digite seu telefone:");
        String tele = tec.next();
        this.setTelefone(tele);
        
        System.out.println("Digite sua rua:");
        String ru = tec.next();
        this.setEnderecoRua(ru);
        
        System.out.println("Digite seu bairro:");
        String bair = tec.next();
        this.setEnderecoBairro(bair);
        
        System.out.println("Digite sua cidade:");
        String cida = tec.next();
        this.setEnderecoCidade(cida);
        
        System.out.println("Digite seu CNPJ:");
        String cn = tec.next();
        this.setCnpj(cn);
        System.out.println("----------------------------------------");
    }
    
}
