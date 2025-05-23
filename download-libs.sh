#!/bin/bash 
set -e
VERSION="v4.11.0";
curl -O -L https://dl.cryptlex.com/downloads/${VERSION}/LexFloatClient-Android.zip
curl -O -L https://github.com/java-native-access/jna/raw/master/lib/native/android-armv7.jar
curl -O -L https://github.com/java-native-access/jna/raw/master/lib/native/android-aarch64.jar

unzip LexFloatClient-Android.zip -d ./android
unzip android-aarch64.jar -d ./jni64
unzip android-armv7.jar -d ./jni

cp ./jni/libjnidispatch.so lexfloatclient/src/main/jniLibs/armeabi-v7a
cp ./jni64/libjnidispatch.so lexfloatclient/src/main/jniLibs/arm64-v8a

cp ./android/libs/clang/arm64-v8a/libLexFloatClient.so lexfloatclient/src/main/jniLibs/arm64-v8a
cp ./android/libs/clang/armeabi-v7a/libLexFloatClient.so lexfloatclient/src/main/jniLibs/armeabi-v7a

cp $ANDROID_NDK_ROOT/toolchains/llvm/prebuilt/linux-x86_64/sysroot/usr/lib/aarch64-linux-android/libc++_shared.so lexfloatclient/src/main/jniLibs/arm64-v8a
cp $ANDROID_NDK_ROOT/toolchains/llvm/prebuilt/linux-x86_64/sysroot/usr/lib/arm-linux-androideabi/libc++_shared.so lexfloatclient/src/main/jniLibs/armeabi-v7a

rm -f LexFloatClient-Android.zip
rm -f android-armv7.jar
rm -f android-aarch64.jar
rm -r ./jni ./android ./jni64
