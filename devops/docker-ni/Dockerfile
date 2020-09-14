FROM oracle/graalvm-ce:20.2.0-java11

WORKDIR /work
VOLUME /work

RUN gu install native-image

RUN curl https://bintray.com/sbt/rpm/rpm | tee /etc/yum.repos.d/bintray-sbt-rpm.repo && \
    yum install -y sbt && \
    sbt about

RUN curl http://repository.it4i.cz/mirrors/repoforge/redhat/el7/en/x86_64/rpmforge/RPMS/rpmforge-release-0.5.3-1.el7.rf.x86_64.rpm > rpmforge.rpm && \
    rpm -Uvh rpmforge.rpm && \
    yum install -y upx && \
    rm rpmforge.rpm

RUN mkdir -p /root/.sbt/secrets
VOLUME /root/.sbt/secrets