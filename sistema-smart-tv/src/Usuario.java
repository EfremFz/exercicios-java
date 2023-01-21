public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();



        System.out.println(" TV Ligada ? " + SmartTv.ligada);
        System.out.println(" Canal Atual : " +smartTv.canal);
        System.out.println(" Volume Atual : " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Statuas---> TV Ligada ? " + SmartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Statuas---> TV Ligada ? " + SmartTv.ligada);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.digitarCanal(13);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();




    }
}
