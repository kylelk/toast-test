package com.kylelk.toasttest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		EditText edt=(EditText) findViewById(R.id.ToastData);
//		String xyz=edt.getText().toString();
		
		Button button = (Button) findViewById(R.id.ShowToast);
		button.setOnClickListener(new OnClickListener() {
			 public void onClick(View v) {
				 EditText edt=(EditText) findViewById(R.id.ToastData);
				 String xyz=edt.getText().toString();
				 Toast.makeText(getApplicationContext(), xyz,
						   Toast.LENGTH_LONG).show();

			    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
