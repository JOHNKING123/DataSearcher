FROM         docker.io/fabric8/java-centos-openjdk8-jdk:latest
MAINTAINER    zheng.cq

ADD ./target/datasercher-0.0.1-SNAPSHOT.jar /opt/

touch /opt/run.log

chmod 755 /opt/run.log


#容器运行时监听的端口
EXPOSE  8881

ENTRYPOINT java -jar /opt/datasercher-0.0.1-SNAPSHOT.jar >> /opt/run.log
