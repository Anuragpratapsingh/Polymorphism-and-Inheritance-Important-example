package com.training;

import com.training.Impl.DhiramToInr;
import com.training.Impl.EuroToInr;
import com.training.Impl.UsdToInrConverter;
import com.training.services.CanadianDollarSubService;
import com.training.services.CurrencyConverterService;
import com.training.services.SubService;
import com.training.ifaces.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverterService service = new CanadianDollarSubService(); 
		Function usdToInr = service.getFunctionByType(ConvTypes.USDTOINR);
		Function dhmToInr = service.getFunctionByType(ConvTypes.DIRTOINR);
		Function euroToInr = service.getFunctionByType(ConvTypes.EURTOINR);
		Function yenToInr = service.getFunctionByType(YenToInrConvTypes.YENTOINR);
		Function cadToInr = service.getFunctionByType(CanadianDollarConvTypes.CANADIANTOINR);
		
		Function[] refs = {usdToInr , dhmToInr , euroToInr,yenToInr,cadToInr};
		for(Function eachRef : refs) {
		System.out.println(eachRef.apply(100));
		}
	}

}
