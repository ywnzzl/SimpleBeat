package com.jerry.simplebeat;

import android.content.Context;
import android.content.SharedPreferences;

public class Profile {

    private final static String name = "profile";

    private final static String KeyBPM = "BPM";
    private final static String KeyAudio = "Audio";
    private final static String KeyKeepScreen = "KeepScreen";
    private final static String KeySoundBooster = "SoundBooster";
    private final static String KeySoundOut = "SoundOut";
    private final static String KeyIsShake = "isShake";

    private final SharedPreferences preferences;

    public Profile(Context context) {
        preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public int getBPM() {
        return preferences.getInt(KeyBPM, 120);
    }
    public String getAudioKey() {
        return preferences.getString(KeyAudio, Constant.AudioDefault);
    }
    public boolean getKeepScreen() { return preferences.getBoolean(KeyKeepScreen, false); }
    public boolean getSoundBooster() { return preferences.getBoolean(KeySoundBooster, false); }

    public boolean getSoundOut() {
        return preferences.getBoolean(KeySoundOut, false);
    }
    public boolean getIsShake() {
        return preferences.getBoolean(KeyIsShake, false);
    }


    private void setValue(String key, String value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    private void setValue(String key, int value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    private void setValue(String key, boolean value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public void setBpm(int value) {
        setValue(KeyBPM, value);
    }

    public void setAudioKey(String value) {
        setValue(KeyAudio, value);
    }

    public void setKeepScreen(boolean value) {
        setValue(KeyKeepScreen, value);
    }

    public void setSoundBooster(boolean value) {
        setValue(KeySoundBooster, value);
    }


    public void setSoundOut(boolean value) {
        setValue(KeySoundOut, value);
    }
    public void setIsShake(boolean value) {
        setValue(KeyIsShake, value);
    }
}
