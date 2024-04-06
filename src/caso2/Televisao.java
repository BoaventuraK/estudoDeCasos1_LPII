package caso2;

public class Televisao {
    private String marca=null;
    private int tamanhoTela=0, volume=0, voltagem=110, canal=1;
    private boolean ligado=false;

    public Televisao(int tamanhoTela){
        this.tamanhoTela=tamanhoTela;
        this.volume=5;
    }

    public Boolean getLigado(){
        return ligado;
    }

    public void ligarTv(){
        ligado=true;
        int consumo=tamanhoTela*voltagem;
        System.out.println(String.format("\nConsumo: %dkWh",consumo));
    }
    public void desligarTv(){
        ligado=false;
    }

    public int aumentarVolume(){
        if(volume<10){
            ++this.volume;
        }
        return this.volume;
    }
    public int diminuirVolume(){
        if(this.volume>0){
            --this.volume;
        }
        return this.volume;
    }

    public int aumentarCanal(){
        ++this.canal;
        return this.canal;
    }
    public int diminuirCanal(){
        if(this.canal > 1){
            --this.canal;
        }
        return this.canal;
    }

    public void listarDados(){
        System.out.println(String.format("Canal: %d \nVolume: %d",this.canal,this.volume));
    }
}
