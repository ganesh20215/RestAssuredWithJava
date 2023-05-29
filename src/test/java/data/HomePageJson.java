package data;

import org.json.simple.JSONObject;

public class HomePageJson {

    public static JSONObject HomeDataJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Ganesh");
        jsonObject.put("job", "IT");

        return jsonObject;
    }
}
