public class Festa {

    private String nome;
    private String cpf;
    private Integer qntConvidados;
    private Double custo;

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

    public void mostrar() {
        System.out.println( "Dados da Festa: " +
                "\n" + "Responsável: " + nome +
                "\n" + "Cpf: " + cpf +
                "\n" + "Quantidade de convidados: " + qntConvidados +
                "\n" + "Valor: " + custo);
    }

    public void classificar() {
        if (qntConvidados < 300 && custo < 15000) {
            System.out.println("Festa Junina");
        } else if (qntConvidados < 300 && custo >= 15000) {
            System.out.println("Aniversário");
        } else if (qntConvidados >= 300 && custo < 15000) {
            System.out.println("Formatura");
        } else System.out.println("Casamento");
    }

}
