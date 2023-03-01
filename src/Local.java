public class Local {

    private Integer largura;
    private Integer comprimento;

    public Local() {
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getComprimento() {
        return comprimento;
    }

    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }

    public Integer tamanhoEspaco() {
        Integer tamanho;
        return tamanho = getComprimento() * getLargura();
    }

    public String mostra() {
         tamanhoEspaco();
        return ("Dados do Local: " +
                "\n" + "Largura: " + largura + "m" +
                "\n" + "Comprimento: " + comprimento + "m" +
                "\n" + "Tamanho do espaço: " + tamanhoEspaco() + "m²");
    }
}
