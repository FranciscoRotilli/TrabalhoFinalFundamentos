 public class Equipamento {
        private String tipo;  // Tipo de equipamento
        private String modelo;  // Modelo do equipamento

        public Equipamento(String tipo, String modelo) {
            this.tipo = tipo;
            this.modelo = modelo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        @Override
        public String toString() {
            return "Tipo: " + tipo + ", Modelo: " + modelo;
        }
    }

    public class Cliente {
        private int matricula;
        private String nome;
        private String empresa;
        private Equipamento equipamento;

        public Cliente(int matricula, String nome, String empresa, Equipamento equipamento) {
            this.matricula = matricula;
            this.nome = nome;
            this.empresa = empresa;
            this.equipamento = equipamento;
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
            return "Matrícula: " + matricula + ", Nome: " + nome + ", Empresa: " + empresa + ", Equipamento: " + equipamento;
        }
    }


