public class BMAtividadePratica4 {
    public static void main(String[] args) {
    /*  long long1 = 100;
        int int1 = 200;
        int int2 = int1 + long1;
    */
    /*Essa é  aversão do código errada, como declarada na questão
    e seu erro é somar dois valores de 32 e 64 bits, portanto a forma correta 
    corrigir isso é a descrita mais adiante.
    */
    long long1 = 100;
    int int1 = 200;
    int int2 = (int) (int1 + long1); //Conversão explícita do valor.

    }
}
