package pl.froger.helloui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelloUIActivity extends Activity {
	private Button btnShowInToast;
	private Button btnShowInTextView;
	private EditText etMainEditText;
	private TextView tvMainTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btnShowInToast = (Button) findViewById(R.id.btnShowInToast);
		btnShowInTextView = (Button) findViewById(R.id.btnShowInTextView);
		etMainEditText = (EditText) findViewById(R.id.etMainField);
		tvMainTextView = (TextView) findViewById(R.id.tvMainTextView);		
		initBtnOnClickListeners();
	}

	private void initBtnOnClickListeners() {
		btnShowInToast.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showToastWithText(etMainEditText.getText());
			}
		});
		btnShowInTextView.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				changeTextInTextView(etMainEditText.getText());
			}
		});
	}

	private void showToastWithText(CharSequence toastText) {
		Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_LONG)
			 .show();
	}
	
	protected void changeTextInTextView(CharSequence text) {
		tvMainTextView.setText(text);
	}
}