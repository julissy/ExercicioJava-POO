import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Double.*;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Festa festa;
        Local local;

        festa = new Festa();

        System.out.print("Digite o nome do responsável pela festa: ");
        festa.setNome(sc.nextLine());

        System.out.print("Digite o cpf do responsável pela festa: ");
        festa.setCpf(sc.nextLine());

        System.out.print("Digite a quantidade de convidados: ");
        festa.setQntConvidados(Integer.parseInt(sc.nextLine()));

        System.out.print("Digite o valor da festa: ");
        festa.setCusto(Double.parseDouble(sc.nextLine()));

        System.out.println();

        local = new Local();
        System.out.print("Digite a largura do espaço: ");
        local.setLargura(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite a largura do espaço: ");
        local.setComprimento(Integer.parseInt(sc.nextLine()));

        System.out.println(festa.mostrar());
        System.out.println(festa.classificar());
        System.out.println(local.mostra());
        System.out.println(festa.possivelLocal(local.tamanhoEspaco()));
    }
}