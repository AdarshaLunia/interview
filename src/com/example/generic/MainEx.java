package com.example.generic;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxPrinter<Integer> boxPrinter1=new BoxPrinter<Integer>(new Integer(20));
		System.out.println("box Printer Val ::Interger::"+boxPrinter1);
		
		BoxPrinter<String> boxPrinter2=new BoxPrinter<String>(new String("Welcome"));
		System.out.println("box Printer Val ::String ::"+boxPrinter2);

		PairCast<String, Long> pair1=new PairCast<String, Long>("Adarsha", 10L);
		System.out.println("PAIR ONE :: => "+pair1.getObjectT1()+"  ::**::  "+pair1.getObjectT2());
		
		PairCast<Float, Long> pair2=new PairCast(10.786F, 1012L);
		System.out.println("PAIR TWO :: => "+pair2.getObjectT1()+"  ::**::  "+pair2.getObjectT2());
		
		SingleCast<String> singleCast1=new SingleCast<String>("1000", "Adarsha");
		System.out.println("Single Case 1 => "+singleCast1.getObjectT1()+"\t"+singleCast1.getObjectT2());
		
		
	}

}
