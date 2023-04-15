class MyQueue {
    
    //DECELARATION OF THE TWO STACKS S1 AND S2
     Stack <Integer> s1;
     Stack <Integer> s2; 
    
    //INITIALITAION OF STACKS S1 AND AND S2 
    public MyQueue() {
        s1= new Stack<>();
        s2 = new Stack<>(); 
    }
    
    //ADDIN THE VAL IN STACK S1
    public void push(int x) {
        s1.push(x);
    }
    
    //REMOVING THE VAL
    public int pop() {
        
        //TRANSFERING ALL THE VAL FOR S1 TO S2
        //SO THAT THE STACK WILL REVERSE 
        //AND I WILL ACT AS A QUEUE 
        while(!s1.empty())
        {
            s2.push(s1.pop());
        }
        
        //REMOVE THE FIRST ELEMENT
        int ans = s2.pop();
        
        //TRANSFER ALL THE REMENING ELEMENTS FORM S2 TO S1
        //AND CONTINUE
        while(!s2.empty())
        {
            s1.push(s2.pop());
        }
        
        //RETURN ANS
        return ans;
    }
    
    public int peek() {
         //TRANSFERING ALL THE VAL FOR S1 TO S2
        //SO THAT THE STACK WILL REVERSE 
        //AND I WILL ACT AS A QUEUE 
         while(!s1.empty())
        {
            s2.push(s1.pop());
        }
        
        //TAKE THE VAL OF TOP OF STACK 
        //STORE IN ANS 
        int ans = s2.peek();
        
         //TRANSFER ALL THE ELEMENTS FORM S2 TO S1
        //AND CONTINUE
        while(!s2.empty())
        {
            s1.push(s2.pop());
        }
        
         //RETURN ANS
        return ans;
    }
    
    public boolean empty() {
        //IF STACK S1 IS EMPTY 
        //RETURN TRUE
        if(s1.empty())
        {
            return true;
        }
        
        //RETURN FALSE
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */