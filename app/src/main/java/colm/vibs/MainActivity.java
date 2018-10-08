package colm.vibs;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
		Vibrator vibrator;
		boolean rock;
		
		
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
				
			
				TextView text = findViewById(R.id.t);
					
		
				
				vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

				rock= false;
				
				
		}
		
		public void tL(View v){
				if(rock){
						rock=false;
				}else{
						rock=true;
				}
				if(rock){
						vibrator.vibrate(1000000);
				}else{
						vibrator.cancel();
						rock=false;
				}
				
				
				
		}

		@Override
		protected void onPause()
		{
				// TODO: Implement this method
				super.onPause();
				onStop();
		}
		
		

		@Override
		protected void onStop()
		{
				// TODO: Implement this method
				super.onStop();
				onDestroy();
		}
		
		

		@Override
		protected void onDestroy()
		{
				// TODO: Implement this method
				super.onDestroy();
				
				
				
		}
		
		
		
		
		
	
		
		}
		
		 
