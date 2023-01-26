public class ControleFluxo {

    public static void main(String[] args){


        /* Exemplo de um controle de fluxo switch/case
         * 
         * O Switch é indicado para quando vai trabaalhar com um falor definido
         */

         int numero = 4;

         // Exemplo com valor numerico
         switch (numero){
            case 1:
            case 2: 
            case 3: 
            case 4: System.out.println("O valor da variavel numero é : " + numero);
                    break;
            default: System.out.println("Numero invalido");
        /*
        No exemplo acima o switch pode agrupar mais de um caso no memso resultado, para fazer isso basta não usar o breack,
        como foi feito nos casos 1, 2 e 3, caso tivesse digitado qualquer um desses valores ele ia dar como resultado o caso 4

        Caso queria um resuktado para cada caso, basta respeitar a extrutura do caso 4 e usar o breack no final

        O default é usado para o caso de se nenhum dos resultados tenha sido atendido nos case
        */ 

        }

        String mes = "Janeiro";

        //Exemplo de Switch com String
        switch (mes){
            case "Janeiro": System.out.println("O mês da da variável mes é : " + mes);
                    break;
            case "Fevereiro": System.out.println("Mês incorreto");
                    break;
            case "Março": System.out.println("Mês incorreto");
        default: System.out.println("Mês invalido");
                    
        }

        //Exemplo de if/else

        if (numero ==10){
            System.out.println("O numero é 10");
        }else if (numero >5){
                System.out.println(" Numero maior que 5");
        }else if (numero == 4){
                System.out.println("Numero é igual a 4");
        }else {
            System.out.println("Numero invalido");
        }
        

    }
    
}
