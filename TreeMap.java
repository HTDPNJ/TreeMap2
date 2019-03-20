import java.util.*;

public class TreeMap
{/*测试map*/
    public static void main(String[] args)
    {
       Map<Integer,String> treemap=new java.util.TreeMap();
       treemap.put(2,"a");
       treemap.put(1,"b");
       treemap.put(3,"abc");
       List<Map.Entry<Integer,String>> list=new ArrayList<Map.Entry<Integer,String>>(treemap.entrySet());

        Iterator<Map.Entry<Integer,String>> iter=treemap.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<Integer,String> temp=iter.next();
            System.out.println(temp.getKey()+"---"+temp.getValue());
        }

       Collections.sort(list, new Comparator<Map.Entry<Integer, String>>()
       {
           @Override
           public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2)
           {
               int result=o1.getValue().compareTo(o2.getValue());
               if(result<0)
                   return -1;
               else if(result>0)
                   return 1;
               else
                   return 0;
           }
       });
        Iterator<Map.Entry<Integer,String>> iter2=list.iterator();
        while(iter2.hasNext()){
            Map.Entry<Integer,String> temp=iter2.next();
            System.out.println(temp.getKey()+"---"+temp.getValue());
        }

    }
}
