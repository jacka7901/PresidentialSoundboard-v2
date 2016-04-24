package com.example.jack.donaldtrumpsoundboard;

import android.media.MediaPlayer;
import android.view.View;

import com.example.jack.donaldtrumpsoundboard.HillaryActivity;
import com.example.jack.donaldtrumpsoundboard.R;
import com.example.jack.donaldtrumpsoundboard.TrumpActivity;

/**
 * Created by jack on 4/12/2016.
 */
public class MediaButtonOnClickListener  implements View.OnClickListener  {

    //how is ths called?
    private MediaPlayerCallback mediaPlayerCallback;
    private int mediaFileId;



    public MediaButtonOnClickListener(int mediaFileId, MediaPlayerCallback mediaPlayerCallback) {
        this.mediaPlayerCallback = mediaPlayerCallback;
        this.mediaFileId = mediaFileId;
    }

    @Override
   public void onClick(View v) {

        this.mediaPlayerCallback.loadMedia(mediaFileId);

}

}



