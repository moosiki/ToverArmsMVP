package com.tover.manage.toverbam.app.utils.mipush;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;

import java.util.List;

public class MiPushRegisterHelper {

    /**
     * 判断是否注册小米推送服务
     * @return
     */
    public static boolean shouldInit(Context context) {
        ActivityManager am = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> processInfos = am.getRunningAppProcesses();
        String mainProcessName = context.getPackageName();
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo info : processInfos) {
            if (info.pid == myPid && mainProcessName.equals(info.processName)) {
                return true;
            }
        }
        return false;
    }
}
