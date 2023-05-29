package actions;

import data.HomePageJson;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utility.ApiClient;

public class HomeRequest {

    String homeTestParameter = "/api/users";

    public Response getUsers(int pageValue) throws Exception {
        String parameter = "?page=" + pageValue;
        return ApiClient.sendRequest(Method.GET, homeTestParameter + parameter, null);
    }

    public Response createUsers() throws Exception {
        JSONObject jsonObject = HomePageJson.HomeDataJson();
        return ApiClient.sendRequest(Method.POST, homeTestParameter, jsonObject.toString());
    }
}
