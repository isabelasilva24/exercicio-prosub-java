import java.util.Scanner;

public class OrcamentoProjeto {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do repasse anual (em bilhões de reais): ");
    double valor = sc.nextDouble();

    if ( valor < 0.5) {
    System.out.println(" ALERTA: Risco de paralização total. Data estimada: 2045");
    } else if (valor >= 0.5 && valor <= 1.0 ) {
        System.err.println("Ritmo lento: Finalização prevista para 2037");
    } else {
        System.err.println("Projeto acelerado: Possibilidade de antecipação da entrega.");

    }
    sc.close();
    }
    }