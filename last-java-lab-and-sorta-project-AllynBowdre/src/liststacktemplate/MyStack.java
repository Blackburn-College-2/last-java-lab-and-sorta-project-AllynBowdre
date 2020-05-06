package liststacktemplate;

/**
 *
 * @author Allyn
 */
public class MyStack<T> {

    MyList<T> stack = new MyList();

    /**
     * push an element onto the stack
     *
     * @param t the element to add to the stack
     * @return return the stack to allow chaining. i.e. stack.push(1).push(2)...
     */
    public MyStack<T> push(T t) {
        stack.add(t);
        return this;
    }

    /**
     * remove and return the top element from the stack. This method should
     * throw an exception of your own descriptive making when this method is
     * called on an empty stack.
     *
     * @return the top of the stack/removed element
     */
    public T pop() {
        T top = (T) stack.last.value;
        stack.removeAtIndex((stack.size() - 1));
        return top;
    }

    /**
     * returns the top element on the stack, but does not remove it.
     *
     * @return the top element of the stack
     */
    public T peek() {
        return (T) stack.last.value;
    }

    /**
     * Answers whether or not the stack contains elements.
     *
     * @return true-contains elements; false otherwise.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * returns how many elements are in the stack.
     *
     * @return
     */
    public int size() {
        return stack.size;
    }

    /**
     * Custom toString which prints the stack... as a stack. (See example test
     * case from lab.
     *
     * @return
     */
    @Override
    public String toString() {
        
        String asStack = "";
        for (int i = (stack.size - 1); i > -1; i--) {
            asStack = asStack + "|\t" + stack.get(i) + "\t|\n";
        }
        asStack = asStack + "________________________";
        
        return asStack;
    }
}