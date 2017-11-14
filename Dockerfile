FROM oracle/glassfish:5.0-web
ENV AUTODEPLOY /glassfish5/glassfish/domains/domain1/autodeploy
ENV WAR app.war
COPY target/$WAR $AUTODEPLOY