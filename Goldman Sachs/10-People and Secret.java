class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
       long noOfPeopleShareSec=0;
       long mod=(long)Math.pow(10,9)+7;
       long [] dp=new long [n+1];
       dp[1]=1;
       for(int i=2;i<=n;i++){
        long noOfNewPeopleShareSec =dp[Math.max(i-delay,0)];
         long  noOfPeopleForget =dp[Math.max(i-forget,0)];
            noOfPeopleShareSec=(noOfPeopleShareSec+noOfNewPeopleShareSec-noOfPeopleForget+mod)%mod;
            dp[i]=noOfPeopleShareSec;  
       }
       long ans=0;
       for(int i=n-forget+1;i<=n;i++){
           ans=(ans+dp[i])%mod;
       }
       return (int)ans;
    }
}