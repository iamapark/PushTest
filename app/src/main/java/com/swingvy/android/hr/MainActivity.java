package com.swingvy.android.hr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.swingvy.android.hr.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * hun
         * dJIFzXDyi-4:APA91bH_CbWnaZjt3pQtnCgAOM5eEtEwUA2mQyHj0X7qtLvvLtb4RSmhGTgikMbdDs7JVLQhy9vFIByTNdmgMyPG9iBGeCgUvq3NyuJ9sSOGxDBas-4YdeB9DsbhqFmE_WtH3d-il9Gw
         */

        // ek3D7tyM_ng:APA91bFIitsoMkYHmOxYbUQaaIAvNRPdNXc7XPaHAGNedPEy_sREKqKoktm-EjH0S9qDruKGsdyFBkFUBAxeF6LC4knlU1P9Lc5dNfyy60HSZX3rInvdo_KaN0TPhXmrvxLDrrA42xIV
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        Log.d("MainActivity", "Refreshed token: " + refreshedToken);

        setContentView(R.layout.activity_main);
    }
}
