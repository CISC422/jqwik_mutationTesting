/* CISC/CMPE 328, CISC 422
 * RIPR model, coverage and property-based testing: first examples
 */

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.Size;
import net.jqwik.api.constraints.UniqueElements;
import org.assertj.core.api.Assertions;

import java.util.Arrays;

public class MaxProperties {

    @Property
    void maxPosProp(@ForAll("myIntArrays") int[] a) {
        int res = MaxPos.maxPos(a);

        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[0]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[1]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[2]);
        Assertions.assertThat(a[res]).isGreaterThanOrEqualTo(a[3]);
    }
    // generates arrays of ints containing 10, 11, 12, or 13
    @Provide
    Arbitrary<int[]> myIntArrays() {
        return Arbitraries.integers().between(10,13).array(int[].class).ofSize(4);
    }
}
