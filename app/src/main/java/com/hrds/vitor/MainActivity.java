package com.hrds.vitor;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
	EditText etCalculo, et2;
	Button bt1;
	TextView tvPreview;
	int number1, res;
	String str1, stringer;
	boolean bool = false;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		etCalculo = (EditText) findViewById(R.id.etCalc);
		et2 = (EditText) findViewById(R.id.etCalc2);
		bt1 = (Button) findViewById(R.id.bt1);
		Button button2 = (Button) findViewById(R.id.bt2);
		Button button3 = (Button) findViewById(R.id.bt3);
		Button buttonC = (Button) findViewById(R.id.btC);

		Button button4 = (Button) findViewById(R.id.bt4);
		Button button5 = (Button) findViewById(R.id.bt5);
		Button button6 = (Button) findViewById(R.id.bt6);
		Button buttonX = (Button) findViewById(R.id.btX);

		Button button7 = (Button) findViewById(R.id.bt7);
		Button button8 = (Button) findViewById(R.id.bt8);
		Button button9 = (Button) findViewById(R.id.bt9);
		Button buttondivide = (Button) findViewById(R.id.btdivide);

		Button button0 = (Button) findViewById(R.id.bt0);
		Button buttonmenos = (Button) findViewById(R.id.btmenos);
		Button buttonmais = (Button) findViewById(R.id.btmais);
		Button buttonigual = (Button) findViewById(R.id.btigual);

		tvPreview = (TextView) findViewById(R.id.tvPreview);
	}
	public void button1(View v)
	{
		if(bool == false)
		{
		str1 = etCalculo.getText().toString();
		etCalculo.setText(str1+"1");
		}
		if(etCalculo.length() > 2)
		{
			res = number1+1;
			tvPreview.setText(String.valueOf(res));
		}
		if(etCalculo.length() >= 14)
		{
			etCalculo.setTextSize(40);
		}
		if(etCalculo.length() >= 64)
		{
			etCalculo.setTextSize(20);
		}
	}
	public void buttonC(View v)
	{
		tvPreview.setText("");
		etCalculo.setText("");
	}
	public void buttonMais(View v)
	{
		if(etCalculo.length() > 0 && etCalculo.length() < 2)
		{
			number1 = Integer.valueOf(etCalculo.getText().toString());
			
			String str = etCalculo.getText().toString();
			etCalculo.setText(str+"+");
			et2.setText("+");
			stringer = "+";
		}
		if(etCalculo.length() >= 14)
		{
			etCalculo.setTextSize(40);
		}
		if(etCalculo.length() >= 64)
		{
			etCalculo.setTextSize(20);
		}
	}
	public void buttonIgual(View v)
	{
		if(etCalculo.length() > 0 && tvPreview.length() > 0)
		etCalculo.setText(String.valueOf(res));
		tvPreview.setText("");
	}
}
