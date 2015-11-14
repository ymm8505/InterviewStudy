package com.xiaoyang.jvm;

import java.util.ArrayList;

public class TestOutOfMemoryHeap {
 /*
    Exception in thread "main" java.lang.StackOverflowError
	at com.xiaoyang.jvm.TestOutMemoryHeap.test(TestOutMemoryHeap.java:10)
	实现思路是往JVM的堆里面 写一个死循环来分配大对象，一直到对象填满堆的大小
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
		//java堆溢出 方式 1 一直往list里面放一个Int型的数组
		List list1=new ArrayList();
        for(;;){
            int[] tmp=new int[100];
            System.out.println(tmp.hashCode());
            list1.add(tmp);
        }
        */
        
		/*
		 //	java堆溢出 方式2、
			Vector v=new Vector();
			for(int i=0;i<2500;i++){
				v.add(new byte[1*1024*1024]);
			}
		*/
		
		 //java堆溢出 方式3  创建一个List 一直往里放一个静态类对象
		new TestOutOfMemoryHeap().testHeap();
	}
}
