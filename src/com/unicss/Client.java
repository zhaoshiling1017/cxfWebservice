package com.unicss;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
	public static void main(String[] args) {  
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();  
        factoryBean.setServiceClass(IReaderService.class);  
        factoryBean.setAddress("http://localhost:8080/readerService");  
          
        IReaderService readerService = (IReaderService)factoryBean.create();  
        Reader reader = readerService.getReader("shun","123");  
        System.out.println("Reader:"+reader);  
    }  
}
