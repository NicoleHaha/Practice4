package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String,Integer> mp = new HashMap<String, Integer>();
        for (String str :collection1){
            if(str.length()==1){
                if(mp.containsKey(str)){
                    mp.put(str,mp.get(str).intValue()+1);
                }
                else {
                    mp.put(str,1);
                }
            }
            else {
                String temp = str.replaceAll("[^0-9]","");
                String stemp = str.replaceAll("[^a-z]","");
                if(mp.containsKey(stemp)){
                    mp.put(stemp,mp.get(stemp).intValue()+Integer.parseInt(temp));
                }
                else {
                    mp.put(stemp,Integer.parseInt(temp));
                }
            }
        }
        return mp;
    }
}