package com.example.ace.obo;

/**
 * Created by Ace on 2016/11/18.
 */

public class OBOJni {

    public static OBOJni getInstence() {
        if (obj == null) {
            obj = new OBOJni();
        }

        return obj;
    }

    protected static OBOJni obj = null;


    static {
        // libOBOjni.so
        System.loadLibrary("OBOjni");
    }

    //登陆 JNI模块
    public native boolean Login(String username, String passwd, boolean isDriver);

    //注册 JNI模块
    public native boolean Reg(String username,
                              String passwd,
                              String tel,
                              String email,
                              String idcard,
                              boolean isDriver);
    //开始下单 JNI模块
    public native boolean StartOrder(String src_longitude,
                                     String src_latitude,
                                     String src_address,
                                     String dst_longitude,
                                     String dst_latitude,
                                     String dst_address,
                                     String RMB);

    public native String getOrderid();
    public native String getSessionid();
    public native String getStatus();
    public native String getIsDriver();

    public native void testLibcurl();
    
}
