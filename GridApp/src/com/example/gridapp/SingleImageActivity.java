package com.example.gridapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;

public class SingleImageActivity extends Activity {
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_image);
		Intent i = getIntent();
		int handle = i.getExtras().getInt("id");
		ImageAdapter adapter = new ImageAdapter(SingleImageActivity.this);
		ImageView imageView = (ImageView) findViewById(R.id.imageView1);
		imageView.setImageResource(adapter.mThumbIds[handle]);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.single_image, menu);
		return true;
	}

}
