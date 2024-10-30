package Cliente;

import java.util.Scanner;

public class Fisica extends Pessoa{

    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    @Override
    public String getDocumentos(){
        return this.cpf;
    }
    
    @Override
    public void cadastro() {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        super.cadastro();
        System.out.println("Digite seu CPF:");
        String cp = tec.next();
        this.setCpf(cp);
        System.out.println("----------------------------------------");
    }
}
