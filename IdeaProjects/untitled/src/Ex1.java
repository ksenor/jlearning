/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 3/31/13
 * Time: 12:06 PM
 * To change this template use File | Settings | File Templates.
 */

public class Ex1 {

    public static String isMama(int i) {
        if ((i%3==0)&&(i%5!=0)) {
            System.out.println(i + ": Mama");
            return "Mama";
        }
        return null;
    }

    public static String isPapa(int i) {
        if ((i%3!=0)&&(i%5==0)) {
            System.out.println(i + ": Papa");
            return "Papa";
        }
        return null;
    }

    public static String isPapaMama(int i) {
        if ((i%3==0)&&(i%5==0)) {
            System.out.println(i + ": PapaMama");
            return "PapaMama";
        }
        return null;
    }

    public static void main(String[] args) {
        int i;
        for (i=0; i<=100; i++) {
            isMama(i);
            isPapa(i);
            isPapaMama(i);
        }
    }
}