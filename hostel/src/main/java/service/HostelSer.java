package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.HostelModel;
import repository.HostelRepository;
@Service
public class HostelSer {
	
	@Autowired
	public HostelRepository rep;
	
	
	public HostelModel getHostel(int id) {
		HostelModel hstl=rep.findById(id).orElse(null);
		return hstl;
	}

}
