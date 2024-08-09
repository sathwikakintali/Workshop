public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("there is no second largest element");
        }
        return second;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        try{
            int result = findSecondLargest(arr);
            System.out.println("The second largest element is:"+result);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
