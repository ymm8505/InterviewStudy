package com.xiaoyang.jvm;

import java.util.ArrayList;

public class TestOutOfMemoryHeap {
 /*
    Exception in thread "main" java.lang.StackOverflowError
	at com.xiaoyang.jvm.TestOutMemoryHeap.test(TestOutMemoryHeap.java:10)
	ʵ��˼·����JVM�Ķ����� дһ����ѭ������������һֱ�����������ѵĴ�С
  */
	
	static class OOMObject{
		
    }
	public void testHeap(){  
		ArrayList<OOMObject> list = new ArrayList<OOMObject> ();  
        for(;;){  
              list.add(new OOMObject());
          }  
    }

	public static void main(String[] args) {
		
		/*
		//java����� ��ʽ 1 һֱ��list�����һ��Int�͵�����
		List list1=new ArrayList();
        for(;;){
            int[] tmp=new int[100];
            System.out.println(tmp.hashCode());
            list1.add(tmp);
        }
        */
        
		/*
		 //	java����� ��ʽ2��
			Vector v=new Vector();
			for(int i=0;i<2500;i++){
				v.add(new byte[1*1024*1024]);
			}
		*/
		
		 //java����� ��ʽ3  ����һ��List һֱ�����һ����̬�����
		new TestOutOfMemoryHeap().testHeap();
	}
}
