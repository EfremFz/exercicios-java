import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu primeiro nome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é : " + altura + "cm");
    }
    
}
