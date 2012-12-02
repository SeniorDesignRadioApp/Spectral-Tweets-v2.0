package seniordesignradioapp.spectral.tweets;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IBinder;

public class HelperService extends Service
{
	
	private static class WifiScanner extends BroadcastReceiver
	{

		@Override
		public void onReceive(Context arg0, Intent arg1)
		{
			
		}
		
	}
	
	private static class GPSScanner implements LocationListener
	{

		public void onLocationChanged(Location arg0)
		{
			
		}

		public void onProviderDisabled(String arg0)
		{
			
		}

		public void onProviderEnabled(String arg0)
		{
			
		}

		public void onStatusChanged(String arg0, int arg1, Bundle arg2)
		{
			
		}
		
	}

	@Override
	public IBinder onBind(Intent arg0)
	{
		return null;
	}

}
