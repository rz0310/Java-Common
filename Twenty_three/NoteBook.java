package com.Ocacle.Demo3;

class NoteBook {
	//�ʼǱ����й���
	public void run()
	{
		System.out.println("�ʼǱ�����");
	}
	//�ʼǱ�ʹ��Usb�ӿ�
	/* �ʼǱ�ʹ��USB�豸,�ʼǱ��Ķ������������ܡ�
	 * ���������һ������USB�����USB�豸*/
	public void useUsb(Usb usb){
		if(usb != null)
		{
			usb.open();
			usb.close();
		}
	}
	public void shotdown()
	{
		System.out.println("�ʼǱ��ر�");
	}
}
