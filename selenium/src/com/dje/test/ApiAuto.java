package com.dje.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * GET����   Я������ͷ
 * @author zhangj
 *
 */
public class ApiAuto {
	public static void main(String[] args) throws IOException {
		String entityStr = null;
		List<InterfaceEntity> interfacelist=new ArrayList<InterfaceEntity>();
		Map<String, Object> params=new HashMap<String, Object>();				
		params.put("bussAppName", "OA");
		InterfaceEntity getEmpList=new InterfaceEntity(GlobalVariable.HOST+"/yunxiazi-rest/dje/getEmpList", params);
		interfacelist.add(getEmpList);
		for(InterfaceEntity interfaceEntity : interfacelist){
			String requestUrl =interfaceEntity.getHttpGetUrl();		
            System.out.println("�ӿڵ�ַ:"+requestUrl);
            CloseableHttpClient httpClient=HttpClients.createDefault();
            HttpGet httpget=new HttpGet(requestUrl);
            System.out.println(httpget.getRequestLine());
            httpget.addHeader("CryptKey", "sCAIcaRA_XPBL7eVSEU4okAsv_czNk40SIc-8B8rBo1LNmTJvpGrSLtrTweHQUJ4");
            //addHeader�����ͬ��header�Ѵ��ڣ���׷����ԭͬ��header����;setHeader�����ͬ��header�Ѵ��ڣ��򸲸�һ��ͬ��header
            //httpget.setHeader("CryptKey", "sCAIcaRA_XPBL7eVSEU4okAsv_czNk40SIc-8B8rBo1LNmTJvpGrSLtrTweHQUJ4");   
            httpget.setHeader("Content-Type", "application/x-www-form-urlencoded");
            HttpResponse response = httpClient.execute(httpget);
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            entityStr = EntityUtils.toString(entity, "UTF-8");
            System.out.println(entityStr);                        
        }
	}
}
