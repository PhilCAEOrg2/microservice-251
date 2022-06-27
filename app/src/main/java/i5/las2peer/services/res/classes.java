package i5.las2peer.services.res;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class User {

    public User() {}
    
    private String username;

    public void setusername(String setValue) {
        this.username = setValue;
    }

    public String getusername() {
        return this.username;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("username", this.username); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.username = (String) jsonObject.get("username"); 

    }

}

    
}
