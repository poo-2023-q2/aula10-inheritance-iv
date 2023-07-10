package academico;

import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Aluno eh uma classe abstrata, i.e., nao pode ser instanciada.
 * Assumimos que um Aluno deve ser ou Aluno de graduacao, ou Aluno
 * de PosGraduacao, i.e. nao existe Aluno fora dessas duas classes.
 * Portanto, a classe Aluno atua meramente como "codigo comum" das suas
 * classes-filha, ou seja, eh definida meramente com fins de reuso.
 * 
 * Note que uma classe abstrata pode ter construtores, porem esse
 * construtor pode ser invocado apenas pelo construtor de uma
 * classe derivada.
 * 
 */
public abstract class Aluno {
    private String nome;
    private String sobrenome;
    private String ra;
    private Date dataIngresso;

    /**
     * Construtor.
     * 
     * @param nome o nome
     * @param sobrenome o sobrenome
     * @param ra o ra
     * @param dataIngresso a data de ingresso
     */
    public Aluno(String nome, String sobrenome, String ra, Date dataIngresso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
        this.dataIngresso = dataIngresso;
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

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
            + "Nome: " + nome + "\n"
            + "Sobrenome: " + sobrenome + "\n"
            + "RA: " + ra + "\n"
            + "Ingresso: " + dataIngresso + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
        result = prime * result + ((ra == null) ? 0 : ra.hashCode());
        result = prime * result + ((dataIngresso == null) ? 0 : dataIngresso.hashCode());
        return result;
    }


    /**
     * Dois alunos sao iguais se possuem o mesmo RA.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        
        if (ra == null) {
            if (other.ra != null)
                return false;
        } else if (!ra.equals(other.ra))
            return false;
        return true;
    }

    public boolean estaJubilado() {
        return !getDataIngresso().toInstant()
            .plus(10 * 365, ChronoUnit.DAYS)
            .isAfter(new Date().toInstant());
    } 
    
}
