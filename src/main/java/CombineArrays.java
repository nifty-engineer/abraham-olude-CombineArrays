
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int totalLength = arr1.length + arr2.length;
        int[] combinedArr = new int[totalLength];

        for (int i = 0; i < combinedArr.length; i++) {
            
            if (i >= arr1.length) {
                combinedArr[i] = arr2[i - arr1.length];
            }
            else {
                combinedArr[i] = arr1[i];
            }
        }

        return combinedArr;
    }
}
