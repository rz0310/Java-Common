package com.Ocacle.Demo3;

class KeyBoard implements Usb {

	@Override
	public void open() {
		System.out.println("¼üÅÌ¿ªÆô");
	}

	@Override
	public void close() {
		System.out.println("¼üÅÌ¹Ø±Õ");
	}

}
