class Solution {
    public int calPoints(String[] operations) {
          List<Integer> list=new ArrayList<>();

          for(String oper:operations){
            if(oper.equals("C")){
                list.remove(list.size()-1);
            }else if(oper.equals("D")){
                list.add(list.get(list.size()-1)*2);
            }else if(oper.equals("+")){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }else{
                list.add(Integer.parseInt(oper));
            }
          }
          int sum=0;
          for(int x:list){
            sum+=x;
          }
          return sum;
    }
}