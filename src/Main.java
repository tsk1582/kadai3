import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> stations = new HashMap<>();

        stations.put("上野駅", 60);
        stations.put("東京駅", 70);
        stations.put("北千住駅", 0);

        for (String key : stations.keySet()) {
            int value = stations.get(key);
            System.out.println(key + "まで" + value + "分かかります");

            if (value < 1) {
                throw new IllegalArgumentException("所要時間は0分以上を指定してください。指定地=" + value);
            }


        }
    }
}



