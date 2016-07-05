package io.vertx.docker;

import io.vertx.core.AbstractVerticle;

public class HelloWorldVerticle extends AbstractVerticle {

	@Override
	public void start() throws Exception {
		vertx.createHttpServer().requestHandler(request -> {
			request.response().end("Hello world for Docker!");
		}).listen(8080);
	}

}
