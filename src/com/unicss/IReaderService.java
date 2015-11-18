package com.unicss;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService  
public interface IReaderService {  
	@WebMethod
    public Reader getReader(@WebParam(name="name") String name,@WebParam(name="password") String password);  
    @WebMethod
	public List<Reader> getReaders();  
}  