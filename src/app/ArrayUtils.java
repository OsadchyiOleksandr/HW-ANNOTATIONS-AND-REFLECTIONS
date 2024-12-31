package app;

import app.annotation.Author;
import app.annotation.MethodInfo;

public class ArrayUtils {

    @MethodInfo(
            name = "sumOfEl",
            returnType = "int",
            description = "Calculate sum of array"
    )
    @Author(firstName = "Peter", lastName = "Jons")
    public static int sumOfEl(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    @MethodInfo(
            name = "maxEl",
            returnType = "int",
            description = "Find Max element of Array"
    )
    @Author(firstName = "Mariya", lastName = "Steel")
    public static int maxEl(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @MethodInfo(
            name = "minEl",
            returnType = "int",
            description = "Find Max element of Array"
    )
    @Author(firstName = "Oleks", lastName = "Rolex")
    public static int minEl(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
