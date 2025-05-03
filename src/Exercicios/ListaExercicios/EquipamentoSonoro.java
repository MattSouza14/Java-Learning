package Exercicios.ListaExercicios;

public class EquipamentoSonoro extends  Equipamento {
    private short volume;
    private boolean stereo;

    public EquipamentoSonoro() {
        super();
        this.volume = 0;
        this.stereo = false;
    }


    public boolean isStereo() {
        return stereo;
    }

    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }

    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        if (volume >= 0  && volume <= 10){
            this.volume = volume;
        }else{
            System.out.println("Volume tem que set entre 0 e 10");
        }
    }
    @Override
    public boolean ligar(){
        super.ligar();
        this.setVolume((short) 5);
        return true;
    }

    public boolean mono(){
        this.stereo = false;
        return  stereo;
    }
    public boolean stereo(){
        this.stereo = true;
        return  stereo;
    }
}