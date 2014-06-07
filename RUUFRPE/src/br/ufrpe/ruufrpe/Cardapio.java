package br.ufrpe.ruufrpe;

import java.util.ArrayList;

import android.content.Context;

public class Cardapio {
	private static Cardapio sCardapio;
	private Context mAppContext;
	
	private ArrayList<Dia> mDias;
	
	public Cardapio(ArrayList<Dia> dias, Context appContext){
		mAppContext = appContext;
		mDias = dias;
	}
	
	public static Cardapio get(ArrayList<Dia> dias, Context c ){
		if(sCardapio == null){
			sCardapio = new Cardapio(dias, c.getApplicationContext());
		}
		return sCardapio;
	}
	
	public ArrayList<Dia> getMDias(){
		return mDias;
	}
	
	public Context getMAppContext(){
		return mAppContext;
	}
	
	public void setMDias(ArrayList<Dia> dias){
		mDias = dias;
	}

}
