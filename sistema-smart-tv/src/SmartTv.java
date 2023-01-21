public class SmartTv {
    static boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


    public void aumentarVolume(){

        volume++;

        System.out.println("Subundo o Volume para :" + volume);

    }

    public void diminuirVolume(){

        volume--;

        System.out.println("Diminuindo o Volume para:" + volume);


    }   
    
    
    public void aumentarCanal(){

        canal++;

        System.out.println("O Canal atual é : " + canal);
    }

    
    public void diminuirCanal(){

        canal--;

        System.out.println("O Canal atual é : " + canal);
    }

    public void digitarCanal(int novoCanal){

        canal = novoCanal;

        System.out.println("O Canal atual é : " + canal);


    }

}
