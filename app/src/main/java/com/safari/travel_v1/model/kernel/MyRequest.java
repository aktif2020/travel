package com.safari.travel_v1.model.kernel;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MyRequest {

    private App app;
    private Context context;
    private RequestQueue queue;

    public MyRequest(Context context, RequestQueue queue) {
        this.context = context;
        this.queue = queue;
    }


    public void query(final Object[] data, final Object[] fields, final String page, final Callback callback){
        StringRequest request = new StringRequest(Request.Method.POST, url(page), new Response.Listener<String>() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject json = new JSONObject(response);
                    callback.onResult(response);
                    Boolean error = json.getBoolean("error");
                    if(!error){
                        Log.d("APP", response);
                        callback.onSuccess(response);
                    }else{
                        Log.d("APP", response);
                        String messages = json.getString("message");
                        callback.onError(messages);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("APP", "ERROR = "+error);
                if(error instanceof NetworkError){
                    Toast.makeText(context, "Impossible de se connecter", Toast.LENGTH_SHORT).show();
                }else if( error instanceof VolleyError){
                    Toast.makeText(context, "Une erreure s'est produit", Toast.LENGTH_SHORT).show();
                }
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<>();

                for(int i = 0; i < data.length; i++){
                    map.put(data[i].toString(), fields[i].toString());
                }
                return map;
            }
        };
        queue.add(request);
    }


    public void queryAll(final String page, final Callback callback){
        StringRequest request = new StringRequest(Request.Method.GET, url(page), new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("APP", response);
                try {
                    callback.onResult(response);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("APP", "ERROR = "+error);
                if(error instanceof NetworkError){
                    Toast.makeText(context, "Impossible de se connecter", Toast.LENGTH_LONG).show();
                }else if( error instanceof VolleyError){
                    Toast.makeText(context, "Une erreure s'est produit", Toast.LENGTH_LONG).show();
                }
            }
        });
        queue.add(request);
    }


    public void only_num(final String number, final String page, final Callback callback){
        StringRequest request = new StringRequest(Request.Method.POST, url(page), new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject json = new JSONObject(response);
                    Boolean error = json.getBoolean("error");
                    if(!error){
                        Log.d("APP", response);
                        callback.onSuccess("Vous etes bien inscrit");
                    }else{
                        Log.d("APP", response);
                        String messages = json.getString("message");
                        callback.onError(messages);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("APP", "ERROR = "+error);
                if(error instanceof NetworkError){
                    Toast.makeText(context, "Impossible de se connecter", Toast.LENGTH_LONG).show();
                }else if( error instanceof VolleyError){
                    Toast.makeText(context, "Une erreure s'est produit", Toast.LENGTH_LONG).show();
                }
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<>();
                map.put("number", number);
                return map;
            }
        };
        queue.add(request);
    }


    public String url(String page){
        app = new App();
        app.setPage(page);
        String url = app.getUrl()+app.getPage();
        return url;
    }

    public interface Callback{
        void onSuccess(String message) throws JSONException;
        void onResult(String data) throws JSONException;
        void onError(String message);
    }

}
