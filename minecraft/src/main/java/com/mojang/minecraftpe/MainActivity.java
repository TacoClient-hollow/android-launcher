package com.mojang.minecraftpe;

import android.app.NativeActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import java.lang.reflect.Field;

public abstract class MainActivity extends NativeActivity implements View.OnKeyListener, FilePickerManagerHandler {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        throw new RuntimeException("Stub!");
    }
    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    @Override
    public void startPickerActivity(Intent intent, int i) {
        throw new RuntimeException("Stub!");
    }
    public boolean hasWriteExternalStoragePermission() {
        throw new RuntimeException("Stub!");
    }
    public void requestStoragePermission(int permissionReason) {
        throw new RuntimeException("Stub!");
    }

}
