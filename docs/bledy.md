1. 2026-09-20 14:40:23.964 12078-12078 AndroidRuntime          com.broidev.bmi                      E  FATAL EXCEPTION: main (Fix with AI)
   Process: com.broidev.bmi, PID: 12078
   java.lang.NullPointerException: Attempt to invoke virtual method 'android.text.Editable android.widget.EditText.getText()' on a null object reference
   at com.broidev.bmi.MainActivity.onCreate$lambda$1(MainActivity.kt:31)
   at com.broidev.bmi.MainActivity$$ExternalSyntheticLambda1.onClick(D8$$SyntheticClass:0)
--- KONIEC PIERWSZYCH 5 LINII ---
   at android.view.View.performClick(View.java:8083)
   at com.google.android.material.button.MaterialButton.performClick(MaterialButton.java:1213)
   at android.view.View.performClickInternal(View.java:8060)
   at android.view.View.-$$Nest$mperformClickInternal(Unknown Source:0)
   at android.view.View$PerformClick.run(View.java:31549)
   at android.os.Handler.handleCallback(Handler.java:995)
   at android.os.Handler.dispatchMessage(Handler.java:103)
   at android.os.Looper.loopOnce(Looper.java:248)
   at android.os.Looper.loop(Looper.java:338)
   at android.app.ActivityThread.main(ActivityThread.java:9067)
   at java.lang.reflect.Method.invoke(Native Method)
   at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:593)
   at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:932)
2. 2026-09-20 14:42:19.492 12347-12347 TransactionExecutor     com.broidev.bmi                      E  Failed to execute the transaction: tId:787101001 ClientTransaction{
   tId:787101001   transactionItems=[
   tId:787101001     LaunchActivityItem{activityToken=android.os.BinderProxy@c8c4a32,intent=Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10000000 xflg=0x4 cmp=com.broidev.bmi/.MainActivity },ident=233876439,info=ActivityInfo{379a8d5 com.broidev.bmi.MainActivity},curConfig={1.0 310mcc260mnc [pl_PL,en_US] ldltr sw411dp w411dp h914dp 420dpi nrml long port finger qwerty/v/v dpad/v winConfig={ mBounds=Rect(0, 0 - 1080, 2400) mAppBounds=Rect(0, 0 - 1080, 2400) mMaxBounds=Rect(0, 0 - 1080, 2400) mDisplayRotation=ROTATION_0 mWindowingMode=fullscreen mActivityType=undefined mAlwaysOnTop=undefined mRotation=ROTATION_0} s.45 fontWeightAdjustment=0},overrideConfig={1.0 310mcc260mnc [pl_PL,en_US] ldltr sw411dp w411dp h914dp 420dpi nrml long port finger qwerty/v/v dpad/v winConfig={ mBounds=Rect(0, 0 - 1080, 2400) mAppBounds=Rect(0, 0 - 1080, 2400) mMaxBounds=Rect(0, 0 - 1080, 2400) mDisplayRotation=ROTATION_0 mWindowingMode=fullscreen mActivityType=standard mAlwaysOnTop=undefined mRotation=ROTATION_0} s.2 fontWeightAdjustment=0},deviceId=0,referrer=com.android.shell,procState=2,state=null,persistentState=null,pendingResults=null,pendingNewIntents=null,sceneTransitionInfo=null,profilerInfo=null,assistToken=android.os.BinderProxy@dc1ecde,shareableActivityToken=android.os.BinderProxy@371aebf,activityWindowInfo=ActivityWindowInfo{isEmbedded=false, taskBounds=Rect(0, 0 - 1080, 2400), taskFragmentBounds=Rect(0, 0 - 1080, 2400)}}
   tId:787101001     ResumeActivityItem{mActivityToken=android.os.BinderProxy@c8c4a32,procState=-1,isForward=true,shouldSendCompatFakeFocus=false}
   tId:787101001     Target activity: com.broidev.bmi.MainActivity
--- KONIEC PIERWSZYCH 5 LINII ---
   tId:787101001   ]
   tId:787101001 }
   2026-09-20 14:42:19.492 12347-12347 AndroidRuntime          com.broidev.bmi                      D  Shutting down VM
   2026-09-20 14:42:19.497 12347-12347 AndroidRuntime          com.broidev.bmi                      E  FATAL EXCEPTION: main (Fix with AI)
   Process: com.broidev.bmi, PID: 12347
   java.lang.RuntimeException: Unable to start activity ComponentInfo{com.broidev.bmi/com.broidev.bmi.MainActivity}: java.lang.NullPointerException: Attempt to invoke virtual method 'void android.view.View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)' on a null object reference
   at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:4280)
   at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:4467)
   at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:222)
   at android.app.servertransaction.TransactionExecutor.executeNonLifecycleItem(TransactionExecutor.java:133)
   at android.app.servertransaction.TransactionExecutor.executeTransactionItems(TransactionExecutor.java:103)
   at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:80)
   at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2823)
   at android.os.Handler.dispatchMessage(Handler.java:110)
   at android.os.Looper.loopOnce(Looper.java:248)
   at android.os.Looper.loop(Looper.java:338)
   at android.app.ActivityThread.main(ActivityThread.java:9067)
   at java.lang.reflect.Method.invoke(Native Method)
   at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:593)
   at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:932)
   Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'void android.view.View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)' on a null object reference
   at androidx.core.view.ViewCompat$Api21Impl.setOnApplyWindowInsetsListener(ViewCompat.java:4840)
   at androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(ViewCompat.java:2537)
   at com.broidev.bmi.MainActivity.onCreate(MainActivity.kt:17)
   at android.app.Activity.performCreate(Activity.java:9155)
   at android.app.Activity.performCreate(Activity.java:9133)
   at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1521)
   at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:4262)
   ... 13 more
   ---------------------------- PROCESS ENDED (12347) for package com.broidev.bmi ----------------------------
3. Nie pojawia się Toast :OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!!!!!11!