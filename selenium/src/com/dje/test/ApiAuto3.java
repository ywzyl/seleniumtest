package com.dje.test;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ApiAuto3 {
	public static void main(String[] args) {
		// ����Ӧ����
		CloseableHttpClient httpClient=HttpClients.createDefault();
	 
	        // HTTP����
			HttpGet request=new HttpGet("https://www.baidu.com");
	 
	        // ��ӡ������Ϣ
	        System.out.println(request.getRequestLine());
	        try {
	        	// �������󣬷�����Ӧ
	            HttpResponse response = httpClient.execute(request);	 
	            // ��ӡ��Ӧ��Ϣ
	            System.out.println(response.getStatusLine());
	        } catch (ClientProtocolException e) {
	            // Э�����
	            e.printStackTrace();
	        } catch (IOException e) {
	            // �����쳣
	            e.printStackTrace();
	        }
	}
}
