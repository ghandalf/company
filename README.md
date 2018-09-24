# README #

The aim of the project is to response technical exercise questions.


### What was the question? ###
1. Write a class that determines the free space on a file system. The class should be unit testable and have idempotent behavior when run on a
build server.
    This one is done @see FreeSpace class 

TODO the following questions

2. What does the following XML fragment do.
	First, I doubt that it works, the fatory-method must be static, in this case factory-method use new, a reserved word.  I am surprise here with this usage of new, Spring have a mechanism that call specifically the constructor.
	new : Used to create an instance of a class or array/an object.
	
	Anyway assuming the new is replace by a static getInstance() method (or maybe new could work!):
	1. id: name of the bean that could be use
	2. class: the bean class 
		-- Will return an instance of Person identify by myTestBean, 
	3. scope: prototype a single bean definition for all instances
	4. factory-method: Use a static method that will return an instance of the class
		example :
		public class Person {
			public static Person getInstance() {
				return new Person();
			}
		}
	5. depends-on: make sure that dataSource is first initialize before myTestBean
	               on destroy process, it force the destruction of myTestBean before dataSource bean
	6. ${first.name}: Using the PropertyPlaceholderHelper class to replace ${first.name} by is value, must be define in the context.xml file. It needs reference in classpath of the properties file that content the keys/values
	7. property phone ref: Inject the Phone bean in phone property of the class Person
	



3. Fib
	A non recursive function is faster than a recursive function
	A recursive function need to compute the result before calling itself
	Please look in the project test-triton
		Under src/main/java
			com.triton.test.fib.IFibCalculator	-- Interface
			com.triton.test.fib.FibCalculator	-- Implementation
		Under src/test/java
			com.triton.test.fib.FibCalculatorTest  -- simple test
	
	
4. Write three threads safe ways of incrementing an integer
	Please look in the project test-triton
	Atomic
		Under src/main/java
			com.triton.test.thread.IThreadSafeAtomic	-- Interface
			com.triton.test.thread.ThreadSafeAtomic	-- Implementation
		Under src/test/java
			com.triton.test.thread.ThreadSafeAtomicTest -- simple test	

	Synchronized
		Under src/main/java
			com.triton.test.thread.IThreadSafeSynchronized	-- Interface
			com.triton.test.thread.ThreadSafeSynchronized	-- Implementation
		Under src/test/java
			com.triton.test.thread.ThreadSafeSynchronizedTest  -- simple test	

	Volatile
		Under src/main/java
			com.triton.test.thread.IThreadSafeVolatile	-- Interface
			com.triton.test.thread.ThreadSafeVolatile	-- Implementation
		Under src/test/java
			com.triton.test.thread.ThreadSafeVolatileTest  -- simple test	
			

			
5. StwAndo
	Look in the project test-triton
		Under src/main/java
			com.triton.test.stwando.IStwAndo	-- Interface
			com.triton.test.stwando.StwAndo		-- Implementation
		Under src/test/java
			com.triton.test.stwando.StwAndoTest  -- give the output

6. Algorithm
	Given a number between 0 and 999 999, write a method that writes that number in the English language.

	Look in the project test-triton
		Under src/main/java
			com.triton.test.algorithm.IHumanReadingConverter	-- Interface
			com.triton.test.algorithm.HumanReadingConverter	-- Implementation
		Under src/test/java
			com.triton.test.algorithm.HumanReadingConverterTest  -- give the output
	
7. Suppose you are using a Map. How would you go about detecting the amount of times put() and get() are called on it.

First create a synchronized method, that could notify() the class who will get the amount of time put() or get() are called.
I will use norify() and wait() methods, there are members of java.lang.Object class, every classes have access to those methods.
	

8. Can you supply a sample of your code (or a link towards) which you would consider production ready and high quality.

Engine report, in production since two years.

I give you fragment of an application that run since two years, it is connected to a non-normalized database.   The main concern in this project is that the data is mixed with the view in the schema.
	The project is split in many parts: All code is unit tested.
	Bundles
		bundle-report-war
			Content the web part of the application
			
	Business
		business-java-api
			The interfaces access from the controller in the web part or web-services
		business-java-jar
			The implementation on the api


### Who do I talk to? ###
* Community: Those who wants to learn.

### Todo ###
* Improve explanations
