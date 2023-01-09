class Solution {
     public void inorderTraversal(TreeNode root,List<Integer> li) {
        if(root==null )return;
        inorderTraversal(root.left,li);
        li.add(root.val);
        inorderTraversal(root.right,li);
        return;
    }
     public List<Integer> mergeList(List<Integer> l1, List<Integer> l2) {
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
       while(i<l1.size()&&j<l2.size()){
           if(l1.get(i)<l2.get(j)){
               ans.add(l1.get(i++));
           }else {
               ans.add(l2.get(j++));
           }
       }
         while(i<l1.size()){
               ans.add(l1.get(i++));  
       }
         while(j<l2.size()){
               ans.add(l2.get(j++));  
       }
        return ans;

    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        inorderTraversal(root1,l1);
        inorderTraversal(root2,l2);
        return mergeList(l1,l2);

    }
}