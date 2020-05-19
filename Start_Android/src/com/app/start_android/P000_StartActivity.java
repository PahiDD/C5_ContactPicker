package com.app.start_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class P000_StartActivity extends Activity implements View.OnClickListener
	{
		Button btnp004,btnp005;

		@Override
		protected void onCreate(Bundle savedInstanceState)
			{
				super.onCreate(savedInstanceState);

				TableLayout tableLayout = new TableLayout(this);
				tableLayout.setLayoutParams(new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.MATCH_PARENT));

				TableLayout.LayoutParams tableParams = new TableLayout.LayoutParams(
						TableLayout.LayoutParams.WRAP_CONTENT,
						TableLayout.LayoutParams.WRAP_CONTENT);
				TableRow.LayoutParams rowParams = new TableRow.LayoutParams(
						TableRow.LayoutParams.WRAP_CONTENT,
						TableRow.LayoutParams.WRAP_CONTENT);
				rowParams.weight=1;

				setContentView(tableLayout, tableParams);

				btnp004 = new Button(this);
				btnp004.setText(R.string.title_p004);
				btnp004.setId(R.id.btn_p004);
				btnp004.setOnClickListener(this);
				btnp004.setLayoutParams(rowParams);
				
				btnp005 = new Button(this);
				btnp005.setText(R.string.title_p005);
				btnp005.setId(R.id.btn_p005);
				btnp005.setOnClickListener(this);
				btnp005.setLayoutParams(rowParams);

				TableRow tableRow_04 = new TableRow(this);
				tableRow_04.setLayoutParams(tableParams);
				tableLayout.addView(tableRow_04);
				tableRow_04.addView(btnp004);
				tableRow_04.addView(btnp005);

			}

		@Override
		public void onClick(View v)
			{
				Intent intent;
				switch (v.getId())
					{
					case R.id.btn_p004:
						intent = new Intent(this, P004_BasicViews.class);
						startActivity(intent);
						break;
					case R.id.btn_p005:
						intent = new Intent(this, P005_LayoutFiles.class);
						startActivity(intent);
						break;
					default:
						break;
					}
			}
	}
