package com.yinxf.demo;


import com.yinxf.demo.model.NsTemp;
import com.yinxf.demo.service.NsTempService;
import com.yinxf.demo.utils.SecurityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.yinxf.demo.mapper")
public class ExpotTests {
    @Autowired
    private NsTempService nsTempService;


    @Test
    public void testUserInfo() {

//        OutputStream os = null;
//        try {
//            File file = new File("D:/宜人贷.txt");
//            os = new FileOutputStream(file);
//
//            System.out.println("开始导出文件。。。。");
//            List<NsTemp> temps = null;
//            int page = 1;
//            int count = 10000;
//            int num = 0;
//            while (true){
//                int pageNum = (page - 1) * count;
//                temps = nsTempService.selectTempList(pageNum,count);
//                if (temps == null || temps.size() == 0){
//                    break;
//                }
//                StringBuilder sb = new StringBuilder();
//                for (NsTemp temp:temps) {
//                    sb.append(temp.getUserId()).append(",");
////                    sb.append(SecurityUtils.decrypt(temp.getCertificateId())).append(",");
//                    sb.append(temp.getModifyTime()).append("\r\n");
//                }
//                os.write(sb.toString().getBytes());
//                os.flush();
//                page++;
//                num += temps.size();
//                System.out.println("已导出数据："+num);
//            }
//            System.out.println("导出完成！！！！");
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if (os != null){
//                try {
//                    os.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

    }


}

