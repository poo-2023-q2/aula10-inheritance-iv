package academico;

import java.util.Calendar;

/**
 * Testes da hierarquia.
 */
public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2020, Calendar.FEBRUARY, 20);
        Aluno a = new AlunoGrad(
            "joao", 
            "silva", 
            "1235", 
            calendar.getTime(),
            "bcc");
        Aluno b = new AlunoPosgrad(
            "maria", 
            "pereira", 
            "1234", 
            calendar.getTime(),
            "ppgcc",
            "daniel silva");
        Aluno c = new AlunoPosgrad(
            "carlos", 
            "nogueira", 
            "1234", 
            calendar.getTime(),
            "ppgcc",
            "daniel silva");

        System.out.println(a);
        System.out.println(a.equals(b));
        // os alunos serao tidos como iguais pois tem o mesmo RA
        System.out.println(b.equals(c));
    }
}
