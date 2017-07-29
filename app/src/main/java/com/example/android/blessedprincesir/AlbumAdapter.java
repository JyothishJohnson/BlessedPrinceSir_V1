package com.example.android.blessedprincesir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by g50 on 17-06-2017.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter (Context context, ArrayList<Album> java){
        super(context,0,java);
    }

    @Override
    public View getView (int position, View counterview , ViewGroup parent){

        View listItemView = counterview;
        if(listItemView== null){

            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Album currentAlbum = getItem(position);

        TextView topicName = (TextView) listItemView.findViewById(R.id.trackName);

        topicName.setText(currentAlbum.getmTrackName());

        TextView questions = (TextView) listItemView.findViewById(R.id.albumName);

        questions.setText(currentAlbum.getmAlbumName());



        return listItemView;
    }
}
