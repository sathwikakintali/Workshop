import java.util.*;
public class Frequency {
    private static ArrayList<Integer> Array;
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,7,3,4,9,4,5,9);
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        for (int num : list) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//        ArrayList<Integer> a = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> it : frequencyMap.entrySet()) {
//            a.add(it.getValue());
//        }
//        Collections.sort(a);
//        System.out.println(a);
        countt(list);
    }

    public static void countt(List<Integer> list) {
        int size = list.size();
        int arr[] = new int[size];
        int count = 1;
        for (int i = 0; i < size; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
            else {
                System.out.println(arr[i] + ":" + count);
                count=1;
            }
        }
        System.out.println(arr[size - 1] + ":" + count);
    }
}



