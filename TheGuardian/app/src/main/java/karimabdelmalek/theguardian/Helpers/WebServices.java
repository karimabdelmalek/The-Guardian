package karimabdelmalek.theguardian.Helpers;

import android.content.Context;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestTickle;
import com.android.volley.toolbox.VolleyTickle;
import com.google.gson.Gson;

import java.util.concurrent.Callable;

import bolts.Task;
import karimabdelmalek.theguardian.DataClasses.ParentResponse;

/**
 * Created by karimabdelmalek on 9/28/16.
 */

public class WebServices
{
    public static Task <ParentResponse> getHomeItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }


    public static Task <ParentResponse> getArtsItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl +Constants.artsExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }


    public static Task <ParentResponse> getSportsItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl +Constants.sportsExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }

    public static Task <ParentResponse> getLifeStyleItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl +Constants.lifestyleExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }


    public static Task <ParentResponse> getTechnologyItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl +Constants.technologyExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }

    public static Task <ParentResponse> getFashionItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl +Constants.fashionExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }

    public static Task <ParentResponse> getBusinessItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl +Constants.businessExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }

    public static Task <ParentResponse> getEnvironmentItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl +Constants.environmentExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }

    public static Task <ParentResponse> getTravelItems (final Context context)
    {
        return Task.callInBackground(new Callable<ParentResponse>() {
            public ParentResponse call() {
                RequestTickle mRequestTickle = VolleyTickle.newRequestTickle(context);
                String url = Constants.baseUrl +Constants.travelExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
                com.android.volley.request.StringRequest stringRequest = new com.android.volley.request.StringRequest(Request.Method.GET, url, null, null);
                mRequestTickle.add(stringRequest);
                NetworkResponse response = mRequestTickle.start();
                if (response.statusCode == 200) {
                    Gson gson = new Gson();
                    try {
                        String source = VolleyTickle.parseResponse(response);
                        ParentResponse parsedResponse = gson.fromJson(source, ParentResponse.class);
                        return parsedResponse;
                    }
                    catch (Exception e)
                    {
                        return  null;
                    }
                }
                return null;
            }
        });
    }


}
