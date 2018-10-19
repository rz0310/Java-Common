package com.Ocacle.Demo3;

public class Test {

	public static void main(String[] args) {
		//创建笔记本实体对象
		NoteBook nb = new NoteBook();
		//笔记本运行
		nb.run();
		//创建鼠标实体对象
		Mouse m = new Mouse();
		//使用鼠标
		nb.useUsb(m);
		//创建键盘实体对象
		KeyBoard k = new KeyBoard();
		//使用键盘
		nb.useUsb(k);
		//笔记本关闭
		nb.shotdown();
	}

}
