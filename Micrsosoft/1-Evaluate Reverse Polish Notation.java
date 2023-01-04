class Solution {
    public int helper(int num1,int num2 ,String operator){
        int ans=0;
        switch(operator){
            case "+" :
             ans= num1+num2;
             break;
              case "-" :
             ans= num1-num2;
             break;
              case "*" :
             ans= num1*num2;
             break;
              case "/" :
             ans= num1/num2;
             break;

        }
        return ans;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
      for(int i=0;i<tokens.length;i++){
          String curr=tokens[i];
          if(curr.equals("+")|| curr.equals("-") || curr.equals("*")|| curr.equals("/")){
                int num1=s.pop();
                int num2=s.pop();
                int ans=helper(num2,num1,curr);
                s.push(ans);
               }else{
                   int num =Integer.valueOf(curr);
                   s.push(num);
               }
         }
         return s.pop();
    }

}