public class Operadores {

    public static void main(String[] args){

//O sinal de igual(=) é usando como operador de atribuição

//Para atribuir uma string é necessário usar as aspa dupla "TEXTO"
String nome = "GLEYSON";
//Valores como int e double são declarados diretamente, mas o double não interpreta a virgula, ele usa o ponto 
int idade = 22;
double peso = 68.5;
// o char aceita somente um caracter e usa aspa simples na atribuição 'TEXTO'
char sexo = 'M';
//Boleano trabalha o os valores verdadeiro(True) e falso(False), por padrão, caso não atribua um valor ele vem como false. 
boolean doadorOrgao = false;
//Declaração de classe
//Date dataNascimento = new Date();


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





    }
    
}
