import java.util.UUID;

public class Cliente {
    private String matricula;
    private String responsavel;
    private String empresa;
    private Equipamento equipamento;

    public Cliente(String responsavel, String empresa, Equipamento equipamento) {
        this.matricula = UUID.randomUUID().toString().substring(32, 36);
        this.responsavel = responsavel;
        this.empresa = empresa;
        this.equipamento = equipamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula() {
        if (this.matricula.isEmpty()) this.matricula = UUID.randomUUID().toString().substring(32, 36);
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setNome(String nome) {
        this.responsavel = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + responsavel + ", Empresa: " + empresa + ", Equipamento: " + equipamento;
    }
}