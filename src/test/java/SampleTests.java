/* CISC/CMPE 328, CISC 422
 * RIPR model, coverage and property-based testing: first examples
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTests {
    /** mutation score: 11/14, line/branch coverage: 100% */
    @Test
    void test1a() {
        int res = SampleProgs.xor1(true,true);
        Assertions.assertThat(res).isEqualTo(0);
    }
    @Test
    void test1b() {
        int res = SampleProgs.xor1(false,false);
        Assertions.assertThat(res).isEqualTo(0);
    }
    /** mutation score: 12/14, line/branch coverage: 100% */
//    @Test
//    void test2a() {
//        int res = SampleProgs.xor2(true,true);
//        Assertions.assertThat(res).isEqualTo(0);
//    }
//    @Test
//    void test2b() {
//        int res = SampleProgs.xor2(false,false);
//        Assertions.assertThat(res).isEqualTo(0);
//    }
      /** mutation score: 10/18 mutants, line/branch coverage: 100% */
//    @Test
//    void test3a() {
//        int res = SampleProgs.xor3(true,true);
//        Assertions.assertThat(res).isEqualTo(0);
//    }
//    @Test
//    void test3b() {
//        int res = SampleProgs.xor3(false,false);
//        Assertions.assertThat(res).isEqualTo(0);
//    }
}
