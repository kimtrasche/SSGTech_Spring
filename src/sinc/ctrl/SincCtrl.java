package sinc.ctrl;

import sinc.service.SincService;

public class SincCtrl {

	/* Setter Injection
	private SincService service;
	
	
	public void setService(SincService service) {
	
		this.service= service;
	}
	*/
	
	
	/*Constuctor Injection*/
	private SincService service;
	
	public SincCtrl(SincService service) {
		this.service = service;
	}
	
	
	public String sayEcho(String msg) {
		
		System.out.println("ctrl sayEcho");
		return service.sayEcho(msg);
		
	}
}
