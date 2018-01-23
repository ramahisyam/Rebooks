package smartdev.rebooks.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jih00d on 1/9/18.
 */

public class RetrofitInstance {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api.learn2crack.com/";

    public static Retrofit getRetrofit() {

        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
