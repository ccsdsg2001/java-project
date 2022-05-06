package test.test1; 

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* InnerClassTest Tester. 
* 
* @author <Authors name> 
* @since <pre>05/06/2022</pre> 
* @version 1.0 
*/ 
public class InnerClassTestTest extends TestCase { 
public InnerClassTestTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
super.setUp(); 
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 



public static Test suite() { 
return new TestSuite(InnerClassTestTest.class); 
} 
} 
