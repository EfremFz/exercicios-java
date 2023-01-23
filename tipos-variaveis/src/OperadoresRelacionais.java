public class OperadoresRelacionais {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 15;
        float f1 = 3.07f;
        float f2 = 5.15f;
        double d1 = 59.6d;
        double d2 = 30.7d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Efrem";
        String s2 = "Vandressa";
        String s3 = "Dante";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 135L;
        long l2 = 354864L;
        byte y1 = 1;
        short h1 = 25;

        //Comparação com dados do tipo (int) Inteiro
        System.out.println("i1 == i2" + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 < i2 " + (i1 < i2));

        //Comparaçã com dados do tipo (float) ponto flutuante
        System.out.println("f1 == f2" + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 > f2 " + (f1 > f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        //Comparação com dados do tipo (chat)
        System.out.println("c1 == c2" + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 < c2 " + (c1 < c2));

        //Comparação ccom dados do tipo String
        System.out.println("s1 == s2" + (s1 == s2));
        System.out.println("s1 == s3" + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        //System.out.println(s1 >= s2);//Essa expressão da erro, não existe essa logica de comparação com strings
        //System.out.println(s1 < s2);//Essa expressão da erro, não existe essa logica de comparação com strings

        //Comparação ccom dados do tipo Boolean
        System.out.println("b1 == b2" + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //System.out.println(b1 >= b2);//Essa expressão da erro, não existe essa logica de comparação com Boolean
        //System.out.println(b1 < b2);//Essa expressão da erro, não existe essa logica de comparação com Boolean

        //Comparação ccom dados do tipo int, float, short
        System.out.println("i1  > f2" + (i1  > f2));
        System.out.println("d1 == h1 " + (d1 == h1));
        //System.out.println(s2 = c1);//Essa expressão da erro, não existe essa logica de comparação entre string e char
        //System.out.println(s3 != i1);//Essa expressão da erro, não existe essa logica de comparação entre string e inteiro


        System.out.println("l1 == i2" + (l1 == i2));
        System.out.println("l2 >= i1" + (l2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1));




    }
}