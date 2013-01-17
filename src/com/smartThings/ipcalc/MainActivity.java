package com.smartThings.ipcalc;

import android.os.Bundle;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.app.TabActivity;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		@SuppressWarnings("deprecation")
		TabHost tabHost = getTabHost();
		
		//tab A
		TabSpec tAspec = tabHost.newTabSpec("tab [A]");
		tAspec.setIndicator("Policz IP");
		Intent tabAIntent = new Intent(this, TabAActivity.class);
		tAspec.setContent(tabAIntent);
		//tab B
		TabSpec tBspec = tabHost.newTabSpec("tab [B]");
		tBspec.setIndicator("Maski");
		Intent tabBIntent = new Intent(this, TabBActivity.class);
		tBspec.setContent(tabBIntent);
		//tab C
		TabSpec tCspec = tabHost.newTabSpec("tab [C]");
		tCspec.setIndicator("Ustawienia");
		Intent tabCIntent = new Intent(this, TabCActivity.class);
		tCspec.setContent(tabCIntent);
		
		tabHost.addTab(tAspec);
		tabHost.addTab(tBspec);
		tabHost.addTab(tCspec);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch(item.getItemId())
		{
			case R.id.isSplashEnabled:
				startActivity(new Intent(this, EditPreferences.class));
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

}
