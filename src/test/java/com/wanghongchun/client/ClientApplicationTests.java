package com.wanghongchun.client;

import com.wanghongchun.client.client.ConnectManage;
import com.wanghongchun.client.client.RpcClient;
import com.wanghongchun.client.client.RpcClientHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CopyOnWriteArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientApplicationTests {
	@Autowired
	ConnectManage connectManage;
	@Test
	public void contextLoads() {
		HelloService helloService = RpcClient.create(HelloService.class);
		System.out.println(helloService.hello("111"));
	}
}

