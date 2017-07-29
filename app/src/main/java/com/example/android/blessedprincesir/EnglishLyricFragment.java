package com.example.android.blessedprincesir;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by g50 on 27-07-2017.
 */

public class EnglishLyricFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.english_lyric_fragment,container,false);

       // String engLyrics = getArguments().getString("tamilLyrics");

        String engLyrics = getActivity().getIntent().getStringExtra("ELyrics");

        TextView englyrics= (TextView) view.findViewById(R.id.eng_lyrics);
        englyrics.setText(engLyrics);

        return view;

    }
}