package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText editText;
public class DownloadTask extends AsyncTask<String,Void,String>{

    @Override
    protected String doInBackground(String... urls) {
        HttpURLConnection connection=null;
        URL url;
        StringBuilder builder=new StringBuilder();
        try {
            url=new URL(urls[0]);
            connection=(HttpURLConnection) url.openConnection();
            InputStream in=connection.getInputStream();
            InputStreamReader reader=new InputStreamReader(in);
            int data=reader.read();
            while (data!=-1){
                char ch=(char) data;
                builder.append(ch);
                data=reader.read();
            }
            return builder.toString();
        }catch (Exception e){
            textView.setText("Please provide correct input");
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        try {
            JSONObject jsonObject = new JSONObject(s);
            String weatherInfo=jsonObject.getString("data");
          JSONArray jsonArray=new JSONArray(weatherInfo);
          JSONObject jsonObject1= jsonArray.getJSONObject(0);
          String weather=jsonObject1.getString("weather");
            Log.i("weather",weather);
          JSONObject object=new JSONObject(weather);
         String description=object.getString("description");
         String temp=jsonObject1.getString("temp");
         String stateCode=jsonObject1.getString(("state_code"));
         String cityName=jsonObject1.getString("city_name");
            String countryName=jsonObject1.getString("country_code");
            textView.setText("Weather: "+description+"\r\n"+"Temperature: "+temp+"\r\n"+"state code: "+stateCode+"\r\n"+"City Name: "+cityName+"\r\n"+"Country Code: "+countryName);
        }catch (Exception e){
            textView.setText("Please provide correct input");
            e.printStackTrace();
        }
    }
}
public void weather(View view){
    String cityName=editText.getText().toString();
    DownloadTask downloadTask=new DownloadTask();
    try {
        downloadTask.execute("https://api.weatherbit.io/v2.0/current?city="+cityName+"&key=d4ca18e6a1134d2e94776b01d03d51d6&include=minutely").get();
    }catch (Exception e){
        textView.setText("Please provide correct input");
        e.printStackTrace();
    }
    InputMethodManager manager= (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    manager.hideSoftInputFromWindow(editText.getWindowToken(),0);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.check);
        editText=findViewById(R.id.cityEditText);
    }
}