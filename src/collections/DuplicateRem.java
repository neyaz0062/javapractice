package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateRem {
    public static void main(String[] args) {
        int[] arr = new int[] {1,9,5,9,5,1,6,9,9,1,1,1,9,9};

        int[] tempArr = new int[arr.length];
        int j=0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1 ; i++) {
            if (!(arr[i] == arr[i+1])) {
                tempArr[j++] = arr[i];
            }
        }
        tempArr[j++] = arr[arr.length-1];

        List<Integer> list = new ArrayList<>();
        for(int i : tempArr) {
            list.add(i);
        }

        for(Integer i : list) {
            if (!(i == 0)) {
                System.out.print(i+" ");
            }

        }

    }


}
