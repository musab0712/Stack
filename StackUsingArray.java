public class StackUsingArray{

   private int data[];
   private int topIndex;

   public StackUsingArray(int n){
       data = new int[n];
       topIndex = -1;
   }

   public void push(int elem){
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