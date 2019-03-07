package com.dje.test;

import java.util.Map;
import java.util.Map.Entry;

public class InterfaceEntity {
	private String url;
	private Map<String, Object> params;
	private Object result;
	public InterfaceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterfaceEntity(String url, Map<String, Object> params) {
		super();
		this.url = url;
		this.params = params;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getHttpGetUrl(){
        String httpGetUrl = this.url;
        if(params != null){
            httpGetUrl += "?";
            for(Entry<String, Object> param : params.entrySet()){
                httpGetUrl += param.getKey() + "=" + param.getValue()+"&";
            }
            httpGetUrl = httpGetUrl.substring(0, httpGetUrl.length()-1);
        }
        return httpGetUrl;
    }

}
