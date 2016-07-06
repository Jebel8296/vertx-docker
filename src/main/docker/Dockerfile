FROM vertx/vertx3

ENV VERTICLE_NAME io.vertx.docker.HelloWorldVerticle
ENV VERTICLE_FILE vertx-docker.jar

ENV VERTICLE_HOME /usr/verticles

EXPOSE 8080

COPY $VERTICLE_FILE $VERTICLE_HOME/

WORKDIR $VERTICLE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["vertx run $VERTICLE_NAME -cp $VERTICLE_HOME/*"]