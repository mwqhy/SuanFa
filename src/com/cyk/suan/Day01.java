package com.cyk.suan;

import java.util.Arrays;

public class Day01 {
	
	public static void main(String[] args) {
		//��֪������õ�����
		int a[] = {0,0,0,1,1,2,2,3,4,5};
		System.out.println("ԭ���������ǣ�"+Arrays.toString(a));
	
		int n = remove(a);
//		int m = 1;
//		for (int i=0;i<a.length;i++) {
//			for(int j = i+1;j<a.length;j++){
//				if (a[i]!=a[j]) {
//					m++;
//					for(int n = i+1;n<j;n++){
//						a[n]=a[j];
//					}
//					break;
//				}
//			}
//		}
		System.out.println("�ı������鳤�ȣ�"+n);
	}
	
	/**
	 * ͨ��һ�����������ָ��������
	 * @param nums
	 * @return
	 */
	public static int  remove(int []nums) {
		if (nums == null||nums.length==0) {
			return 0;
		}
		int p = 0;
		
		for (int q = 1; q < nums.length; q++) {
			if (nums[p] != nums[q]) {
				p++;
				nums[p]= nums[q];
			}
		} 
		return p;
	}

}
