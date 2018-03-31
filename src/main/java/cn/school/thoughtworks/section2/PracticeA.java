package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {

        Map<String, Integer> mp = new HashMap<String, Integer>();
        for(String str:collection1){
            if(mp.containsKey(str)){
                mp.put(str,mp.get(str).intValue()+1);
            }
            else{
                mp.put(str,1);
            }
        }
        return mp;
    }
}