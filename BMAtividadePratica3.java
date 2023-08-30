public class BMAtividadePratica3 {
    public static void main(String[] args) {
        float arroz = (float) 2.95;
        float feijao = (float) 3.50;
        System.out.println("O arroz custa " + arroz + "R$ e o feijão custa " + feijao + "R$.");
        float total = (float) arroz + feijao;
        final float TAXA = (float) 0.0825;
        float taxaCalculada = (float) total * TAXA;
        System.out.println("O total é " + taxaCalculada + "R$ com a taxa.");
        arroz *= TAXA;
        feijao *= TAXA;
        float novoCusto = (float) arroz + feijao;
        Boolean muitoCaro;
        if(novoCusto > 10) {
            muitoCaro = true;
        } else {
            muitoCaro = false;
        }
        System.out.println(muitoCaro);
    }
}
