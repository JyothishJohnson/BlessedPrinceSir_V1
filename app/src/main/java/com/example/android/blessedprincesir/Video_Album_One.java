package com.example.android.blessedprincesir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by g50 on 17-06-2017.
 */

public class Video_Album_One extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracklist);

        final String[] engLyrics={
          "Age 1.90   Pillai Bear?\n" +
                  "Sheep   Meyttavan   The king Avana?\n" +
                  "It   How   Does that imply?\n" +
                  "It   How   Does that imply?\n" +
                  "My   With God   Everything Is\n" +
                  "It   How   Does that imply?\n" +
                  "It   How   Does that imply?\n" +
                  "My   Iyecuvale   Everything Is\n" +
                  " \n" +
                  " \n" +
                  "2. Trumpet utina   Castle Break?\n" +
                  "Wind   Bays   Said When the?\n" +
                  "It   How   Does that imply?\n" +
                  "It   How   Does that imply?\n" +
                  "My   With God   Everything Is\n" +
                  "It   How   Does that imply?\n" +
                  "It   How   Does that imply?\n" +
                  "My   Iyecuvale   Everything Is\n",
                "Age 1.90   Pillai Bear?\n" +
                        "Sheep   Meyttavan   The king Avana?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n" +
                        " \n" +
                        " \n" +
                        "2. Trumpet utina   Castle Break?\n" +
                        "Wind   Bays   Said When the?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n",
                "Age 1.90   Pillai Bear?\n" +
                        "Sheep   Meyttavan   The king Avana?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n" +
                        " \n" +
                        " \n" +
                        "2. Trumpet utina   Castle Break?\n" +
                        "Wind   Bays   Said When the?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n",
                "Age 1.90   Pillai Bear?\n" +
                        "Sheep   Meyttavan   The king Avana?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n" +
                        " \n" +
                        " \n" +
                        "2. Trumpet utina   Castle Break?\n" +
                        "Wind   Bays   Said When the?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n",
                "Age 1.90   Pillai Bear?\n" +
                        "Sheep   Meyttavan   The king Avana?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n" +
                        " \n" +
                        " \n" +
                        "2. Trumpet utina   Castle Break?\n" +
                        "Wind   Bays   Said When the?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n",
                "Age 1.90   Pillai Bear?\n" +
                        "Sheep   Meyttavan   The king Avana?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n" +
                        " \n" +
                        " \n" +
                        "2. Trumpet utina   Castle Break?\n" +
                        "Wind   Bays   Said When the?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n",
                "Age 1.90   Pillai Bear?\n" +
                        "Sheep   Meyttavan   The king Avana?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n" +
                        " \n" +
                        " \n" +
                        "2. Trumpet utina   Castle Break?\n" +
                        "Wind   Bays   Said When the?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n",
                "Age 1.90   Pillai Bear?\n" +
                        "Sheep   Meyttavan   The king Avana?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n" +
                        " \n" +
                        " \n" +
                        "2. Trumpet utina   Castle Break?\n" +
                        "Wind   Bays   Said When the?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n",
                "Age 1.90   Pillai Bear?\n" +
                        "Sheep   Meyttavan   The king Avana?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n" +
                        " \n" +
                        " \n" +
                        "2. Trumpet utina   Castle Break?\n" +
                        "Wind   Bays   Said When the?\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   With God   Everything Is\n" +
                        "It   How   Does that imply?\n" +
                        "It   How   Does that imply?\n" +
                        "My   Iyecuvale   Everything Is\n"

        };

        final String[] tamilLyrics ={
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;",
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;",
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;",
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;",
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;",
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;",
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;",
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;",
                "1.90 taRy gps;isgpwf;Fkh?\n" +
                        "MLfs; Nka;j;jtd; murd;Mthdh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; ,NaRthNy vy;yhNkMFk;\n" +
                        " \n" +
                        " \n" +
                        "2. vf;fhsk; Cjpdh Nfhl;ilcilAkh?\n" +
                        "fhw;Wk; flYk; nrhd;dhNfl;Fkh?\n" +
                        ",J vg;gb MFk;?\n" +
                        ",J vg;gb MFk;?\n" +
                        "vd; NjtdhNy vy;yhNkMFk;\n" +
                        ",J vg;gb MFk;? \n" +
                        ",J vg;gb MFk;? \n" +
                        "vd; ,NaRthNy vy;yhNkMFk;"

        };


        final ArrayList<Album> album = new ArrayList<Album>();

        album.add(new Album("Introduction 1", "1 Questions"));
        album.add(new Album("Introduction 2", "2 Questions"));
        album.add(new Album("Introduction 3", "3 Questions"));
        album.add(new Album("Introduction 4", "4 Questions"));
        album.add(new Album("Introduction 5", "5 Questions"));
        album.add(new Album("Introduction 6", "6 Questions"));
        album.add(new Album("Introduction 7", "7 Questions"));
        album.add(new Album("Introduction 8", "8 Questions"));
        album.add(new Album("Introduction 9", "9 Questions"));
        album.add(new Album("Introduction 10", "10 Questions"));


        ListAdapter adapter = new AlbumAdapter(this, album);

        ListView listView = (ListView) findViewById(R.id.trackList);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Album clickedItem = album.get(position);
                switch(position){
                    case 0:
                        Intent i0 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i0.putExtra("position",position);
                        i0.putExtra("clickedItem", clickedItem.getmTrackName());
                        i0.putExtra("Lyrics",tamilLyrics[0]);
                        i0.putExtra("ELyrics",engLyrics[0]);
                        startActivity(i0);
                        break;
                    case 1:
                        Intent i1 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i1.putExtra("position",position);
                        i1.putExtra("clickedItem", clickedItem.getmTrackName());
                        i1.putExtra("Lyrics",tamilLyrics[1]);
                        i1.putExtra("ELyrics",engLyrics[1]);

                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i2.putExtra("position",position);
                        i2.putExtra("clickedItem", clickedItem.getmTrackName());
                        i2.putExtra("Lyrics",tamilLyrics[2]);
                        i2.putExtra("ELyrics",engLyrics[2]);

                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i3.putExtra("position",position);
                        i3.putExtra("clickedItem", clickedItem.getmTrackName());
                        i3.putExtra("Lyrics",tamilLyrics[3]);
                        i3.putExtra("ELyrics",engLyrics[3]);

                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i4.putExtra("position",position);
                        i4.putExtra("clickedItem", clickedItem.getmTrackName());
                        i4.putExtra("ELyrics",engLyrics[4]);

                        i4.putExtra("Lyrics",tamilLyrics[4]);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i5.putExtra("position",position);
                        i5.putExtra("clickedItem", clickedItem.getmTrackName());
                        i5.putExtra("ELyrics",engLyrics[5]);

                        i5.putExtra("Lyrics",tamilLyrics[5]);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i6.putExtra("position",position);
                        i6.putExtra("clickedItem", clickedItem.getmTrackName());
                        i6.putExtra("ELyrics",engLyrics[6]);


                        i6.putExtra("Lyrics",tamilLyrics[6]);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i7.putExtra("position",position);
                        i7.putExtra("clickedItem", clickedItem.getmTrackName());
                        i7.putExtra("ELyrics",engLyrics[7]);

                        i7.putExtra("Lyrics",tamilLyrics[7]);
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8 = new Intent(Video_Album_One.this, YoutubePlayerActivity.class);
                        i8.putExtra("position",position);
                        i8.putExtra("clickedItem", clickedItem.getmTrackName());
                        i8.putExtra("ELyrics",engLyrics[8]);

                        i8.putExtra("Lyrics",tamilLyrics[8]);
                        startActivity(i8);
                        break;
                }

            }
        });
    }
}
