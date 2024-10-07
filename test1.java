import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] productExceptSelf(int[] array) {
            int length = array.length;
            if (length == 1) {
                return array;
            }
            int[] result = new int[length];
            int zerosIndex=-1;
            int product = 1;
            for (int index = 0; index < length; index++) {
                if (array[index] == 0) {
                    if (zerosIndex!=-1)
                        return result;
                    zerosIndex=index;
                } else {
                    product *= array[index];
                }
            }
            if (zerosIndex!= -1) {
                result[zerosIndex]=product;
            } else {
                for (int index = 0; index < length; index++) {
                    result[index] = product / array[index];
                }
            }
            return result;
        }

    }
}
