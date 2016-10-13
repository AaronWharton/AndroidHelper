package com.aaron.androidhelper;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

/**
 * @author Aaron
 * @date 2016/10/12 23:07
 * @description
 */

public class AndroidHelperService extends AccessibilityService {

    private static final String TAG = "AndroidHelperService";

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.w("-------------------------------------------------------------", "");
        int eventType = event.getEventType();                       //事件类型
        Log.w("packageName:", event.getPackageName().toString());   //响应程序的包名
        //Log.w("source:", event.getSource().toString());             //控件信息
        Log.w("sourceClass:", event.getClassName().toString());     //事件源名称
        Log.w("event type(int):", String.valueOf(eventType));       //

        switch (eventType) {
            //通知栏事件
            case AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED:
                Log.w(TAG, "TYPE_NOTIFICATION_STATE_CHANGED:");
                break;
            case AccessibilityEvent.CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION:
                break;
            case AccessibilityEvent.CONTENT_CHANGE_TYPE_UNDEFINED:
                break;
            case AccessibilityEvent.INVALID_POSITION:
                break;
            //窗体状态改变
            case AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED:
                Log.w(TAG, "TYPE_WINDOW_STATE_CHANGED: ");
                break;
            case AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED:
                Log.w(TAG, "TYPE_VIEW_ACCESSIBILITY_FOCUSED: " );
                break;
            case AccessibilityEvent.TYPE_GESTURE_DETECTION_START:
                Log.w(TAG, "TYPE_GESTURE_DETECTION_START: " );
                break;
            case AccessibilityEvent.TYPE_GESTURE_DETECTION_END:
                Log.w(TAG, "TYPE_GESTURE_DETECTION_END: " );
                break;
            case AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED:
                Log.w(TAG, "TYPE_WINDOW_CONTENT_CHANGED: " );
                break;
            case AccessibilityEvent.TYPE_VIEW_CLICKED:
                Log.w(TAG, "TYPE_VIEW_CLICKED: " );
                break;
            case AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED:
                Log.w(TAG, "TYPE_VIEW_TEXT_CHANGED: " );
                break;
            case AccessibilityEvent.TYPE_VIEW_SCROLLED:
                Log.w(TAG, "TYPE_VIEW_SCROLLED: " );
                break;
            case AccessibilityEvent.TYPE_VIEW_TEXT_SELECTION_CHANGED:
                Log.w(TAG, "TYPE_VIEW_TEXT_SELECTION_CHANGED: " );
                break;
        }

        for (CharSequence txt : event.getText()) {
            Log.w("text", txt.toString());
        }

        Log.w("-------------------------------------------------------------", "");
    }

    @Override
    public void onInterrupt() {

    }
}
