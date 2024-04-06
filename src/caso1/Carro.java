package caso1;

public class Carro {
    private String modelo=null, direcao="reto";
    private int velocidade=0, aceleracao=0, marcha=0;
    private boolean ligado=false;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
    public int getAceleracao() {
        return this.aceleracao;
    }

    public Boolean ligar(){
        ligado=true;
        return this.ligado;
    }
    public Boolean desligar(){
        if(this.velocidade==0){
            ligado=false;
        }

        return this.ligado;
    }

    public void acelerar(){
        ++this.velocidade;
    }
    public void frear(){
        --this.velocidade;
    }

    public String virarDireita(){
        if(this.direcao=="esquerda"){
            this.direcao="reto";
        } else {
            this.direcao="direita";
        }
        return this.direcao;
    }
    public String virarEsquerda(){
        if(this.direcao=="direita"){
            this.direcao="reto";
        } else{
            this.direcao="esquerda";
        }
        return this.direcao;
    }

    public void aumentarMarcha() {
        if (this.marcha<6) {
            ++this.marcha;
        }
    }
    public void diminuirMarcha(){
        if(this.marcha>0) {
            --this.marcha;
        }
    }

    public void listarDados(){
        String status;
        if(this.ligado){
            status="Ligado";
        }else{
            status="Desligado";
        }
        System.out.println(String.format("Status: %s \nVelocidade: %d \nMarcha: %d \nDireição: %s \n",status,this.velocidade,this.marcha,this.direcao));
    }
}





