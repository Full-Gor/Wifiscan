# React Native ProGuard rules
-keep class com.facebook.react.** { *; }
-keep class com.facebook.hermes.** { *; }
-keep class com.facebook.jni.** { *; }

# Fire Firewall native modules
-keep class com.fire.firewall.** { *; }
-keepclassmembers class com.fire.firewall.** {
    @com.facebook.react.bridge.ReactMethod *;
}

# VPN Service
-keep class android.net.VpnService { *; }
-keep class android.net.VpnService$Builder { *; }
