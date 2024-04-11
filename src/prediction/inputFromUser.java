package prediction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class inputFromUser {
    public static void main(String[] args) {


        Object[] demoInputArray = new Object[]{createHashMap("tarun", 92.0,true),createHashMap("john", 85.5,true),createHashMap("sona", 1,true),createHashMap("wick", 10.5,true),createHashMap("salma", 70.3,true)};
        List<Map<String, Object>> dataList = assignArray(demoInputArray);
        everySingleCombinationForPlayer everyPossibleTeam =   new everySingleCombinationForPlayer();
        HashMap<String,ArrayList <Object>>  possibleteamCreated =   everyPossibleTeam.createpossibleComb(dataList);

        teamWithCapAndViceCaptain teamInstance =new teamWithCapAndViceCaptain();
        HashMap<String,ArrayList <Object>> teamWithCAndVc = teamInstance.teamForCapAndVc(possibleteamCreated);
        System.out.println(teamWithCAndVc + "  teamWithCAndVc");
    }
    public static Map<String, Object> createHashMap(String name,double point,boolean playing){
        Map<String ,Object> map =new HashMap<>();
        map.put("name",name);
        map.put("point",point);
        map.put("playing",playing);
        return map;
    }
    public static List<Map<String,Object>> assignArray(Object[] array){
        List<Map<String,Object>> dataList = new ArrayList<>();

        if(array!=null && array.length>0){
            for(Object obj: array){
                if(obj instanceof Map){
                    dataList.add((Map<String, Object>) obj);
                }
            }

        }
        return dataList;
    }
}


