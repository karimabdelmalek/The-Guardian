package karimabdelmalek.theguardiancallbacks.Helpers;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import karimabdelmalek.theguardiancallbacks.DataClasses.ParentResponse;

/**
 * Created by karimabdelmalek on 9/28/16.
 */

public class WebServices
{
    public static void getHomeItems (final ServicesCallback callback,Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);
                        }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                         }
                });
        volleyRequest.add(jsObjRequest);
    }


    public static void getArtsItems (final ServicesCallback callback,Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl +Constants.artsExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                    }
                });
        volleyRequest.add(jsObjRequest);
    }


    public static void getSportsItems (final ServicesCallback callback, Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl +Constants.sportsExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                    }
                });
        volleyRequest.add(jsObjRequest);
    }

    public static void getLifeStyleItems (final ServicesCallback callback, Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl +Constants.lifestyleExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                    }
                });
        volleyRequest.add(jsObjRequest);
    }


    public static void getTechnologyItems (final ServicesCallback callback, Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl +Constants.technologyExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                    }
                });
        volleyRequest.add(jsObjRequest);
    }

    public static void getFashionItems (final ServicesCallback callback, Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl +Constants.fashionExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                    }
                });
        volleyRequest.add(jsObjRequest);
    }

    public static void getBusinessItems (final ServicesCallback callback, Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl +Constants.businessExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                    }
                });
        volleyRequest.add(jsObjRequest);
    }

    public static void getEnvironmentItems (final ServicesCallback callback, Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl +Constants.environmentExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                    }
                });
        volleyRequest.add(jsObjRequest);
    }

    public static void getTravelItems (final ServicesCallback callback, Context context)
    {
        RequestQueue volleyRequest = Volley.newRequestQueue(context.getApplicationContext());
        String url = Constants.baseUrl +Constants.travelExtension + Constants.boltsKey+Constants.requestHeadlineAndThumbnailExtension;
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson ();
                        ParentResponse retrievedResponse = gson.fromJson(response.toString(),ParentResponse.class);
                        callback.onResponse(retrievedResponse);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub
                        callback.onResponse(null);
                    }
                });
        volleyRequest.add(jsObjRequest);
    }


}
