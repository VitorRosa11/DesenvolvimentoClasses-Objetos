
package DTO;


public class Professor extends Pessoa{
    
    private String nome;
    private String sobrenome;
    private String CPF;
    private String RG;
    private String fone;
    private String numeroMatricula;
    private String curso;

    public Professor(String nome, String sobrenome, String telefone, int idade, String email, String CEP, String CPF, String RG) {
        super(nome, sobrenome, telefone, idade, email, CEP, CPF, RG);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.fone = fone;
        this.CPF = CPF;
        this.RG = RG;
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
        
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", CPF=" + CPF + ", RG=" + RG + ", fone=" + fone + ", numeroMatricula=" + numeroMatricula + ", curso=" + curso + '}';
    }
    
    
    
    
    
    
    }
    

