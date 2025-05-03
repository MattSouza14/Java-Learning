package Exercicios.ListaExercicios;

public class Carro extends Transporte{

        private int quilometragem;

        public Carro() {
            super();
            this.quilometragem = 0;
        }

        public int getQuilometragem() {
            return quilometragem;
        }
        public void setQuilometragem(int quilometragem) {
            if (quilometragem >= 0 && quilometragem <= 999999) {
                this.quilometragem = quilometragem;
            } else {
                System.out.println("Quilometragem invalida");
            }
        }
        @Override
        public void setVelocidade(int velocidade) {
            if (velocidade >= 0 && velocidade <= 200) {
                super.setVelocidade(velocidade);
            } else {
                System.out.println("A velocidade do carro deve estar entre 0-200");
            }
        }
    }

