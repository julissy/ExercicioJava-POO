public class Festa {

    private String nome;
    private String cpf;
    private Integer qntConvidados;
    private Double custo;

    public Festa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getQntConvidados() {
        return qntConvidados;
    }

    public void setQntConvidados(Integer qntConvidados) {
        this.qntConvidados = qntConvidados;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public String mostrar() {
        return ( "Dados da Festa: " +
                "\n" + "Responsável: " + nome +
                "\n" + "Cpf: " + cpf +
                "\n" + "Quantidade de convidados: " + qntConvidados +
                "\n" + "Valor: " + custo);
    }

    public String classificar() {
        if (qntConvidados < 300 && custo < 15000) {
            return ("Festa Junina");
        } else if (qntConvidados < 300 && custo >= 15000) {
            return ("Aniversário");
        } else if (qntConvidados >= 300 && custo < 15000) {
            return ("Formatura");
        } else return ("Casamento");
    }

    public String possivelLocal(Integer tamanho) {

        Integer espacoAdequado = (3 * qntConvidados) / 4;

        if (tamanho >= espacoAdequado) {
            return ("O local é adequado para o evento");
        } else {
            return ("O local não acomoda os convidados de forma confortável");
        }
    }

}
