package com.Ocacle.Demo3;

public class Test {

	public static void main(String[] args) {
		//�����ʼǱ�ʵ�����
		NoteBook nb = new NoteBook();
		//�ʼǱ�����
		nb.run();
		//�������ʵ�����
		Mouse m = new Mouse();
		//ʹ�����
		nb.useUsb(m);
		//��������ʵ�����
		KeyBoard k = new KeyBoard();
		//ʹ�ü���
		nb.useUsb(k);
		//�ʼǱ��ر�
		nb.shotdown();
	}

}
