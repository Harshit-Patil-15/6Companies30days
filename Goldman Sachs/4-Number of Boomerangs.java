class Solution {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer,Integer> map=new HashMap<>();
         int ans=0;
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if (i==j) continue;
            int dis=(int)Math.pow(points[j][0]-points[i][0],2)+(int)Math.pow(points[j][1]-points[i][1],2);
           map.put(dis,map.getOrDefault(dis,0)+1); 
        }
         for (int x:map.values()){  
                ans+=(x*(x-1));
        }
        map.clear();
        }
       
        
        return ans;
    }
}