package entities;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;

    public Carro(){

    }

    public Carro(String marca, String modelo, Integer ano) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String toString(){
        return "Caracteristicas do carro: "
                +" Modelo: " + modelo
                +" Macar: " + marca
                +String.format(" Ano: %d", ano);
    }

    public int CalcularIdadeDoCarro(Integer anoAtual){
        int idadeCarro = anoAtual - ano;
        return  idadeCarro;
    }
}
