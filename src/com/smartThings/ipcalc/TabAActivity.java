package com.smartThings.ipcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class TabAActivity extends Activity implements OnTouchListener{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_a_layout);
		
		
		
		TextView textMacAddr = (TextView)findViewById(R.id.mac_addr);
		TextView textIpAddr = (TextView)findViewById(R.id.count_ip);
		textMacAddr.setText(IpCounter.getMacAddress(this));
		textIpAddr.setText(IpCounter.getIPaddress());
	}
	
	@Override
	public boolean onTouch(View arg0, MotionEvent arg1){
		String test = "move!";
		return false;
	}
}
