/* Ao executar esse programa, digite o seguinete comando no terminal: java AboutMe EFREM FEREEIRA 32 1.78 
 * 
 * O resultado esperado é :
 * Ola, me chamo EFREM FEREEIRA
 * Tenho 32anos
 * Minha altura é : 1.78cm
 */

public class AboutMe {

    public static void main(String[] args) {
        
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + "anos ");
        System.out.println("Minha altura é : " + altura + "cm");
    }
    
}
