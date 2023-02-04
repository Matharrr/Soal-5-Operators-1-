package p2.w2soal5operators.pkg1;

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class P2W2Soal5Operators1 {
    static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args){
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}