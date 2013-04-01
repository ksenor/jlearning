/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/1/13
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Homework1 {
    public static void main(String args[]) {
        int i;
        for (i=0; i<=100; i++) {
            if ((i%3==0)&&(i%5!=0))
                System.out.println(i + ": Mama");
            if ((i%3!=0)&&(i%5==0)) {
                System.out.println(i + ": Papa");
            }
            if ((i%3==0)&&(i%5==0)) {
                System.out.println(i + ": PapaMama");
            }
        }
    }
}



