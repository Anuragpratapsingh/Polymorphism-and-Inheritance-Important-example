package com.training.services;

import com.training.Impl.DhiramToInr;
import com.training.Impl.EuroToInr;
import com.training.Impl.UsdToInrConverter;
import com.training.Impl.YenToInr;
import com.training.ifaces.ConvTypes;
import com.training.ifaces.Function;
import com.training.ifaces.YenToInrConvTypes;

public class SubService extends CurrencyConverterService{
	
	

	@Override
	public Function getFunctionByType(String key) {
		// TODO Auto-generated method stub
			
			switch (key) {
			case YenToInrConvTypes.YENTOINR:
				return new YenToInr();
			default:
				return super.getFunctionByType(key);
				
			}		
		}
	
}
	
	

