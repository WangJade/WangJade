package com.jade.newbee.http.factory;

import org.apache.http.client.HttpClient;

/** 
 * 生成HttpClient实例的工厂接口
 * 
 * @author jade
 */
public interface HttpClientFactory {

	/**
	 * 获取{@code HttpClient}实例，用于执行http请求。
	 * 
	 * @return {@code HttpClient}实例
	 */
	public HttpClient get();
	
	/**
	 * 获取当前工厂生成的{@code HttpClient}实例所使用的Http内容编码
	 * 
	 * @return http内容编码
	 */
	public String getCharset();
}
