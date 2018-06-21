package com.mattdamon.user;

import java.util.concurrent.CountDownLatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mattdamon.user.service.UserService;

public class Bootstrap {

	public static void main(String[] args) throws Exception {
		final ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
				"/spring/user-dubbo-provider.xml");
		ac.start();
		System.out.println("user service started successfully");

		UserService userServiceImpl = (UserService) ac
				.getBean("userServiceImpl");
		System.out.println(userServiceImpl);
		userServiceImpl.getName();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out
						.println("Shutdown hook was invoked. Shutting down User Service.");
				ac.close();
			}
		});
		// prevent main thread from exit
		CountDownLatch countDownLatch = new CountDownLatch(1);
		countDownLatch.await();
	}
}
