package prediction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class everySingleCombinationForPlayer {
    public static void main(List<Map<String, Object>> dataList) {

    }

    public static HashMap<String,ArrayList <java.lang.Object>> createpossibleComb (List<Map<String, Object>> dataList) {
        return generatePermutations(dataList);

    }
    private static HashMap<String,ArrayList <java.lang.Object>> generatePermutations(List<Map<String, Object>> dataList){
        return backtrack(dataList,2);

    }
    private static HashMap<String,ArrayList <Object>> backtrack(List<Map<String,Object>> dataList,int teamSizeRequired){
        boolean isSizeExcedded =false;
        HashMap<String,ArrayList <Object>> teamFormedIthoutCaption = new HashMap<>();
        int indexForTeamFormed =1;
       for(int i=0;i<dataList.size();i++){


           boolean isTeamSizeSmallerThanRequired =false;
           int nextTeamStartedIndex =i+1;
            if(nextTeamStartedIndex<=(dataList.size()-teamSizeRequired)){

               while(isTeamSizeSmallerThanRequired ==false){
                   int emptyTeamSize =teamSizeRequired -1;
                   ArrayList<Object> tempArrayForTeam = new ArrayList<>();
                   Object ArrayElement = dataList.get(i) ;
                   tempArrayForTeam.add(ArrayElement);

                   for(int j=nextTeamStartedIndex;j<dataList.size();j++){
                    Map<String,Object> singleObject = dataList.get(j);
                    boolean isPlaying =(boolean) singleObject.get("playing");
                    if(isPlaying ==true && emptyTeamSize>0){
                        tempArrayForTeam.add(singleObject);
                        emptyTeamSize-=1;
                    }
                    if(emptyTeamSize ==0){
                        break;
                    }
                   }
                   nextTeamStartedIndex+=1;
                   if(nextTeamStartedIndex == dataList.size()){
                       isTeamSizeSmallerThanRequired =true;
                   }
                   if(tempArrayForTeam.size() ==teamSizeRequired){

                      String nameFotTeam =  "team_"+ indexForTeamFormed;
                       teamFormedIthoutCaption.put(nameFotTeam,tempArrayForTeam);
                       indexForTeamFormed+=1;
                   }
               }
            }


           if(isSizeExcedded ==true){
               break;
           }
       }
       return teamFormedIthoutCaption;
    }



}
