package prediction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class teamWithCapAndViceCaptain {
    public static HashMap<String, ArrayList<Object>>  teamForCapAndVc (HashMap<String, ArrayList<Object>> data){

        for(Map.Entry<String,ArrayList<Object>> team: data.entrySet()){
            String teamKey =team.getKey();
            ArrayList<Object> teamArr = team.getValue();
            System.out.println(teamArr+"teamArr");
            for(int i=0;i<teamArr.size();i++){

            }
        }
        return data;
    };

}
