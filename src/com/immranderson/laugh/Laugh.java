package com.immranderson.laugh;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class Laugh extends Activity implements OnClickListener  {
	
	
    /** Called when the activity is first created. */
	
	private MediaPlayer mp;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //set up listeners
        
        View laughButton = findViewById(R.id.laugh_button);
        laughButton.setOnClickListener(this);
        View creditButton = findViewById(R.id.credits_button);
        creditButton.setOnClickListener(this);
        
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()){

		case R.id.credits_button:
			Intent j = new Intent(this, Credit.class);
			startActivity(j);
			break;
			
		case R.id.laugh_button:
			setVolumeControlStream(AudioManager.STREAM_MUSIC);
			
			int resId = R.raw.laugh_audio;
			mp = MediaPlayer.create(this, resId);
			mp.start();
			//mp.release();
			
			//more buttons here
			
		}
		
	}
}