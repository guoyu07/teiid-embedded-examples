| **Datasource** | **Level** | **Technologies** | **Prerequisites** | **Description** |
|:---------|:----------|:-----------------|:------------------|:----------------|
|HDFS |hadoop-as-a-datasource |Teiid, Dynamic VDB, Foreign Table, HDFS Translator |None |Demonstrates using HDFS Translator query with JDBC |

## What's this

This example demonstrates using HDFS Translator query with JDBC. Dynamic VDB [excel-vdb.xml](src/main/resources/excel-vdb.xml) be used to define view and Foreign Table within DDL metadata.

## Prerequisites

None

## Dependencies

To add Teiid runtime, admin

~~~
<dependency>
    <groupId>org.jboss.teiid</groupId>
    <artifactId>teiid-runtime</artifactId>
    <version>${version.teiid}</version>
</dependency>
<dependency>
    <groupId>org.jboss.teiid</groupId>
    <artifactId>teiid-admin</artifactId>
    <version>${version.teiid}</version>
</dependency>
~~~

To add Translators and Resource Adapters

~~~
<dependency>
    <groupId>org.jboss.teiid.connectors</groupId>
    <artifactId>translator-hdfs</artifactId>
    <version>${version.teiid}</version>
</dependency>		
<dependency>
    <groupId>org.jboss.teiid.connectors</groupId>
    <artifactId>connector-hdfs</artifactId>
    <version>${version.teiid}</version>
</dependency>
~~~

## Run

* Run from Source code

Import source code to a IDE(Eclipse), run TeiidEmbeddedExcelDataSource as Java Application.

* Run from mvn

~~~
$ cd teiid-embedded-examples/hadoop-as-a-datasource
$ mvn clean install
$ mvn exec:java
~~~
