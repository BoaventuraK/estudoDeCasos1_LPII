package caso1;

public class Carro {
    private String modelo=null, direcao=null;
    private int velocidade=0, aceleracao=0, marcha=0;
    private boolean ligado=false;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
    public int getAceleracao() {
        return aceleracao;
    }

    public Boolean ligar(){
        ligado=true;
        return ligado;
    }
    public Boolean desligar(){
        ligado=false;
        return ligado;
    }

    public void acelerar(){
        ++velocidade;
    }
    public void frear(){
        --velocidade;
    }

    public String virarDireita(){
        if(direcao=="esquerda"){
            direcao="reto";
        } else {
            direcao="direita";
        }
        return direcao;
    }
    public String virarEsquerda(){
        if(direcao=="direita"){
            direcao="reto";
        } else{
            direcao="esquerda";
        }
        return direcao;
    }

    public void aumentarMarcha() {
        if (marcha<6) {
            ++marcha;
        }
    }
    public void diminuirMarcha(){
        if(marcha>0) {
            --marcha;
        }
    }
}
