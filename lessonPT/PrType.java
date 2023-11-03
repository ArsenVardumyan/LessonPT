package lessonPT;

public class PrType {
    public static void main(String[] args) {

        /**
         * byte -128 (-2^7) -  127(2^7-1)
         * 8 bit
         */
        byte b = 127;
        System.out.println(b);

        /**
         * short -32768(-2^15) -  32767(2^15-1)
         * 16 bit
         */
        short s = 32767;
        System.out.println(s);

        /**
         *  կամայական ամբողջ թիվ ինթա
         * int -2147483648(-2^31) -  2147483647(2^31-1)
         * 32 bit
         */
        int i = 2147483647;
        System.out.println(i);

        /**
         * long -9223372036854775808(2^63) -  9223372036854775807(2^63-1)
         * 64 bit
         */
        long l = 9223372036854775807l;
        System.out.println(l);


        /**
         * կամայական ստորակետով թիվ ֆլոթա
         * float 32 bit
         */
        float f = 214748.7f;
        System.out.println(f);


        /**
         * double 64 bit
         */
        double d = 65465488987879.65464;
        System.out.println(d);


        boolean bo = true;
        System.out.println(bo);
        bo = false;
        System.out.println(bo);


        /**
         * 16 bit unicod character
         */
        char c='{';
        System.out.println(c);
        char cc='\u003f'; // ?
        System.out.println(cc);


        /**
         * անսահմանափակ տեքստ
         */
        String s1="Primitiv type";
        System.out.println(s1);

        String firstName="Arsen";
        String lastName="Vardumyan";
        System.out.println(firstName + " " + lastName);

        int k=25;
        System.out.println("k=" +( k+5));
        System.out.println("k=" + --k);
    }
}
