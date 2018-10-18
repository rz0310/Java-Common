package com.Ocacle.Demo3;
//鼠标实现USB接口
class Mouse implements Usb {

	@Override
	public void open() {
		System.out.println("鼠标开启");
	}

	@Override
	public void close() {
		System.out.println("鼠标关闭");
	}

}
