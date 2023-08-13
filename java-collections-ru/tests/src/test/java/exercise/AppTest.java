package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> integerList = new ArrayList<>(1, 2, 3, 4);
        int count = 2;

        int result = App.take(integerList, count);

        assertThat(result).hasSize(count);
        // END
    }
}
