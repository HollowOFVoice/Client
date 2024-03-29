package com.example.client.utils;

import com.example.client.Entity.BookEntity;
import com.example.client.response.BaseResponse;
import com.example.client.response.BookListResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;

import java.io.IOException;

public class HTTPUtils {

    OkHttpClient client = new OkHttpClient();
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();

    public BaseResponse post (String url, BookEntity book) throws IOException{
        System.out.println(url);
        RequestBody body = RequestBody.create(
                gson.toJson(book),
                MediaType.get("application/json; charset=utf-8"));
        Request request= new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try(Response response = client.newCall(request).execute()){
            if (!response.isSuccessful()) throw new IOException("Unexpected code"+ response);
            return gson.fromJson(response.body().string(),BaseResponse.class);
        }
    }
//    public BookListResponse get(String url, String args) throws IOException{
//        Request reg = new Request
//                .Builder()
//                .url(url + args)
//                .build();
//        try (Response response = client
//                .newCall(reg)
//                .execute()){
//            BookListResponse book = new BookListResponse();
//            book = gson.fromJson(response.body().string(),BookListResponse.class);
//            return book;
//        }
//    }
public String post(String url, String json) throws IOException{
        RequestBody body = RequestBody.create(json,MediaType.get("application/json; charset=utf-8"));
Request request = new Request.Builder().url(url).post(body).build();
try(Response response = client.newCall(request).execute()){
    return  response.body().string();
}
}

public String get(String url, String args) throws IOException{
        Request req = new Request.Builder().url(url+args).build();
        try(Response response = client.newCall(req).execute()){
            return response.body().string();
        }

}

public String put(String url, String json) throws  IOException{
        RequestBody body = RequestBody.create(json,MediaType.get("appplication/json; charset=utf-8"));
        Request request = new Request.Builder().url(url).post(body).build();
        try(Response response = client.newCall(request).execute()){
            return  response.body().string();
        }
}

}
