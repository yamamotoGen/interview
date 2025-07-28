package algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class StringLengthSort {
    public static void main(String[] args) {
        String[] strings = {"juice", "cabage", "potatos", "mango", "tea", "me"};
        String[] newArr = sortStringsByLength(strings);
        System.out.println(Arrays.toString(newArr));
    }

    public static String[] sortStringsByLength(String[] strings) {
        String[] result = Arrays.copyOf(strings, strings.length);

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        return result;
    }
}

