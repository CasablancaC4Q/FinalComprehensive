package comli.example.c4q.testing.network;

import comli.example.c4q.testing.model.Breed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by c4q on 2/25/18.
 */

public class BreedsApi {
    @GET("{breed}/images/random")
    Call<Breed> getBreed(@Path("breed") String breed) {
        return null;

    }
}

