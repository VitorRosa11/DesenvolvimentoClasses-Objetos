
package DTO;

public class Professor extends Pessoa{
    
    private String matricula;
    private String curso;

    public Professor(String matricula, String curso, String nome, String sobrenome, String telefone, String CPF, int idade, String email, String CEP) {
        super(nome, sobrenome, telefone, CPF, idade, email, CEP);
        this.matricula = matricula;
        this.curso = curso;
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

    @Override
    public String toString() {
        return "Professor{" + "matricula=" + matricula + ", curso=" + curso + '}';
    }
    
    
    
    
}
