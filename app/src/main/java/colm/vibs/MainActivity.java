package colm.vibs;

import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
				TextView text = findViewById(R.id.t);
					
			
				
				Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				if (vibrator.hasVibrator()||vibrator.hasAmplitudeControl()) {
						while(true){
								VibrationEffect e = VibrationEffect.createOneShot(1000,VibrationEffect.DEFAULT_AMPLITUDE);
						vibrator.vibrate(e); // for 500 ms
						}
				}else{
						text.setText("No Amp");
				}
    }
		}
		
		 
