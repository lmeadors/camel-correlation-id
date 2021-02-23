# Camel Router Project for Spring-DM (OSGi)

To build this project use

    mvn install

You can run this project using the following Maven goal:

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You will run the following command from its shell:

    osgi:install -s mvn:com.github.lmeadors/camel-correlation-id/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/

Need a debugger? I did - run this class in your IDE:

    org.apache.camel.spring.Main
