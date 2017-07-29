package com.example.android.blessedprincesir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by g50 on 14-06-2017.
 */

public class VideoFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.videofragment, container, false);

        CardView videosCardView1= (CardView) view.findViewById(R.id.videosCardView1);
        videosCardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(getActivity(),"Videos 1", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(),Video_Album_One.class);
                startActivity(intent);
            }
        });

        CardView videosCardView2 = (CardView) view.findViewById(R.id.videosCardView2);
        videosCardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           ///     Toast.makeText(getActivity(),"Videos 2", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(),Video_Album_Two.class);
                startActivity(intent);

            }
        });

        return view;

    }


}
