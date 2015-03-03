package com.example.prak_listview;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] os_product = new String[] { "Android", "iPhone", "Blackberry",
				"Windwows Phone" };

		this.setListAdapter(new ArrayAdapter(this, R.layout.list_item, R.id.label, os_product));

		ListView lv = getListView();

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView parent, View view,
					int position, long id) {
				String product = ((TextView) view).getText().toString();

				Intent i = new Intent(getApplicationContext(), SingleList.class);
				i.putExtra("kategori", product);
				startActivity(i);
			}
		});
	}
}