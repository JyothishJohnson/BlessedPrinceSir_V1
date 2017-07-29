package com.example.android.blessedprincesir;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by g50 on 27-07-2017.
 */

public class TamilLyricFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tamil_lyric_fragment,container,false);

      //  String tamilLyrics = getArguments().getString("tamilLyrics");

        String tamilLyrics= getActivity().getIntent().getStringExtra("Lyrics");

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(),"Bamini.ttf");

        TextView tamillyricsText= (TextView) view.findViewById(R.id.tamil_lyrics);

        tamillyricsText.setTypeface(tf);

        tamillyricsText.setText(tamilLyrics);

        return view;
    }
}
