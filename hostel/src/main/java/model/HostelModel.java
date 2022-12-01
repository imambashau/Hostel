package model;



//import jakarta.persistence.Entity;
//////import jakarta.persistence.Id;
////import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
//@Entity
//@Table
public class HostelModel {
	@Id
	private int id;
	private String name;
	private int rollNum;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	
}
