package cn.school.thoughtworks.section1;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {

        List<String> result = new ArrayList<String>();
        for (String string:collection1){
            if(collection2.contains(string)){
                result.add(string);
            }
        }
        return result;
    }
}