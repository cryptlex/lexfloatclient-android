package com.cryptlex.lexfloatclient;

import com.sun.jna.Library;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.WString;
import java.nio.CharBuffer;
import java.nio.ByteBuffer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.Callback;
import java.io.File;

public class LexFloatClientNative implements Library {

    static {
        Native.register(LexFloatClientNative.class,"LexFloatClient");
    }

    public interface CallbackType extends Callback {
        void invoke(int status);
    }

    public static native int SetHostProductId(String productId);

    public static native int SetHostUrl(String hostUrl);

    public static native int SetFloatingLicenseCallback(CallbackType callback);

    public static native int SetFloatingClientMetadata(String key, String value);

    public static native int GetHostLicenseMetadata(String key, ByteBuffer value, int length);
    
    public static native int GetHostLicenseMeterAttribute(String name, IntByReference allowedUses, IntByReference totalUses, IntByReference grossUses);
    
    public static native int GetHostLicenseExpiryDate(IntByReference expiryDate);
    
    public static native int GetFloatingClientMeterAttributeUses(String name, IntByReference uses);

    public static native int RequestFloatingLicense();

    public static native int DropFloatingLicense();

    public static native int HasFloatingLicense();
    
    public static native int IncrementFloatingClientMeterAttributeUses(String name, int increment);
    
    public static native int DecrementFloatingClientMeterAttributeUses(String name, int decrement);
    
    public static native int ResetFloatingClientMeterAttributeUses(String name);

}