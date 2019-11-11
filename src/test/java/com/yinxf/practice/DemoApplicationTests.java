package com.yinxf.practice;

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.yinxf.practice.mapper")
public class DemoApplicationTests {

//    @Autowired
//    private UserInfoService userInfoService;
//
//    private CountDownLatch latch = new CountDownLatch(5000);
//
//    @DataTest
//    public void testUserInfo(){
//        for (int i = 0 ; i < 5000 ; i++){
//            new Thread(() -> {
//                try {
//                    latch.await();
//                }catch (Exception e){e.printStackTrace();}
//
//            }).start();
//        }
//        System.out.println("==============请求等待中；；；；");
//        latch.countDown();
//
//        System.out.println("===================开始发送请求！！！！");
//        UserInfo userInfo = userInfoService.selectByName("abc","");
//        System.out.println("==================="+JSON.toJSONString(userInfo));
//    }

//    @DataTest
//    public void testAOP(){
//        UserInfo userInfo = userInfoService.selectByName("abc","");
//        System.out.println(JSON.toJSONString(userInfo));
//    }

}

