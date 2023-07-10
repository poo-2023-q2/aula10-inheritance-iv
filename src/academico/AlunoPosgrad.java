package academico;

import java.util.Date;

/**
 * Um Aluno de Pos-Graduacao eh derivado de Aluno.
 */
public class AlunoPosgrad extends Aluno {
    private String programa;
    private String orientador;

    /**
     * Construtor.
     * Note que o construtor da classe base deve ser chamado,
     * mesmo esta sendo abstrata.
     * 
     * @param nome         o nome
     * @param sobrenome    o sobrenome
     * @param ra           o ra
     * @param dataIngresso a data de ingresso
     * @param programa     o programa
     * @param orientador   o orientador
     */
    public AlunoPosgrad(String nome, String sobrenome,
            String ra, Date dataIngresso, String programa,
            String orientador) {
        super(nome, sobrenome, ra, dataIngresso);
        this.orientador = orientador;
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

}
