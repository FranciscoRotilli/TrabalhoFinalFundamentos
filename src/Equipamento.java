public class Equipamento {
    private int codigo;
    private String nome;
    private int tipo;
    private int quantidade;
    private double valor;
    private boolean seguro;

    public Equipamento() {
        codigo = 0;
        nome = "";
        tipo = 0;
        quantidade = 0;
        valor = 0;
        seguro = false;
    }
    public Equipamento(int codigo, String nome, int tipo, int quantidade, double valor, boolean seguro) {
        if (codigo > 0) this.codigo = 0;
    }
}
