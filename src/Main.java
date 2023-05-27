import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        double mediaTurma;
        double notaTotalTurma = 0;
        double maiorNotaFinal = 0;
        double menorNotaFinal = 100;
        int quantidadeAlunoReprovados = 0;
        int quantidadeAlunoAprovados = 0;
        int quantidadeAlunoRecuperacao = 0;

        ArrayList<Estudante> turma = new ArrayList<>();

        Estudante jose = new Estudante(1,"jose");
        Estudante carlos = new Estudante(2,"carlos");
        Estudante matilda = new Estudante(3,"matilda");
        Estudante joana = new Estudante(4,"joana");
        Estudante rose = new Estudante(5,"rose");
        Estudante matheus = new Estudante(6,"matheus");

        turma.add(jose);
        turma.add(carlos);
        turma.add(matilda);
        turma.add(joana);
        turma.add(rose);
        turma.add(matheus);

        for (Estudante estudante:turma) {
            estudante.adicionarNota((float)(Math.random()*25));
            estudante.adicionarNota((float)(Math.random()*25));
            estudante.adicionarNota((float)(Math.random()*25));
            estudante.adicionarNota((float)(Math.random()*25));

            estudante.calcularNotaFinal();
            notaTotalTurma += estudante.getNotaFinal();

            if (estudante.getNotaFinal() > maiorNotaFinal){
                maiorNotaFinal = estudante.getNotaFinal();
            }
            if (estudante.getNotaFinal() < menorNotaFinal){
                menorNotaFinal = estudante.getNotaFinal();
            }

            estudante.verificarStatus();

            if (estudante.getSituacao().isReprovado()){
                quantidadeAlunoReprovados += 1;
            } else if (estudante.getSituacao().isAprovado()){
                quantidadeAlunoAprovados += 1;
            } else if (estudante.getSituacao().isRecuperacao()) {
                quantidadeAlunoRecuperacao += 1;
            }

        }

        mediaTurma = notaTotalTurma / turma.size();

        System.out.println("A media da turma é: " + mediaTurma);
        System.out.println();
        for (Estudante estudante:turma) {
            System.out.print("Nome: " +estudante.getNome() + "   Matricula: ");
            System.out.println(estudante.getMatricula());
            estudante.getStatus();
            System.out.println("Nota Final: " + estudante.getNotaFinal());
            if (estudante.getNotaFinal() == maiorNotaFinal){
                System.out.println("Este estudante tem a maior nota final!!");
            };
            if (estudante.getNotaFinal() == menorNotaFinal){
                System.out.println("Este estudante tem a menor nota final!!");
            };
            System.out.println();
        }

        System.out.println("A quantidade de alunos Aprovados é: " + quantidadeAlunoAprovados);
        System.out.println("A quantidade de alunos Reprovados é: " + quantidadeAlunoReprovados);
        System.out.println("A quantidade de alunos em Recuperação é: " + quantidadeAlunoRecuperacao);
    }
}
