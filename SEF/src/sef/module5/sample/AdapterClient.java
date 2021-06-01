package sef.module5.sample;
import sef.module5.sample.AdapterInterface;

public class AdapterClient {

	private AdapterInterface ai;
	
	public void setAdapter(AdapterInterface ai){
		this.ai = ai;
	}
	
	public void doWork(){
		ai.execute();
	}
}
