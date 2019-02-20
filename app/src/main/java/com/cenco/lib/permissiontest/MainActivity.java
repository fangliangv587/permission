package com.cenco.lib.permissiontest;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cenco.lib.permission.PermissionManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PermissionManager manager = new PermissionManager(this);
        manager.requestPermission(new PermissionManager.PermissionCallback() {
            @Override
            public void onGrant() {
                Log.w("xin","onGrant");
            }

            @Override
            public void onDeny() {
                Log.i("xin","onDeny");
            }
        }, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    }
}
