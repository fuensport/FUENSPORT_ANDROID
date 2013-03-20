package com.android.fuensport;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;


public class OlvidoPasswordActivity extends Activity implements OnClickListener{
    private String correo;
	private EditText etx_Correo;
	private TextView textViewErrorEnvioPassword;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		View botonConfirm = findViewById(R.id.buttonConfirmarRegistro);
		botonConfirm.setOnClickListener((android.view.View.OnClickListener) this);
		
		etx_Correo = (EditText)findViewById(R.id.editTextCuentaCorreo);
	}
	
	public void onClick(View vista) {
		if (vista.getId()==findViewById(R.id.buttonConfirmarRegistro).getId()){
			correo = etx_Correo.getText().toString();
			if(correo != null && !correo.equals("")){   
				
			}else{
				textViewErrorEnvioPassword.setText("Introduzca un correo");
			}
		}	
	}
}