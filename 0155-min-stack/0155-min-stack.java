import java.util.*;
class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> mn=new Stack<>();
   
    public void push(int x) 
    {
        if(st.empty() || x<=mn.peek())
            mn.push(x);
        st.push(x);
    }
    
    public void pop() 
    {
        if(st.peek().equals(mn.peek())) 
            mn.pop();
        st.pop();
    }
    
    public int top() 
    {
         return st.peek();
    }
    
    public int getMin() 
    {
        return mn.peek();
    }
}
class Rextester{
  public static void main(String args[])
    {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int param1 = minStack.getMin(); 
        minStack.pop();
        int param2 = minStack.top();   
        int param3 = minStack.getMin(); 
        
    System.out.println(param1);
        System.out.println(param2);
        System.out.println(param3);
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */