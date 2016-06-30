# orderapp-client

cd ~/YourProjectsDirectory
git clone https://github.com/douglas-man/orderapp.git

mvn generate-sources
mvn compile
mvn exec:java -Dexec.mainClass="com.demo.App"


dman@23474Q7:~/Documents/orderapp-client$ mvn exec:java -Dexec.mainClass="com.demo.App" -Dcom.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=false
[INFO] Scanning for projects...
[WARNING]
[WARNING] Some problems were encountered while building the effective model for com.demo:orderapp-client:jar:1.0-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.codehaus.mojo:build-helper-maven-plugin is missing. @ line 133, column 17
[WARNING]
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING]
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building orderapp-client 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.4.0:java (default-cli) @ orderapp-client ---
[06-30-2016 08:46:58,908][com.demo.App.main()][INFO ]mlApplicationContext: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@3c0cf828: startup date [Thu Jun 30 08:46:58 EDT 2016]; root of context hierarchy
[06-30-2016 08:46:58,964][com.demo.App.main()][INFO ]BeanDefinitionReader: Loading XML bean definitions from class path resource [cxf.xml]
[06-30-2016 08:46:59,148][com.demo.App.main()][INFO ]BeanDefinitionReader: Loading XML bean definitions from class path resource [META-INF/cxf/cxf.xml]
[06-30-2016 08:46:59,184][com.demo.App.main()][INFO ]BeanDefinitionReader: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-servlet.xml]
[06-30-2016 08:46:59,465][com.demo.App.main()][INFO ]tListableBeanFactory: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@4af149dd: defining beans [cxf,org.apache.cxf.bus.spring.BusWiringBeanFactoryPostProcessor,org.apache.cxf.bus.spring.Jsr250BeanPostProcessor,org.apache.cxf.bus.spring.BusExtensionPostProcessor,abstractLogInterceptor,logInInterceptor,logOutInterceptor,cxf.config0,orderClient.proxyFactory,orderClient]; root of factory hierarchy
[06-30-2016 08:46:59,676][com.demo.App.main()][INFO ]onServiceFactoryBean: Creating Service {http://order.demo/}OrderProcessService from class demo.order.OrderProcess
[06-30-2016 08:47:00,145][com.demo.App.main()][DEBUG]com.demo.App        : port: org.apache.cxf.jaxws.JaxWsClientProxy@15bbab6b
[06-30-2016 08:47:00,329][com.demo.App.main()][INFO ]essPort.OrderProcess: Outbound Message
---------------------------
ID: 1
Address: http://localhost:9000/OrderProcess
Encoding: UTF-8
Http-Method: POST
Content-Type: text/xml
Headers: {Accept=[*/*], SOAPAction=[""]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <ns2:processOrder xmlns:ns2="http://order.demo/">
      <arg0>
        <customerID>C001</customerID>
        <itemID>I001</itemID>
        <price>100.0</price>
        <qty>20</qty>
      </arg0>
    </ns2:processOrder>
  </soap:Body>
</soap:Envelope>

--------------------------------------
[06-30-2016 08:47:00,349][com.demo.App.main()][INFO ]essPort.OrderProcess: Inbound Message
----------------------------
ID: 1
Response-Code: 200
Encoding: UTF-8
Content-Type: text/xml; charset=UTF-8
Headers: {Content-Length=[217], content-type=[text/xml; charset=UTF-8], Date=[Thu, 30 Jun 2016 12:47:00 GMT], Server=[Jetty(9.2.17.v20160517)]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <ns2:processOrderResponse xmlns:ns2="http://order.demo/">
      <return>ORD1234</return>
    </ns2:processOrderResponse>
  </soap:Body>
</soap:Envelope>

--------------------------------------
[06-30-2016 08:47:00,390][com.demo.App.main()][DEBUG]com.demo.App        : processOrder result: ORD1234
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.656 s
[INFO] Finished at: 2016-06-30T08:47:00-04:00
[INFO] Final Memory: 15M/264M
[INFO] ------------------------------------------------------------------------
dman@23474Q7:~/Documents/orderapp-client$

dman@23474Q7:~/Documents/orderapp-client$ mvn exec:java -Dexec.mainClass="com.demo.App" -Dcom.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true
[INFO] Scanning for projects...
[WARNING]
[WARNING] Some problems were encountered while building the effective model for com.demo:orderapp-client:jar:1.0-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.codehaus.mojo:build-helper-maven-plugin is missing. @ line 133, column 17
[WARNING]
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING]
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building orderapp-client 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.4.0:java (default-cli) @ orderapp-client ---
[06-30-2016 09:01:18,836][com.demo.App.main()][INFO ]mlApplicationContext: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@3c0cf828: startup date [Thu Jun 30 09:01:18 EDT 2016]; root of context hierarchy
[06-30-2016 09:01:18,889][com.demo.App.main()][INFO ]BeanDefinitionReader: Loading XML bean definitions from class path resource [cxf.xml]
[06-30-2016 09:01:19,041][com.demo.App.main()][INFO ]BeanDefinitionReader: Loading XML bean definitions from class path resource [META-INF/cxf/cxf.xml]
[06-30-2016 09:01:19,074][com.demo.App.main()][INFO ]BeanDefinitionReader: Loading XML bean definitions from class path resource [META-INF/cxf/cxf-servlet.xml]
[06-30-2016 09:01:19,356][com.demo.App.main()][INFO ]tListableBeanFactory: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@4983642a: defining beans [cxf,org.apache.cxf.bus.spring.BusWiringBeanFactoryPostProcessor,org.apache.cxf.bus.spring.Jsr250BeanPostProcessor,org.apache.cxf.bus.spring.BusExtensionPostProcessor,orderClient.proxyFactory,orderClient]; root of factory hierarchy
[06-30-2016 09:01:19,561][com.demo.App.main()][INFO ]onServiceFactoryBean: Creating Service {http://order.demo/}OrderProcessService from class demo.order.OrderProcess
[06-30-2016 09:01:20,108][com.demo.App.main()][DEBUG]com.demo.App        : port: org.apache.cxf.jaxws.JaxWsClientProxy@4ea62d29
[06-30-2016 09:01:20,301][com.demo.App.main()][INFO ]essPort.OrderProcess: Outbound Message
---------------------------
ID: 1
Address: http://localhost:9000/OrderProcess
Encoding: UTF-8
Http-Method: POST
Content-Type: text/xml
Headers: {Accept=[*/*], SOAPAction=[""]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><ns2:processOrder xmlns:ns2="http://order.demo/"><arg0><customerID>C001</customerID><itemID>I001</itemID><price>100.0</price><qty>20</qty></arg0></ns2:processOrder></soap:Body></soap:Envelope>
--------------------------------------
[06-30-2016 09:01:20,331][com.demo.App.main()][INFO ]essPort.OrderProcess: Inbound Message
----------------------------
ID: 1
Response-Code: 200
Encoding: UTF-8
Content-Type: text/xml; charset=UTF-8
Headers: {Content-Length=[217], content-type=[text/xml; charset=UTF-8], Date=[Thu, 30 Jun 2016 13:01:20 GMT], Server=[Jetty(9.2.17.v20160517)]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><ns2:processOrderResponse xmlns:ns2="http://order.demo/"><return>ORD1234</return></ns2:processOrderResponse></soap:Body></soap:Envelope>
--------------------------------------
[06-30-2016 09:01:20,432][com.demo.App.main()][DEBUG]com.demo.App        : processOrder result: ORD1234
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.736 s
[INFO] Finished at: 2016-06-30T09:01:20-04:00
[INFO] Final Memory: 14M/264M
[INFO] ------------------------------------------------------------------------
dman@23474Q7:~/Documents/orderapp-client$


echo "# orderapp-client" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/douglas-man/orderapp-client.git
git push -u origin master