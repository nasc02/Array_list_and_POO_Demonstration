public class Situacao {
    private boolean isAprovado = false;
    private boolean isReprovado = false;
    private boolean isRecuperacao = false;

    public boolean isAprovado() {
        return isAprovado;
    }

    public void setAprovado(boolean aprovado) {
        isAprovado = aprovado;
    }

    public boolean isReprovado() {
        return isReprovado;
    }

    public void setReprovado(boolean reprovado) {
        isReprovado = reprovado;
    }

    public boolean isRecuperacao() {
        return isRecuperacao;
    }

    public void setRecuperacao(boolean recuperacao) {
        isRecuperacao = recuperacao;
    }

    public void displayStatus(){
        System.out.println("Aprovado: " +isAprovado());
        System.out.println("Reprovado: " +isReprovado());
        System.out.println("Recuperação: " +isRecuperacao());
    }
}
