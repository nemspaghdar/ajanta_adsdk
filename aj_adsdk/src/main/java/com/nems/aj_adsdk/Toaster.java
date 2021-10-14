package com.nems.aj_adsdk;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void Toster(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
