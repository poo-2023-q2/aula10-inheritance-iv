package academico;

import java.util.Date;

/**
 * Um Aluno de Graduacao eh derivado de Aluno.
 */
public class AlunoGrad extends Aluno {
    private String curso;

    /**
     * Construtor. 
     * Note que o construtor da classe-base, mesmo esta
     * sendo abstrata, deve ser chamado.
     * 
     * @param nome o nome
     * @param sobrenome o sobrenome
     * @param ra o ra
     * @param dataIngresso a data de ingressp
     * @param curso o curso
     */
    public AlunoGrad(String nome, String sobrenome, 
        String ra, Date dataIngresso, String curso) {
        super(nome, sobrenome, ra, dataIngresso);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
