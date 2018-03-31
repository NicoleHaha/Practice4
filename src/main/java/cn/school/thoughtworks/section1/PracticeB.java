package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {

        List<String> result = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        for(List<String> str:collection2){
            for (String sttr:str){
                temp.add(sttr);
            }
        }
        for (String sst:collection1){
            if(temp.contains(sst)){
                result.add(sst);
            }
        }
        return result;
    }
}