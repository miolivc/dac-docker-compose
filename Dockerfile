FROM oracle/glassfish:nightly
ENV LIB /glassfish5/glassfish/domains/domain1/lib/
ADD /target/app/WEB-INF/lib/ ${LIB}
ENV AUTODEPLOY /glassfish5/glassfish/domains/domain1/autodeploy
ENV WAR app.war
COPY target/$WAR $AUTODEPLOY