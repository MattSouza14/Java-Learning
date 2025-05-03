package Exercicios.ListaExercicios;

public class Equipamento {
    private Boolean ligado;

    public Equipamento(){

    }


    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }


    public boolean ligar(){
        this.ligado = true;
        return ligado;
    }

    public boolean desligar(){
        this.ligado = false;
        return  ligado;
    }

}
