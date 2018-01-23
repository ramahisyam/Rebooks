package smartdev.rebooks.Network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import smartdev.rebooks.Model.BooksList;

/**
 * Created by jih00d on 1/9/18.
 */

public interface ApiInterface {
    @GET("android/jsonandroid")
    Call<BooksList> getBooksData(@Query("company_no")int ApiKey);
}
