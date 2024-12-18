//          Classe                    X          Tipo Primitivo
/***
 *   Vantagem: Usufrui de todos os            Vantagem: mais simples e performatico.
 *   recuros OO.                              Variáis são caixas.
 *   Variáveis são ponteiros.                 Não instancia, uma vez declarados estão
 *   Objetos precisam ser instanciados        prontos para uso.
 *   usando new ou apontar para um            Não aceitar valor null.
 *   objeto já existente.                     Y = X -> Y recebe uma copia de X
 *   Aceita valor null.                       "Objetos" instaciados no stack.
 *   Y = X -> Y passa a apontar para          "Objetos" São desacolados imediatamente
 *   onde X aponta.                           quando seu escopo de execução é finalizado.
 *   Objetos Instaciados no heap.
 *   Objetos não utilizados são desalo
 *   cados em um momento próximo pelo
 *   garber collector.
 */
//Garber collecto -> processo que automatiza o gerenciamento de memória de uma
//programa em execução.
//Monitora os objetos alocados dinamicamente pelo programa(no heap), desalocando
//aquelas que não estão mais sendo utilizados.