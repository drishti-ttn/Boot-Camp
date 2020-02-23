import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
    Stack<Integer> st = new Stack<>();

    public void push(int item) {
        if (isEmpty() == true) {
            st.push(item);
            super.push(item);
        } else {
            super.push(item);
            int y = st.pop();
            st.push(y);

            if (item <= y) {
                st.push(item);
            }
            else
                st.push(y);
        }
    }

    public Integer pop() {
        int x = super.pop();
        int y = st.pop();
        return x;
    }

    public Integer getMin() {
        int x = st.peek();
        return x;
    }

    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();
        specialStack.push(30);
        specialStack.push(20);
        specialStack.push(70);
        specialStack.push(90);
        specialStack.push(60);
        specialStack.push(50);
        System.out.println("Elements pushed in the stack: " + specialStack);
        System.out.println("Minimum element: "+ specialStack.getMin());
        specialStack.pop();
        System.out.println("After popping an element: " + specialStack);
        System.out.println("Minimum element: " + specialStack.getMin());
    }
}
