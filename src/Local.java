public class Local {

    private Integer largura;
    private Integer comprimento;


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

    public void mostra() {
         Integer tamanho = comprimento * largura;
        System.out.println("Dados do Local: " +
                "\n" + "Largura: " + largura + "m" +
                "\n" + "Comprimento: " + comprimento + "m" +
                "\n" + "Tamanho do espaço: " + tamanho + "m²");
    }
}
