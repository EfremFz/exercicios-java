public class Operadores {

    public static void main(String[] args){

//O sinal de igual(=) é usando como operador de atribuição

//Para atribuir uma string é necessário usar as aspa dupla "TEXTO"
String nome = "Efrem";
//Valores como int e double são declarados diretamente, mas o double não interpreta a virgula, ele usa o ponto 
int idade = 22;
double peso = 68.5;
// o char aceita somente um caracter e usa aspa simples na atribuição 'TEXTO'
char sexo = 'M';
//Boleano trabalha o os valores verdadeiro(True) e falso(False), por padrão, caso não atribua um valor ele vem como false. 
boolean doadorOrgao = false;
//Declaração de classe
Date dataNascimento = new Date();


//Exemplos de opoerações matematicas usandos operadores aritimeticos (+)soma , (-)subitração, (*)multiplicação, (/)Divisão e (%)mod "esse operador verifica o resto da divisão"
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20/4);

//Operadires Unários usados


        //Pro padrão os numeros são implisitamente positivos
            int numero = 5;

            System.out.println(numero);

        //Usando operadores unários para alterar o valor da variável para negativo 

            numero = - numero;
            
            System.out.println(numero);

        //Usand o operador para alterar novamente para positivo 

            numero = numero * -1;// nesta linha não foi usando o aperador de + , por nçao funconar que nem o negativo, foi necessáro usar uma conta

            System.out.println(numero);

        // incremento e decremento pré-fixado e pós-fizado
        //Os exemplos estão com operador ++ , mas o mesmo vale par ao operador --

            numero = numero ++; // Incremento pós-fixado, ou seja ele só vai incrementar a variável após usa-la

            System.out.println(numero);

            numero = ++numero; // Incremento pré-fizado , ou seja ele vai incrementar entes de esuar a váriável 

            System.out.println(numero);

        //Inverções de valores em variáveis boleanas
        
            boolean variavel = true;

            System.out.println(variavel);

            variavel = !variavel;// Estou usando o operador de negação para enverter o valor original da variável

            System.out.println(variavel);


            //Operador ternario
            //O resultado ca operação ternária é sembre um resultado boleano (verdadeiro/falso)
            /*Esse operador  funciona igual ao IF, seguindo a seguinte estrutura:
            Condiçao de teste, neste caso a==b depois o simbolo "?" Resultado caso Verdadeiro, Depois vem o simbolo ":" e o resultado caso de falso*/

            int a, b ;
            a = 6;
            b = 6;


            String resposta = a==b ? "A  é igual à B" : "A é diferente de B";// A condição ternária começa no a==b

            System.out.println(resposta);

        //Operadores relacionais

        /*  == Quando desejamos verificar se uma variável é IGUAL A outra.
            != Quando desejamos verificar se uma variável é DIFERENTE da outra.
            > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
            >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
            < Quando desejamos verificar se uma variável é MENOR QUE outra.
            <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra 
        */

            int numero1 = 1;
            int numero2 = 2;
            
            if(numero1 > numero2)
                System.out.println("Numero 1 maior que numero 2");
            
            if(numero1 < numero2)
                System.out.println("Numero 1 menor que numero 2");
            
            if(numero1 >= numero2)
                System.out.println("Numero 1 maior ou igual que numero 2");
            
            if(numero1 <= numero2)
                System.out.println("Numero 1 menor ou igual que numero 2");
            
            if(numero1 != numero2)
                System.out.println("Numero 1 é diferente de numero 2");

        //Comparações mais avançadas
        
       
            String nome1 = "JAVA";
            String nome2 = "JAVA";
            
            System.out.println(nome1 == nome2); 
    
            String nome3 = new String("JAVA");// criação de um novo objeto
            
            System.out.println(nome1 == nome3); 
    
            String nome4 = nome3;
    
            System.out.println(nome3 == nome4); 
            
            //equals serve para comparar valores dentro de objetos
            System.out.println(nome1.equals(nome2));
            System.out.println(nome2.equals(nome3));
            System.out.println(nome3.equals(nome4));



        //Operadores Lógicos 
        
        /*
            O "&"(E) vai dar o resultado VERDADEIRO somente se as duas condições forem verdadeiras.
            Já o  "||" (OU) vai dar resultado VERDADEIRO se qualquer uma das duas condições forem verdadeiras.

         */


         boolean condicao1=true;

         boolean condicao2=false;
         
                 
         if(condicao1 && condicao2)
             System.out.print("Os dois valores precisam ser verdadeiros");;
         
         //Se condicao1 OU condicao2 for verdadeira, executar código.
         if(condicao1 || condicao2)
             System.out.print("Um dos valores precisa ser verdadeiro");

    }
    
}