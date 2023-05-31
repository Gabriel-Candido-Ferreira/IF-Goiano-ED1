class Pessoa {
    private int ID;
    private String sexo;
    private int idade;
    private String gestante;
    private String lactante;
    private String necessidade_especial;
    private int prioridade;

    public Pessoa(int ID, String sexo, int idade, String gestante, String lactante, String necessidade_especial, int prioridade) {
        this.ID = ID;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidade_especial = necessidade_especial;
        this.prioridade = prioridade;
    }

    public int getID() {
        return ID;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getGestante() {
        return gestante;
    }

    public String getLactante() {
        return lactante;
    }

    public String getNecessidadeEspecial() {
        return necessidade_especial;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
