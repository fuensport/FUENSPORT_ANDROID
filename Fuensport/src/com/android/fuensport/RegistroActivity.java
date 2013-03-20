package com.android.fuensport;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroActivity extends Activity implements OnClickListener{
	private static final int MIN_PASSWORD = 8;
	
	private Activity registroActivity;
	
	private EditText etx_Usuario;
    private EditText etx_Password;
    private EditText etx_Correo;
    
    private String nombre;
    private String password;
    private String correo;
    
    private TextView txv_ErrorUsuario;
    private TextView txv_ErrorPassword;
    private TextView txv_ErrorCorreo;
    
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registro);
		
		registroActivity = this;
		
		View bt_Confirmar = findViewById(R.id.buttonConfirmarRegistro);
		bt_Confirmar.setOnClickListener((android.view.View.OnClickListener) this);

		etx_Usuario = (EditText)findViewById(R.id.editTextUsuario);
		etx_Password = (EditText)findViewById(R.id.EditTextPassword);
		etx_Correo = (EditText)findViewById(R.id.EditTextCorreo);
		
		txv_ErrorUsuario = (TextView)findViewById(R.id.textViewErrorUsuario);
		txv_ErrorPassword = (TextView)findViewById(R.id.textViewErrorPassword);
		txv_ErrorCorreo = (TextView)findViewById(R.id.textViewErrorCorreo);
	}
    

	public void onClick(View vista) {
		if (vista.getId()==findViewById(R.id.buttonConfirmarRegistro).getId()){
			nombre = etx_Usuario.getText().toString();
			password = etx_Password.getText().toString();
			correo = etx_Correo.getText().toString();
			
			if (nombre != null && !nombre.equals("") && password != null && !password.equals("") 
				&& correo != null && !correo.equals("")){
							   								
            }else {
				if (nombre == null || nombre.equals("")){
					txv_ErrorUsuario.setText("Rellena el campo nombre");
				}
				if(password == null || password.equals("")){
					txv_ErrorPassword.setText("Rellena el campo contraseña");
				}else if(password.length() < MIN_PASSWORD){
					txv_ErrorPassword.setText("La contraseña debe ser de 8 caracteres como minimo");
				}
				if(correo == null || correo.equals("")){
					txv_ErrorCorreo.setText("Rellena el campo correo");	
				}
            }
	   }				
	}
	
}