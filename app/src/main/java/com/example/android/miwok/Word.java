package com.example.android.miwok;

/**
 * Created by Kartikeya on 4/13/2017.
 */

public class Word {
    private int imageFlag = 0;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioId;

    public Word(String defaultTranslation, String miwokTranslation, int audioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId = audioId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioId = audioId;
        imageFlag = 1;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslationion(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public int getImageFlag() { return imageFlag;}

    public  int getmAudioId() { return mAudioId; }
}