public class BoxingUnbobixWrapper {
    //Boxing -> conversão de um objeto tipo valor para um objeto tipo
    // referência compatível

    //Unboxing -> processo de conversão de um
    // objeto tipo referência para um objeto tipo valor compatível

    //Wrapper classe -> classes equivalentes aos tipo primitivos

    /***
     * int - Integer
     * byte - Byte
     * short - Short
     * long - Long
     * float - Float
     * double - Double
     * boolean - Boolean
     * char - Character
     */

    public static void main(String[] args) {
        //Boxing
        int x = 20;
        Object obj = x;
        System.out.println(obj);

        //Unboxing
        int y = (int) obj;
        System.out.println(y);


    }
}
