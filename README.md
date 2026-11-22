# TV ANIMATION FIX

A simple native Android app built with Kotlin that fixes animation issues on Android TV.

- After installing, enable TV debugging and connect via ADB; run these commands once.
- Grant permission: `adb shell pm grant com.anmoltanwar.tvanimationfix android.permission.WRITE_SECURE_SETTINGS`.
- Activate invisibly: `adb shell am start -n com.anmoltanwar.tvanimationfix/.ActivationActivity`.
- Each full boot sets **Window animation scale** , **Transition animation scale**, and **Animator duration** scale to **0.4×**.


## Install

1. Open the repository’s **Releases** page and download the latest `.apk`.
2. Open the downloaded APK on your Android device.
3. If prompted, enable **Install unknown apps** for your browser or file manager:
   **Settings → Apps → Special app access → Install unknown apps**.
4. Return to the APK and tap **Install**.

> The Google Play release file (`.aab`) is also available on the **Releases** page.

## About

This learning project explores building a CI/CD pipeline for native Android apps and preparing production releases for Google Play.
