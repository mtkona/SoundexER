package com.mt.soundexer;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSoundexerPlay extends Activity {

	
	@Override
	public void onCreate(Bundle savedInstanceState){
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.tela_soundexer_play);
      
	  // aplausos
	  final MediaPlayer mpBotaoAplausoClick = MediaPlayer.create(this, R.raw.aplauso);
	  
	  Button botaoAplauso = (Button) findViewById(R.id.buttonSomAplauso);
	  botaoAplauso.setOnClickListener(new View.OnClickListener() {		  
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			mpBotaoAplausoClick.start();
			//startActivity(new Intent("com.mt.soundexer.XXX"));
		}
	});

	  // chuva
	  final MediaPlayer mpBotaoChuvaClick = MediaPlayer.create(this, R.raw.chuva);
	  
	  Button botaoChuva = (Button) findViewById(R.id.buttonSomChuva);
	  botaoChuva.setOnClickListener(new View.OnClickListener() {		  
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			mpBotaoChuvaClick.start();
		}
	});
	  
	  // gelo quebrando
	  final MediaPlayer mpBotaoGeloClick = MediaPlayer.create(this, R.raw.gelo);
	  
	  Button botaoGelo = (Button) findViewById(R.id.buttonSomGelo);
	  botaoGelo.setOnClickListener(new View.OnClickListener() {		  
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			mpBotaoGeloClick.start();
		}
	});
	
	  // tempestade
	  final MediaPlayer mpBotaoTempestadeClick = MediaPlayer.create(this, R.raw.tempestade);
	  
	  Button botaoTempestade = (Button) findViewById(R.id.buttonSomTempestade);
	  botaoTempestade.setOnClickListener(new View.OnClickListener() {		  
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			mpBotaoTempestadeClick.start();
		}
	});
	
	  
	  // sobre o aplicativo
	  final MediaPlayer mpBotaoSobreClick = MediaPlayer.create(this, R.raw.botao_sobre);
	  
	  Button botaoSobre = (Button) findViewById(R.id.buttonSobre);
	  botaoSobre.setOnClickListener(new View.OnClickListener() {		  
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			mpBotaoSobreClick.start();
			Intent intentSobre = new Intent(TelaSoundexerPlay.this, TelaSobre.class);
			startActivity(intentSobre);
		}
	});
	  
	}
	
}
