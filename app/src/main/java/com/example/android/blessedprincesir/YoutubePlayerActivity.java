package com.example.android.blessedprincesir;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

import static android.provider.MediaStore.Video.Thumbnails.VIDEO_ID;

/**
 * Created by g50 on 19-06-2017.
 */

public class YoutubePlayerActivity  extends AppCompatActivity implements YouTubePlayer.OnInitializedListener {

    public  String trackName,lyrics,eLyrics;
    int position;


    public static final String API_KEY = "AIzaSyA7oWL0NcqD_yP4Rs-tVYa1TFhzpnTGhsY";

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.youtubeactivity);

        Bundle bundle1= getIntent().getExtras();
        if(bundle1!= null){
            trackName= bundle1.getString("clickedItem");
            position= bundle1.getInt("position");
            lyrics=bundle1.getString("Lyrics");
            eLyrics=bundle1.getString("ELyrics");

        }

      //  Bundle bundle2 = new Bundle();
        //bundle.putString("tamilLyrics", "hey");
/*
        TamilLyricFragment tamilLyricFragment = new TamilLyricFragment();
        tamilLyricFragment.setArguments(bundle2);

        EnglishLyricFragment englishLyricFragment = new EnglishLyricFragment();
        englishLyricFragment.setArguments(bundle2);*/

        YouTubePlayerSupportFragment frag =
                (YouTubePlayerSupportFragment) getSupportFragmentManager().findFragmentById(R.id.youtube_view);
        frag.initialize(API_KEY, this);

        TextView trackNameText = (TextView) findViewById(R.id.trackNameText);
        trackNameText.setText(trackName);


        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(API_KEY, this);


        ViewPager viewPager= (ViewPager) findViewById(R.id.viewpager);
        YoutubeFragmentAdapter adapter = new YoutubeFragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout= (TabLayout)findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {

        String videoArray[]={
                "mKzLoZFz8PE","aIbdKrb0qQk","2n73O65J4_U","Wlls4CgRR1M","pv2-c8wPmHU","Zy_6zOwDTpA","Dq0F4Sg4GTs",
                "koXHJMr6EHs","mZg9O5CjKg4","_lT5b_22VSM"
        };

        youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
        youTubePlayer.setPlaybackEventListener(playbackEventListener);

        if(!wasRestored){
            switch(position){
                case 0:
                    youTubePlayer.cueVideo(videoArray[0]);
                    break;
                case 1:
                    youTubePlayer.cueVideo(videoArray[1]);
                    break;
                case 2:
                    youTubePlayer.cueVideo(videoArray[2]);
                    break;
                case 3:
                    youTubePlayer.cueVideo(videoArray[3]);
                    break;
                case 4:
                    youTubePlayer.cueVideo(videoArray[4]);
                    break;
                case 5:
                    youTubePlayer.cueVideo(videoArray[5]);
                    break;
                case 6:
                    youTubePlayer.cueVideo(videoArray[6]);
                    break;
                case 7:
                    youTubePlayer.cueVideo(videoArray[7]);
                    break;
                case 8:
                    youTubePlayer.cueVideo(videoArray[8]);
                    break;

                default:
                    youTubePlayer.cueVideo(VIDEO_ID);
            }
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }

    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onBuffering(boolean arg0) {
        }
        @Override
        public void onPaused() {
        }
        @Override
        public void onPlaying() {
        }
        @Override
        public void onSeekTo(int arg0) {
        }
        @Override
        public void onStopped() {
        }
    };
    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onAdStarted() {
        }
        @Override
        public void onError(YouTubePlayer.ErrorReason arg0) {
        }
        @Override
        public void onLoaded(String arg0) {
        }
        @Override
        public void onLoading() {
        }
        @Override
        public void onVideoEnded() {
        }
        @Override
        public void onVideoStarted() {
        }
    };
}
