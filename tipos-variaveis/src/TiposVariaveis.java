public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       double salarioMinimo = 2500.33;
       
       
       //neste exemplo, temntei atribuir um lavor a de tipos diferentes, foi o usaso o conceito de cast para alterar o tipo da variável 
       short numeroCurto = 1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 =  (short) numeroNormal;

       //exemplos simples de alteração de valor de uma variável
       int numero = 5;
       numero = 10;
       System.out.println(numero);

       //Exemplode váriável com valor imutavel(constante), neste caso é usado o nome de variável maiucula e com  a palavra reservada (FINAL)

       final double VALOR_DE_PI = 3.14;
       //Ao usar o final em uma váriável, não será permitido atribuir um  novo valor, vai dar erro 
       VALOR_DE_PI = 10.14;

    


    }
}
