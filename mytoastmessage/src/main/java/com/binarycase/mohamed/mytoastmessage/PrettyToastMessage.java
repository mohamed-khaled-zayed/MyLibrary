package com.binarycase.mohamed.mytoastmessage;

import android.content.Context;
import android.widget.Toast;

public class PrettyToastMessage {

    public void showSuccessToast(Context context,String s){
        Toast.makeText(context,s,Toast.LENGTH_LONG).show();
    }
}
