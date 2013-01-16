package com.smartThings.ipcalc;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;



public class Splash extends Activity{

	private final int SPLASH_DISPLAY_LENGHT = 2000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
	}	
	
	@Override
	protected void onResume()
	{
		super.onResume();
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
		boolean isSplashEnabled = sp.getBoolean("isSplashEnabled", true);
		
		if(isSplashEnabled)
		{
			new Handler().postDelayed(new Runnable()
			{

				@Override
				public void run() {
					Splash.this.finish();
					Intent mainIntent = new Intent(Splash.this, MainActivity.class);
					Splash.this.startActivity(mainIntent);
				}
				
			}, SPLASH_DISPLAY_LENGHT);
		}
	}
}
