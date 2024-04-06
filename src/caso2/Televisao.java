package caso2;

public class Televisao {
    private String marca=null;
    private int tamanhoTela=0, volume=0, voltagem=110, canal=0;
    private boolean ligado=false;

    public Televisao(){
        this.volume=5;
    }

    public void ligarTv(){
        ligado=true;
        int consumo=tamanhoTela*voltagem;
        System.out.println(String.format("Consumo: %dkWh",consumo));
    }
    public void desligarTv(){
        ligado=false;
    }

    public int aumentarVolume(){
        if(volume<10){
            ++volume;
        }
        return volume;
    }
    public int diminuirVolume(){
        if(volume>0){
            --volume;
        }
        return volume;
    }

    public int aumentarCanal(){
        ++canal;
        return canal;
    }
    public int diminuirCanal(){
        --canal;
        return canal;
    }
}
