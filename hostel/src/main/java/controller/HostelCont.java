package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.HostelModel;
import service.HostelSer;

@RestController
public class HostelCont {
	//comment
	@Autowired
	HostelSer ser;
	//hfhhfdsfhh
	@GetMapping("/getO/{id}")
	public HostelModel getOne(@PathVariable int id) {
		return ser.getHostel(id);
	}
	

}
