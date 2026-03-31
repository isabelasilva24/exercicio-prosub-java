import java.util.Scanner;

public class PropulsãoReator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println(" Digite a temperatura do reator (°C): ");
double temperatura = sc.nextDouble();

if (temperatura < 280) {
System.out.println("Aumentar potência do reator");
} else if (temperatura >= 280 && temperatura <= 350) {
System.out.println("Operação Normal - Cruzeiro");
} else {
System.out.println("EMERGÊNCIA: Acionar sistema de resfriamento e emergência");
}

sc.close();
}
}