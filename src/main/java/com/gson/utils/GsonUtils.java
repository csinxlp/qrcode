package com.gson.utils;

import com.google.gson.Gson;
import com.qrcode.model.CashierTransRequest;

public class GsonUtils {
	
    public static String tojson(CashierTransRequest m) {  
        // 将对象编译成json  
        Gson gson = new Gson();  
        String result = gson.toJson(m);  
        System.out.println(result);  
        // 输出：{"message":"message","flag":"00"}  
        return result;
    }  
  
    public static CashierTransRequest toObject(String m) {  
        // 将json编译成对象  
        Gson gson = new Gson();  
        CashierTransRequest msg = gson.fromJson(m, CashierTransRequest.class);  
        System.out.println(msg.toString());//输出：message1  
        return msg;
    }  
} 
