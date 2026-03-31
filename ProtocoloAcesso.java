import java.util.Scanner;

public class ProtocoloAcesso {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println(" Digite o nível de acesso: ");
String nivel = sc.nextLine();

System.out.println(" Digite o país: ");
String país = sc.nextLine();


if (nivel.equalsIgnoreCase("TOTAL") && !país.equalsIgnoreCase("Brasil")) {
System.out.println("ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados");
} else if (país.equalsIgnoreCase("Brasil")) {
System.out.println("Acesso autorizado ao Almirantado");
}

sc.close();
}
}