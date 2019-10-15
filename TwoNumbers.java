//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Example:

//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class TwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     int i=0;
     int x=0;
     int counter=0;
     int counter2=0;
     ListNode head1=l1;
     ListNode head2=l2;
    while(l1.next!=null){
        System.out.println(l1.val);
        l1=l1.next;
        if(l1.next==null){
        System.out.println(l1.val);
        }
    }
        
        l1=head1;
     while(l1.next!=null) {   
        counter++;
        l1=l1.next;
        }
    counter++;
        l1=head1;
        
     while(l2.next!=null) {   
        counter2++;
         l2=l2.next;
        }
      counter2++;
        l2=head2;
        
        
     int[] arr=new int[counter];
     int[] arr2= new int [counter2];
         
        while(l1.next!=null) {   
        arr[i]=l1.val;
        l1=l1.next;
        i++;
        if(l1.next==null){
            arr[i]=l1.val;
        }
        }
        System.out.println(Arrays.toString(arr));
        
        while(l2.next!=null) {   
            arr2[x]=l2.val;
            l2=l2.next;
        x++;
        if(l2.next==null){
            arr2[x]=l2.val;
        }
    }
    l2=head2;
        
    System.out.println(Arrays.toString(arr2));
    String Num1="";
    String Num2="";
    int Output=0;
    String Out="";
    
        for(i=arr.length-1; i>=0; i--){
            Num1=Num1+Integer.toString(arr[i]);
        }
        for(i=arr2.length-1; i>=0; i--){
            Num2=Num2+ Integer.toString(arr2[i]);
        }
        System.out.println(Num1);
        System.out.println(Num2);
    Output=Integer.parseInt(Num1)+Integer.parseInt(Num2);
    
    Out=Integer.toString(Output);
    System.out.println(Out);
    ListNode result= new ListNode(0);
    ListNode Hresult=result;
    for(int z=Out.length()-1; z>=0; z--){
      result.val = Character.getNumericValue(Out.charAt(z));
      if(z!=0)
      result.next= new ListNode(0);
      result=result.next;
        }
        return Hresult;
    
        
    
}
}
