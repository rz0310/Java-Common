package com.Ocacle.Demo3;
//���ʵ��USB�ӿ�
class Mouse implements Usb {

	@Override
	public void open() {
		System.out.println("��꿪��");
	}

	@Override
	public void close() {
		System.out.println("���ر�");
	}

}
