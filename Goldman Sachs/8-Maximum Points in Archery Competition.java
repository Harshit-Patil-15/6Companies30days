class Solution {
    int[] bobArrowPointsMax=new int [12];
    int pointsOfBob=0;
    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        int[] bob=new int [12];
        backtrack(aliceArrows,bob,11,0,numArrows);
    return bobArrowPointsMax;
    }
     public void backtrack(int [] alice, int [] bob, int pos, int currentMax, int arrows) {
        if(arrows<=0 || pos<0){
            if(pointsOfBob<currentMax){
                pointsOfBob=currentMax;
                if(arrows>0){
                    bob[0]+=arrows;
                }
               bobArrowPointsMax=bob.clone();
            }
            return;
        }
        if(arrows>=alice[pos]+1){
            bob[pos]=alice[pos]+1;
            backtrack(alice,bob,pos-1,currentMax+pos,arrows-alice[pos]-1);
            bob[pos]=0;

        }
    backtrack(alice,bob,pos-1,currentMax,arrows);
     bob[pos]=0;
     }
}