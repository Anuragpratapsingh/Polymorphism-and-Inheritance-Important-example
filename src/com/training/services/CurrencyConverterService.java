package com.training.services;
import com.training.Impl.DhiramToInr;
import com.training.Impl.EuroToInr;
import com.training.Impl.UsdToInrConverter;
import com.training.ifaces.*;
import com.training.ifaces.*;

public class CurrencyConverterService {
	//Factory Method
	public Function getFunctionByType(String key) {
			
		switch (key) {
		case ConvTypes.USDTOINR:
			return new UsdToInrConverter();
		case  ConvTypes.DIRTOINR:
			return new DhiramToInr();
		case ConvTypes.EURTOINR:
			return new EuroToInr();
		default:
			return null;
		}
	}
	
	public void printResult(Function funRef,double value) {
		System.out.println(funRef.apply(value));
	}
}

