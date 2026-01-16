package LeetCodeSolPack;

import java.util.ArrayList;
import java.util.Collections;

public class leadersInArray {
    public ArrayList<Integer> getLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        leadersInArray lead = new leadersInArray();
        int[] arr = {10, 4, 2, 4, 1};
        System.out.println(lead.getLeaders(arr));
    }
}
