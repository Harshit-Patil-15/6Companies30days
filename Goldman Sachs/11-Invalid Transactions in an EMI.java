class Solution {
        public boolean isValid(Pair t, List<Pair> list){
        if(t.amount > 1000){
			return false;
		}
        for(Pair ta : list){
            if(Math.abs(ta.time - t.time) <= 60 && !ta.city.equals(t.city)){
				return false;
			}
        }
        return true;
    }
    public List<String> invalidTransactions(String[] arr) {
     List<String> list=new ArrayList<>();
     Map<String, List<Pair>> map = new HashMap<>();
       for(String x : arr){
            Pair temp = new Pair(x);
            map.putIfAbsent(temp.name, new ArrayList<>());
            map.get(temp.name).add(temp);
        }
            for(String transaction : arr){
            Pair t = new Pair(transaction);
			
            if(!isValid(t, map.getOrDefault(t.name, new ArrayList<>()))){
                list.add(transaction);
            }
        }
       
       return list;

    }
}
class Pair{
    String name;
    int time;
    int amount;
    String city;
     public Pair(String line){
			// split the string and parse it
            String[] split = line.split(",");
            name = split[0];
            time = Integer.parseInt(split[1]);
            amount = Integer.parseInt(split[2]);
            city = split[3];
        }
}