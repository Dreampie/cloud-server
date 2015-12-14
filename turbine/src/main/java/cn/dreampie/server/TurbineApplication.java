package cn.dreampie.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.amqp.EnableTurbineAmqp;


@EnableTurbineAmqp
@SpringBootApplication
public class TurbineApplication {

  public static void main(String[] args) {
    SpringApplication.run(TurbineApplication.class, args);
  }
}
