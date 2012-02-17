/**
 * 
 */
package pl.pkarpik.service.impl;

import javax.jws.WebService;

import pl.pkarpik.service.HelloService;
import pl.pkarpik.service.Person;

/**
 * @author pkarpik
 *
 */
@WebService(
        serviceName = "HelloService",  // wsdl:service name
        targetNamespace = "http://service.pkarpik.pl",
        endpointInterface = "pl.pkarpik.service.HelloService")
public class HelloServiceImpl implements HelloService{

	public String sayHello(Person person) {
		if(Long.valueOf(18l).compareTo(person.getAge())>0){
			return "Sorry, you are too young!";
		}
		return "Hello "+person.getName()+" ("+person.getAge()+")";
	}

}
