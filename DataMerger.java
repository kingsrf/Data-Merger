
public class DataMerger {
    
    public static void merge(int[] customerData1, int m, int[] customerData2, int n) {
        
        // Pointer for the last valid element in customerData1
        int i = m - 1;
        
        // Pointer for the last valid element in customerData1
        int j = n - 1;
        
        // // Pointer for the last psoition in customerData1 (m + n -1)
        int k = m + n - 1;
        
        //
        while (i >= 0 && j >= 0) {
            // Compare the current element from both arrays
            if (customerData1[i] > customerData2[j]) {

                // If current element of customerData1 is greater,
                // place it at the current end position and move i and k backward
                customerData1[k--] = customerData1[i--];
            } else {
                // Else, place the current element of cutomerData2,
                // and move j and k backward.
                customerData1[k--] = customerData2[j--];
            }
        }
        
        // If there are any remaining elements in cutomerData2
        // copy them into customerData1
        while (j >= 0) {
            customerData1[k--] = customerData2[j--];
        }
    }
}
