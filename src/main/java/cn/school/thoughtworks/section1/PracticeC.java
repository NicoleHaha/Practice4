
package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {


        List<String> result = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        List<String> arry = new ArrayList<String>();
        Set<String> set = collection2.keySet();
        for(String key:set) {
            arry = collection2.get(key);
            for (String sttr : arry) {
                temp.add(sttr);
            }
        }
        for (String str: collection1){
            if(temp.contains(str)){
                result.add(str);
            }
        }
        return result;
    }
}