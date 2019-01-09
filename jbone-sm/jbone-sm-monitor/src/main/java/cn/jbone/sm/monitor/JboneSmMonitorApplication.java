package cn.jbone.sm.monitor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableTurbineStream
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@SpringBootApplication
@EnableFeignClients
public class JboneSmMonitorApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(JboneSmMonitorApplication.class).banner(new JboneSmMonitorBanner()).logStartupInfo(true).run(args);
    }
}
