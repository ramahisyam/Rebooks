package smartdev.rebooks.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jih00d on 1/9/18.
 */

public class Books {
    @SerializedName("ver")
    @Expose
    private String ver;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("api")
    @Expose
    private String api;

    public Books(String ver, String name, String api) {
        this.ver = ver;
        this.name = name;
        this.api = api;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
