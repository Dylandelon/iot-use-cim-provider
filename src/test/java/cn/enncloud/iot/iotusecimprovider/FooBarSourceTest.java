package cn.enncloud.iot.iotusecimprovider;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class FooBarSourceTest {

    @Test
    public void getRealTimeData2(){

        OkHttpClient okHttpClient = new OkHttpClient();


        String url = "http://localhost:8081/outSend";



        String res = "";
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = okHttpClient.newCall(request).execute()) {
            res = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
