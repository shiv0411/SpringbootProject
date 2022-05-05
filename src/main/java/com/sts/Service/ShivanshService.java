
package com.sts.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sts.Student.Shivansh;
import com.sts.repository.ShivanshRepository;

@Component
public class ShivanshService {
	
	@Autowired
	private ShivanshRepository shivanshRepository;
	
	@Autowired
	private Shivansh shivansh ;
	
	
	public Shivansh getShivansh() {
		return shivansh;
	}
	public void setShivansh(Shivansh shivansh) {
		this.shivansh = shivansh;
	}

	public ShivanshService() {	
			
	}

	
//    to save  Shivansh
	public Shivansh save(Shivansh result) {
		return shivanshRepository.save(result);
	}
	
	
//	 return the  percentage 
 	public Float getPercent() {
 		Float percent = (float) (selectTotals()/selectId());
 		return percent;
 		
 	}
	public int selectId() {
		return shivanshRepository.selectId();
	}
	public  int selectTotals() {
		
		return  shivanshRepository.selectTotals();
	}


}
