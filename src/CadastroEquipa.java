public class CadastroEquipa {
    private Equipamento[] lista;
    private int index;

    public CadastroEquipa() {
        lista = new Equipamento[10];
        index = 0;
    }
    public boolean adicionaEquipa(Equipamento e) {
        if (index < lista.length) {
            lista[index] = e;
            index++;
            return true;
        }
        return false;
    }
    public boolean removeEquipa(Equipamento e) {
        if (e.equals(lista[index-1])) {
            lista[index-1] = null;
            index--;
            return true;
        }
        return false;
    }
    public Equipamento buscaEquipaPeloNome(String nome) {
        for (int i = 0; i < index; i++) {
            if (lista[i].getNome().equals(nome)) return lista[i];
        }
        return null;
    }
    public Equipamento buscaEquipaCodigo(String codigo) {
        for (int i = 0; i < index; i++) {
            if (codigo.equals(lista[i].getCodigo())) return lista[i];
        }
        return null;
    }
    public int totalEquipamentos() {
        return index;
    }
    public String mostraEquipamentos() {
        String aux = "\n";
        for (int i = 0; i < index; i++) {
            aux += "Equipamento ID #" + i + ": \n" + lista[i].toString() + "\n\n";
        }
        return aux;
    }
}
