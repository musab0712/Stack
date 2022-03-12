public class StackUsingArray{

   private int data[];
   private int topIndex;

   public StackUsingArray(){
        data = new int[10];
        topIndex = -1;
    }

   public StackUsingArray(int n){
       data = new int[n];
       topIndex = -1;
   }

   public int peek(){
       return data[topIndex];
   }

   private void doubleCapacity(){
        int temp[] = data;
        data = new int[2*temp.length];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
   }

   public void push(int elem){
        if(topIndex == -1){
            doubleCapacity();
        }
       data[++topIndex] = elem;
   }

   public int pop(){
       return data[topIndex--];
   }

   public int size(){
       return topIndex+1;
   }

   public boolean isEmpty(){
       if(topIndex == -1)
            return true;
        return false;
   }


   public void printStack(){
       if(isEmpty() == true)
            System.out.println("Empty Stack...");
       else{
           for(int i = 0; i <= topIndex; i++){
               System.out.print(data[i]+"  ");
           }
           System.out.println();
       }
   }

}