package com.example.android.blessedprincesir;

/**
 * Created by g50 on 17-06-2017.
 */

public class Album {

    private String mTrackName;
    private String mAlbumName;

    public Album(String mTrackName, String mAlbumName) {
        super();
        this.mTrackName = mTrackName;
        this.mAlbumName= mAlbumName;

    }

    public String getmTrackName() {
        return mTrackName;
    }

    public String getmAlbumName(){
        return mAlbumName;
    }

}
