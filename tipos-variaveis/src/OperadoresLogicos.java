public class OperadoresLogicos {
    
    public static void main(String[] args ){

        /* Neste projeto está exemplificado exemplos de testes com operadores lógicos  
         * 
         * Obs: esses teste são aplicaveis para em expressões matemáticas 
        */

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        /* Operador lógico E (representado por “&&”)
         * 
         * Neste operador a condição só da verdadeiro se as duas condicões foram verdadeiras
         */
        System.out.println("b1 && b2" + (b1 && b2));
        System.out.println("b1 && b3" + (b1 && b3));




        /* Operador lógico OU (representado por “||”) 
         * 
         * Neste operador lógico a condição da verdadeira se qualquer uma das condições forem verdadeiras
        */
        System.out.println("b1 || b2" + (b1 || b2));
        System.out.println("b1 || b3" + (b1 || b3));

        
        
        /* Operador lógico XOR (representado por “^”) 
         * 
         * Neste operador lógico a condição da verdadeira quando somente das condições forem verdadeiras
        */     
        System.out.println("b1 ^ b2" + (b1 ^ b2));
        System.out.println("b1 ^ b3" + (b1 ^ b3));

        
        /* Operador lógico NEGAÇÃO (representado por “!”) 
         * 
         * Neste operador lógico retorna verdaderio se o operando tem o valor falso, e retorna falso se o operando tem o valor verdadeiro.
        */ 
        System.out.println(!b3);
        System.out.println(!b4);

    }
}
