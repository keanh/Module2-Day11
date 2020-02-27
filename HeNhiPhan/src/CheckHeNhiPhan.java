import java.util.Stack;

public class CheckHeNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int number = 11;
        while (number != 0){
            int phanDu = number % 2;
            stack.push(phanDu);
            number /= 2;
        }
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }
}
