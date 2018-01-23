package smartdev.rebooks.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jih00d on 1/9/18.
 */

public class BooksList {
    @SerializedName("android")
    @Expose
    private List<Books> books = null;

    public List<Books> getAndroid() {
        return books;
    }

    public void setAndroid(List<Books> books) {
        this.books = books;
    }
}
