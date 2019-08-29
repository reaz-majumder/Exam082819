package OtherTest;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map color = new HashMap();
        color.put(1,"black");
        color.put(2,"yellow");
        System.out.println(color);
        System.out.println(color.entrySet());
        System.out.println(color.containsValue("green"));

        List<String>list = new ArrayList<>();
        list.add("india");
        list.add("pakistan");
        List<String>list2 = new ArrayList<>();
        list2.add("ford");
        list2.add("bmw");
        for(String value:list2){
            System.out.println(value);
        }
        List<String>list3 = new ArrayList<>();
        list2.add("cat");
        list2.add("dog");
        Iterator iterator = list3.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Map<String, List<String>> topicList = new HashMap<>();
        topicList.put("10".list);
        topicList.put("20".list2);
        topicList.put("30".list3);
        System.out.println(topicList);



    }
}
