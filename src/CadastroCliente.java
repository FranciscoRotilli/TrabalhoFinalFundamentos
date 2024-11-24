public class CadastroCliente {
    private Cliente[] listaCliente;
    private int index;

    public CadastroCliente() {
        listaCliente = new Cliente[100];
        index = 0;
    }

    public boolean adicionaCliente(Cliente c) {
        if (index < listaCliente.length) {
            listaCliente[index] = c;
            index++;
            return true;
        }
        return false;
    }
    public Cliente buscaClientePeloResponsavel(String nome) {
        for (int i = 0; i < index; i++) {
            if (listaCliente[i].getResponsavel().equalsIgnoreCase(nome)) return listaCliente[i];
        }
        return null;
    }
    public Cliente buscaClientePelaEmpresa(String nome) {
        for (int i = 0; i < index; i++) {
            if (listaCliente[i].getResponsavel().equalsIgnoreCase(nome)) return listaCliente[i];
        }
        return null;
    }
    public Cliente buscaClientePelaMatricula(String codigo) {
        for (int i = 0; i < index; i++) {
            if (codigo.equals(listaCliente[i].getMatricula())) return listaCliente[i];
        }
        return null;
    }
    public int totalClientes() {
        return index;
    }
    public String mostraClientes() {
        String aux = "\n";
        for (int i = 0; i < index; i++) {
            aux += listaCliente[i].toString() + "\n\n";
        }
        return aux;
    }
}
