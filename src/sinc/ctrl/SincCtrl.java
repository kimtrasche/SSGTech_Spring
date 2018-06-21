package sinc.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import sinc.service.SincService;

@Controller
public class SincCtrl {

	@Resource(name="service")
	private SincService service;
	
	/* Setter Injection
	public void setService(SincService service) {
	
		this.service= service;
	}
	*/
	
	
	/*Constuctor Injection
	public SincCtrl(SincService service) {
		this.service = service;
	}
	*/
	
	
	public String sayEcho(String msg) {
		
		System.out.println("ctrl sayEcho");
		return service.sayEcho(msg);
		
	}
}
