package br.ufrpe.ruufrpe;

import java.util.ArrayList;

public class Dia {
	private String mNome;
	private ArrayList<String> mPratos;
	
	public Dia(String nome, ArrayList<String> pratos) {
		mNome = nome;
		mPratos = pratos;
	}
	
	public String getMNome(){
		return mNome;
	}
	
	public ArrayList<String> getMPratos(){
		return mPratos;
	}
	
	public void setMNome(String nome){
		mNome = nome;
	}
	
	public void setMPratos(ArrayList<String> pratos){
		mPratos = pratos;
	}
	
	@Override
	public boolean equals(Object o){
		if(o != null && o instanceof Dia){
			return this.getMNome().equals(((Dia) o).getMNome());
		}
		return false;
	}

}
