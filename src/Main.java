import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Double.*;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Festa festa;

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

        festa.mostrar();
        festa.classificar();
    }
}