package com.Ocacle.Demo3;

class NoteBook {
	//笔记本运行功能
	public void run()
	{
		System.out.println("笔记本开启");
	}
	//笔记本使用Usb接口
	/* 笔记本使用USB设备,笔记本的对象调用这个功能。
	 * 必须给传递一个符合USB规则的USB设备*/
	public void useUsb(Usb usb){
		if(usb != null)
		{
			usb.open();
			usb.close();
		}
	}
	public void shotdown()
	{
		System.out.println("笔记本关闭");
	}
}
