import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class DataMergerTest {
    
    @Test
    public void testExampleOne() {
        int[] data1 = {101,104,107,0,0,0};
        int[] data2 = {102,105,108};
        DataMerger.merge(data1, 3, data2, 3);
        assertArrayEquals(new int[]{101, 102, 104, 105, 107, 108}, data1);
    }
    
    @Test
    public void testExampleTwo() {
        int[] data1 = {103};
        int[] data2 = {};
        DataMerger.merge(data1, 1, data2, 0);
        assertArrayEquals(new int[]{103}, data1);
    }
    
    @Test
    public void testNormalCase() {
        int[] data1 = {1, 3, 5, 0, 0, 0};
        int[] data2 = {2, 4, 6};
        DataMerger.merge(data1, 3, data2, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, data1);
    }
    
    @Test
    void testNormalCase2() {
        int[] data1 = {1,3,5,0,0,0};
        int[] data2 = {2,4,6};
        DataMerger.merge(data1, 3, data2, 3);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, data1);
    }

    @Test
    void testNormalCase3() {
        int[] data1 = {1,2,3,0,0,0};
        int[] data2 = {4,5,6};
        DataMerger.merge(data1, 3, data2, 3);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, data1);
    }

    @Test
    void testEdgeCaseEmptyData2() {
        int[] data1 = {103};
        int[] data2 = {};
        DataMerger.merge(data1, 1, data2, 0);
        assertArrayEquals(new int[]{103}, data1);
    }

    @Test
    void testEdgeCaseEmptyData1() {
        int[] data1 = {0};
        int[] data2 = {99};
        DataMerger.merge(data1, 0, data2, 1);
        assertArrayEquals(new int[]{99}, data1);
    }

    @Test
    void testEdgeCaseAllZeros() {
        int[] data1 = {0,0,0};
        int[] data2 = {1,2,3};
        DataMerger.merge(data1, 0, data2, 3);
        assertArrayEquals(new int[]{1,2,3}, data1);
    }
}
