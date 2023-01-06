class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> li=new HashSet<>();
        li.add(distance(p1,p2));
        li.add(distance(p1,p3));
        li.add(distance(p1,p4));
        li.add(distance(p2,p3));
        li.add(distance(p2,p4));
        li.add(distance(p4,p3));
        if(li.size()==2 &&!li.contains(0)){
            return true;
        }
        return false;
    }
    public int distance(int[] x1,int[] x2){
        return (int)Math.pow(x1[0]-x2[0],2)+(int)Math.pow(x1[1]-x2[1],2);
    }
}