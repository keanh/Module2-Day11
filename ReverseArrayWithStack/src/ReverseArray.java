import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        stack.push(arr[0]);
        stack.push(arr[1]);
        stack.push(arr[2]);
        stack.push(arr[3]);
        stack.push(arr[4]);

        int i=0;
        while (stack.size() != 0){
            arr[i] = stack.pop();
            //System.out.println(arr[i]);
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
