package Cliente;

import java.util.Scanner;

public abstract class Pessoa {

    protected String nomePessoa;
    protected int idade;
    protected String telefone;
    protected Endereco e = new Endereco();

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getNomePessoa() {
        return this.nomePessoa;
    }

    public void setIdade(int idade) {
        if (testeIdade(idade)) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setEnderecoRua(String rua) {
        this.e.rua = rua;
    }

    public String getEnderecoRua() {
        return this.e.rua;
    }

    public void setEnderecoBairro(String bairro) {
        this.e.bairro = bairro;
    }

    public String getEnderecoBairro() {
        return this.e.bairro;
    }

    public void setEnderecoCidade(String cidade) {
        this.e.cidade = cidade;
    }

    public String getEnderecoCidade() {
        return this.e.cidade;
    }

    public void cadastro() {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nomeP = tec.next();
        this.setNomePessoa(nomeP);
        
        System.out.println("Digite sua idade:");
        int id = tec.nextInt();
        this.setIdade(id);
        
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
    }

    public void imprimirInformacoes() {
        String retorno = "----------------------------------------" + "\n";
        retorno += "Nome: " + this.getNomePessoa() + "\n";
        retorno += "Idade:" + this.getIdade() + "\n";
        retorno += "Telefone: " + this.getTelefone() + "\n";
        retorno += "Rua: " + this.getEnderecoRua() + "\n";
        retorno += "Bairro: " + this.getEnderecoBairro() + "\n";
        retorno += "Cidade: " + this.getEnderecoCidade() + "\n";
        retorno += "Documento: " + getDocumentos() + "\n";
        retorno += "----------------------------------------";
        System.out.println(retorno);
    }
    
    public abstract String getDocumentos();

    private boolean testeIdade(int idade) {
        return idade >= 0;
    }
}
