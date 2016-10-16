package com.aaron.androidhelper;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toast;

/**
 * @author Aaron
 * @date 2016/10/12 23:07
 * @description
 */

public class AndroidHelperService extends AccessibilityService {

    private static final String foregroundPackageName = "com.aaron.androidhelper";

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
            Log.w("现在处于前台的应用为：", event.getPackageName().toString());

            if (!foregroundPackageName.equals(event.getPackageName().toString())) {
                Log.w("该应用不位于前台", "----------------");
                Toast.makeText(MyApplication.getContext(), "请返回应用继续操作", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onInterrupt() {

    }
}
