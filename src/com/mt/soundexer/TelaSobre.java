package com.mt.soundexer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSobre extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_sobre);
		
		  // Botão OK
		  final MediaPlayer mpBotaoOKClick = MediaPlayer.create(this, R.raw.botao_ok);
		  
		  Button botaoOK = (Button) findViewById(R.id.buttonOK);
		  botaoOK.setOnClickListener(new View.OnClickListener() {		  
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				mpBotaoOKClick.start();
				Intent intentMain = new Intent(TelaSobre.this, TelaSoundexerPlay.class);
				startActivity(intentMain);
			}
		});		
	}
}
