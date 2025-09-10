
package DTO;

public class Aluno extends Pessoa{
    
    private String matricula;
    private String curso;
    private String responsavel;

    public Aluno(String matricula, String curso, String responsavel, String nome, String sobrenome, String telefone, String CPF, int idade, String email, String CEP) {
        super(nome, sobrenome, telefone, CPF, idade, email, CEP);
        this.matricula = matricula;
        this.curso = curso;
        this.responsavel = responsavel;
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + ", responsavel=" + responsavel + '}';
    }
    
    
}
