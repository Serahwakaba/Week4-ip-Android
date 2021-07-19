//package com.moringaschool.covid19tracker.network;
//
//import java.io.IOException;
//
//import okhttp3.Interceptor;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class RetrofitClientInstance {
//
//    private static Retrofit retrofit;
//    private static final String BASE_URL = "https://corona.lmao.ninja/v2/all/";
//
//    public static GetDataService getRetrofitInstance() {
////        if (retrofit == null) {
//////            retrofit = new retrofit2.Retrofit.Builder()
////            retrofit = new Retrofit.Builder()
////                    .baseUrl(BASE_URL)
////                    .addConverterFactory(GsonConverterFactory.create())
////                    .build();
////        }
////        return retrofit.create((GetDataService.class));
//
//        if (retrofit == null) {
//            OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                    .addInterceptor(new Interceptor() {
//                        @Override
//                        public Response intercept(Chain chain) throws IOException {
//                            Request newRequest  = chain.request().newBuilder()
//                                    .addHeader("Authorization", BASE_URL)
//                                    .build();
//                            return chain.proceed(newRequest);
//                        }
//                    })
//                    .build();
//
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .client(okHttpClient)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//        return retrofit.create(GetDataService.class);
////        return retrofit;
//    }
//}