public class CadastroEmprestimo {
    private Emprestimo[] lista;
    private int index;
    public CadastroEmprestimo() {
        lista = new Emprestimo[100];
        index = 0;
    }
    public boolean registraEmprestimo(Emprestimo emp) {
        if (index < lista.length) {
            lista[index] = emp;
            index++;
            return true;
        }
        return false;
    }
    public boolean devolveEmprestimo(Emprestimo emp, int horasExtra) {
        if (emp != null) {
            if (emp.getStatusEmprestimo()) {
                emp.setStatusEmprestimo(false);
                emp.getEquipamento().setStatusAluguel(false);
                emp.setQtdHoras(emp.getQtdHoras() + horasExtra);
                emp.setValorFinal(horasExtra, emp.getEquipamento().getValor());
                emp.getCliente().removeQtdEquipamentos();
                return true;
            }
        }
        return false;
    }
    public Emprestimo[] buscaEmprestimosPeloNomeEmpresa(String nome) {
        Emprestimo[] resultado;
        resultado = new Emprestimo[lista.length];
        int indexB = 0;
        for (int i = 0; i < this.index; i++) {
            if (lista[i].getCliente().getEmpresa().equalsIgnoreCase(nome)) {
                resultado[indexB] = lista[i];
                indexB++;
            }
        }
        return resultado;
    }
    public Emprestimo buscaEmprestimoCodigo(String codigo) {
        for (int i = 0; i < index; i++) {
            if (codigo.equals(lista[i].getCodigoEmprestimo())) return lista[i];
        }
        return null;
    }
    public String mostrarEmprestimos() {
        String resultado = "";
        for (int i = 0; i < index; i++) {
            resultado += lista[i].toString() + "\n\n";
        }
        return resultado;
    }
    public Emprestimo[] getLista() { return lista; }
    public int getIndex() { return index; }
}
