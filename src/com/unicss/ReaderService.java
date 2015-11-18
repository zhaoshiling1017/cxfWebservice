package com.unicss;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="com.unicss.IReaderService",serviceName="readerService")  
public class ReaderService implements IReaderService{  
	@WebMethod
    public Reader getReader(@WebParam(name="name") String name,@WebParam(name="password") String password) {  
        return new Reader(name,password);  
    }  
    @WebMethod
    public List<Reader> getReaders(){  
        List<Reader> readerList = new ArrayList<Reader>();  
        readerList.add(new Reader("shun1","123"));  
        readerList.add(new Reader("shun2","123"));  
        return readerList;  
    }  
}  
