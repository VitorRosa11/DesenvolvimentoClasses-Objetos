
package DTO;

public class Pessoa {
    
        
    private String nome;
    private String sobrenome;
    private String telefone;
    private String CPF;
    private int idade;
    private String email;
    private String CEP;
    private String RG;

    public Pessoa(String nome, String sobrenome, String telefone, String CPF, int idade, String email, String CEP, String RG){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.idade = idade;
        this.email = email;
        this.CEP = CEP;
        this.RG = RG;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", telefone=" + telefone + ", CPF=" + CPF + ", idade=" + idade + ", email=" + email + ", CEP=" + CEP + '}';
    }
    
    
    
    
}
