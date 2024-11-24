import java.util.UUID;

public class Cliente {
    private String matricula;
    private String responsavel;
    private String empresa;
    private int qtdEquipamentos;

    //constructors
    public Cliente() {
        matricula = "";
        responsavel = "";
        empresa = "";
        qtdEquipamentos = 0;
    }
    public Cliente(String responsavel, String empresa) {
        this.matricula = UUID.randomUUID().toString().substring(32, 36);
        if (responsavel != null) this.responsavel = responsavel;
        if (empresa != null) this.empresa = empresa;
        qtdEquipamentos = 0;
    }

    //getters
    public String getMatricula() {
        return matricula;
    }
    public String getResponsavel() {
        return responsavel;
    }
    public String getEmpresa() {
        return empresa;
    }
    public int getQtdEquipamentos() {
        return qtdEquipamentos;
    }

    //setters
    public void setMatricula() {
        if (this.matricula.isEmpty()) this.matricula = UUID.randomUUID().toString().substring(32, 36);
    }
    public void setNome(String nome) {
        this.responsavel = nome;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public void setQtdEquipamentos(int qtdEquipamentos) { this.qtdEquipamentos = qtdEquipamentos; }

    //toString
    public String toString() {
        return "Matrícula: " + matricula +
               "\nNome responsável: " + responsavel +
               "\nEmpresa: " + empresa +
               "\nQuantidade equipamentos alugados: " + qtdEquipamentos;
    }

    public void addQtdEquipamentos() { this.qtdEquipamentos++; }
}