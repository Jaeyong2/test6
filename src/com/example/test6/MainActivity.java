package com.example.test6;

import android.app.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener  {

	Button btn1;
	TextView textView1;
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        
        textView1 = (TextView)findViewById(R.id.textView1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub	
		textView1.setText("나는 깍두기중알타리이다.");
	}
}
