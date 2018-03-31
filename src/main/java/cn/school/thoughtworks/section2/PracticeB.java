package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String, Integer> mp = new HashMap<String, Integer>();
        List<String> collection2 = collection1.stream().filter(ss -> ss.length()==1).collect(Collectors.toList());
        List<String> collection3 = collection1.stream().filter(ss -> ss.length()> 1).collect(Collectors.toList());

        for(String str:collection2){
            if(mp.containsKey(str)){
                mp.put(str,mp.get(str).intValue()+1);
            }
            else{
                mp.put(str,1);
            }
        }
        for(String str:collection3){
            String na = str.substring(0,1);
            String ti = str.substring(2,3);
            mp.put(na,Integer.parseInt(ti));
        }
        return mp;
    }
}