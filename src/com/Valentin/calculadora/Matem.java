package com.Valentin.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Matem extends Activity implements OnClickListener {
	
	Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton0;
	Button botonMas,botonMenos,botonPor,botonEntre,botonC,botonPunto,botonIgual;
	String cadena="";
	TextView datos, resultado;
	Float uno,dos; //con mayscula es de tipo objeto
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matem);
        
        boton1=(Button)findViewById(R.id.btn1);
        boton1.setOnClickListener(this);
        
        boton2=(Button)findViewById(R.id.btn2);
        boton2.setOnClickListener(this);
        
        boton3=(Button)findViewById(R.id.btn3);
        boton3.setOnClickListener(this);
        
        boton4=(Button)findViewById(R.id.btn4);
        boton4.setOnClickListener(this);
        
        boton5=(Button)findViewById(R.id.btn5);
        boton5.setOnClickListener(this);
        
        boton6=(Button)findViewById(R.id.btn6);
        boton6.setOnClickListener(this);
        
        boton7=(Button)findViewById(R.id.btn7);
        boton7.setOnClickListener(this);
        
        boton8=(Button)findViewById(R.id.btn8);
        boton8.setOnClickListener(this);
        
        boton9=(Button)findViewById(R.id.btn9);
        boton9.setOnClickListener(this);
        
        boton0=(Button)findViewById(R.id.btn0);
        boton0.setOnClickListener(this);
        
        botonMas=(Button)findViewById(R.id.btnSuma);
        botonMas.setOnClickListener(this);
        
        botonMenos=(Button)findViewById(R.id.btnResta);
        botonMenos.setOnClickListener(this);
        
        botonPor=(Button)findViewById(R.id.btnMultiplicacion);
        botonPor.setOnClickListener(this);
        
        botonEntre=(Button)findViewById(R.id.btnDiv);
        botonEntre.setOnClickListener(this);
        
        botonC=(Button)findViewById(R.id.btnC);
        botonC.setOnClickListener(this);
        
        botonPunto=(Button)findViewById(R.id.btnPunto);
        botonPunto.setOnClickListener(this);
        
        botonIgual=(Button)findViewById(R.id.btnigual);
        botonIgual.setOnClickListener(this);
        
        datos=(TextView)findViewById(R.id.datos);
        resultado=(TextView)findViewById(R.id.resultado);
        
        
        
        
        
        
        
    }


	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(R.id.btn1==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 1"); //son mensajes que nadamas los visualiza el programados en LogCat
			cadena+="1";
			
		}else if(R.id.btn2==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 2");
			cadena=cadena+"2";
			
		}else if(R.id.btn3==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 3");
			cadena=cadena+"3";
		}else if(R.id.btn4==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 4");
			cadena=cadena+"4";
		}else if(R.id.btn5==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 5");
			cadena=cadena+"5";
		}else if(R.id.btn6==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 6");
			cadena=cadena+"6";
		}else if(R.id.btn7==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 7");
			cadena=cadena+"7";
		}else if(R.id.btn8==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 8");
			cadena=cadena+"8";
		}else if(R.id.btn9==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 9");
			cadena=cadena+"9";
		}else if(R.id.btn0==v.getId()){
			Log.i("Mi mensaje","Pulse el boton 0");
			cadena=cadena+"0";
		}else if(R.id.btnSuma==v.getId()){
			Log.i("Mi mensaje","Pulse el boton Suma");
			uno=Float.valueOf(cadena);//guarda la cadena que vamos a operar
			cadena=cadena+"+";
		}else if(R.id.btnResta==v.getId()){
			Log.i("Mi mensaje","Pulse el boton Resta");
			uno=Float.valueOf(cadena);//guarda la cadena que vamos a operar
			cadena=cadena+"-";
		}else if(R.id.btnMultiplicacion==v.getId()){
			Log.i("Mi mensaje","Pulse el boton Multiplicacion");
			uno=Float.valueOf(cadena);//guarda la cadena que vamos a operar
			cadena=cadena+"*";
		}else if(R.id.btnDiv==v.getId()){
			Log.i("Mi mensaje","Pulse el boton Division");
			uno=Float.valueOf(cadena);//guarda la cadena que vamos a operar
			cadena=cadena+"/";
		}else if(R.id.btnC==v.getId()){
			Log.i("Mi mensaje","Pulse el boton C");
			cadena="";
		}else if(R.id.btnPunto==v.getId()){
			Log.i("Mi mensaje","Pulse el boton .");
			cadena=cadena+".";
		}else if(R.id.btnigual==v.getId()){
			Log.i("Mi mensaje","Pulse el boton Igual");
			//no va nada
			Calcular();
		}
		
		datos.setText(cadena);
		
		
		
	}//termina on click
	
	public void Calcular(){ //metodo para calcular
		String operadores=datos.getText().toString();
		String numero2="";
		Float result=0.0f;
		
		if(operadores.contains("+")){
			int posicion=operadores.indexOf("+"); //saber la cadena de caracteres donde termina antes del signo
			numero2=operadores.substring(posicion+1);//cadena despues de el signo
			dos=Float.valueOf(numero2);//hacer fltante el numero
			result=uno+dos;
			resultado.setText(result.toString());
		}
		
		if(operadores.contains("-")){
			int posicion=operadores.indexOf("-");
			numero2=operadores.substring(posicion+1);
			dos=Float.valueOf(numero2);
			result=uno-dos;
			resultado.setText(result.toString());
		}
		
		if(operadores.contains("*")){
			int posicion=operadores.indexOf("*");
			numero2=operadores.substring(posicion+1);
			dos=Float.valueOf(numero2);
			result=uno*dos;
			resultado.setText(result.toString());
		}
		
		if(operadores.contains("/")){
			int posicion=operadores.indexOf("/");
			numero2=operadores.substring(posicion+1);
			dos=Float.valueOf(numero2);
			result=uno/dos;
			resultado.setText(result.toString());
		}
		
	}
}
