package com.jiaozix.google_ml_barcode_scanner;

import androidx.annotation.NonNull;

import java.util.List;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public interface ApiDetectorInterface {

    List<String> getMethodsKeys();

    void onMethodCall(@NonNull MethodCall call, @NonNull MethodChannel.Result result);
}
