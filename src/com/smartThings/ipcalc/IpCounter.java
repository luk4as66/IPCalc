package com.smartThings.ipcalc;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.test.ActivityUnitTestCase;
import android.util.Log;

public class IpCounter{

	public static String getIPaddress(){
		try{
			for(Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();){
				
				NetworkInterface interf = en.nextElement();
				
				for(Enumeration<InetAddress> enumIpAddr = interf.getInetAddresses();enumIpAddr.hasMoreElements();){
					
					InetAddress inetAddress = enumIpAddr.nextElement();
					
					if(!inetAddress.isLoopbackAddress()){
						
						String ipAddres = inetAddress.getHostAddress().toString();
						Log.e("ip address: ",ipAddres);
						return ipAddres;
					}
				}
			}
		}
		catch(SocketException ex){
			Log.e("SOCKET EXCEPTION in get IP ADDDRESs", ex.toString());
		}
		return null;
	}	
	
	public static String getMacAddress(Activity activity){
		
		WifiManager wifi = (WifiManager)activity.getSystemService(Context.WIFI_SERVICE);
		WifiInfo info = wifi.getConnectionInfo();
		String macAddr = info.getMacAddress();
		
		Log.e("TWOJ ADRES MAC:",macAddr);
		return macAddr;
	}
	
	
	
}
