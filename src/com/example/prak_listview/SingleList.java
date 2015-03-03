package com.example.prak_listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleList extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.single_list_view);
		
		TextView txtProduct = (TextView) findViewById(R.id.kategori_label);
		
		Intent i = getIntent();
		String product = i.getStringExtra("kategori");
		txtProduct.setText("Anda Memilih : "+product);
	}
}
