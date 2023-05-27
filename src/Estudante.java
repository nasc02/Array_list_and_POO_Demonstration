import java.util.ArrayList;

public class Estudante {
    private int matricula;
    private String nome;
    private ArrayList<Float> notas = new ArrayList<Float>();
    private double notaFinal;
    private Situacao situacao = new Situacao();

    public Estudante() {
    }

    public Estudante(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Float> getNotas(){
        return this.notas;
    }

    public double getNotaFinal(){
        return notaFinal;
    }

    public void getStatus(){
        situacao.displayStatus();
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void adicionarNota(float nota){
        notas.add(nota);
    }

    public float obterNota(int indice){
        return notas.get(indice);
    }

    public void calcularNotaFinal(){
        for (float nota:notas) {
            notaFinal += nota;
        }

    }

    public void verificarStatus(){
        if (notaFinal < 40) {
            situacao.setReprovado(true);
        }else if(notaFinal < 60 && notaFinal > 40){
            situacao.setRecuperacao(true);
        }else{
            situacao.setAprovado(true);
        }
    }


}

