package com.example.exalign;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button cameraButton = (Button) findViewById(R.id.button1);
		Button filterButton = (Button) findViewById(R.id.button2);
		Button alignButton = (Button) findViewById(R.id.button3);
		Button helpButton = (Button) findViewById(R.id.button4);

		cameraButton.setOnClickListener
        (new Button.OnClickListener()
            {
            public void onClick(View v)
                {
                    Intent intent = new Intent(MainActivity.this,CameraActivity.class);
                    startActivity(intent);
                }
            }
        );
		
		filterButton.setOnClickListener
        (new Button.OnClickListener()
            {
            public void onClick(View v)
                {
                    Intent intent = new Intent(MainActivity.this,FilterActivity.class);
                    startActivity(intent);
                }
            }
        );
		
		alignButton.setOnClickListener
        (new Button.OnClickListener()
            {
            public void onClick(View v)
                {
                    Intent intent = new Intent(MainActivity.this,AlignActivity.class);
                    startActivity(intent);
                }
            }
        );
		
		helpButton.setOnClickListener
        (new Button.OnClickListener()
            {
            public void onClick(View v)
                {
                    Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                    startActivity(intent);
                }
            }
        );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
