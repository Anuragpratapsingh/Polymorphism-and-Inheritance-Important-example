package com.training.services;

import com.training.Impl.CadToInr;
import com.training.Impl.YenToInr;
import com.training.ifaces.CanadianDollarConvTypes;
import com.training.ifaces.Function;
import com.training.ifaces.YenToInrConvTypes;

public class CanadianDollarSubService extends SubService {

	@Override
	public Function getFunctionByType(String key) {
		// TODO Auto-generated method stub
		switch (key) {
		case CanadianDollarConvTypes.CANADIANTOINR:
			return new CadToInr();
		default:
			return super.getFunctionByType(key);
			
		}
	}
	
	
}
