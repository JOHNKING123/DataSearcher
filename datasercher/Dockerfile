FROM         centos:latest
MAINTAINER    zheng.cq

#把java添加到容器中
ADD /opt/jdk-8u171-linux-x64.tar.gz /opt/
ADD ./target/datasercher-0.0.1-SNAPSHOT.jar /opt/


#配置java与tomcat环境变量
ENV JAVA_HOME /opt/jdk1.8.0_171

ENV PATH $PATH:$JAVA_HOME/bin:

#容器运行时监听的端口
EXPOSE  8881

ENTRYPOINT java -jar /opt/datasercher-0.0.1-SNAPSHOT.jar >> /opt/run.log