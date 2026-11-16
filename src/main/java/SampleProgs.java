/* CISC/CMPE 328, CISC 422
 */
public class SampleProgs {
      /** 14 mutants */
    public static int xor1(boolean b1, boolean b2) {
        int res = 0;
        if (b1) {
            res = res + 1;
        }
        if (b2)
            res = res+1;
        return res%2;
    }
    /** 14 mutants */
//    public static int xor2(boolean b1, boolean b2) {
//        return ((b1?1:0)+(b2?1:0))%2;
//   }
      /** 18 mutants */
//    public static int xor3(boolean b1, boolean b2) {
//        int res = 0;
//        if (b1) res = (res+1)%2;
//        if (!(b2==false)) res = (res+1)%2;
//        return (res%2);
//    }

}

