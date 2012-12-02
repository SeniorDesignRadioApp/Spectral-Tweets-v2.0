package seniordesignradioapp.spectral.tweets;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Main extends Activity
{
	
	private Intent in;
	public static TextView tv1;
	
    public static void changeText(String msg)
    {
    	tv1.setText(msg);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		in = new Intent(this, HelperService.class);
        tv1 = (TextView) findViewById(R.id.textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
