package com.yinxf.practice.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author yinxf
 * @Date 2019/5/29
 * @Description 转账流水sql处理
 **/
public class SqlUtils {

    public static void main(String[] args) {

        try {
            System.out.println("开始生成sql！！！！");
            /**
             * NS_BILL_BIZ_TRANSFER_HIST
             * NS_PHENIX_BILL_BIZ_TRANS_HIST
             */
            String sql = "SELECT t.ORDER_ID,t.TXN_ID,t.NS_STTL_DT,dec_3des_hex(t.DBTR_NM) DBTR_NM,t.DBTR_ACCT_ID," +
                    "dec_3des_hex(t.CDTR_NM) CDTR_NM, t.CDTR_ACCT_ID,t.STTL_AMT from nstransfer.NS_BILL_BIZ_TRANSFER_HIST t WHERE t.ORDER_ID IN(";

//            String sql = "SELECT t.ORDER_ID,t.TXN_ID,t.NS_STTL_DT,dec_3des_hex(t.DBTR_NM) DBTR_NM,t.DBTR_ACCT_ID," +
//                    "dec_3des_hex(t.CDTR_NM) CDTR_NM, t.CDTR_ACCT_ID,t.STTL_AMT from NS_BILL_BIZ_TRANSFER t WHERE t.ORDER_ID IN(";


            InputStream inputStream = new FileInputStream("D:/2019.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            List<String> sqls = new ArrayList();
            int count = 1;
            while (true){
                String line = reader.readLine();
                if (line == null){
                    sqls.add(sql + builder.substring(0,builder.length()-1) +");");
                    break;
                }

                builder.append("'").append(line).append("',");
                if (count % 1000 == 0){
                    sqls.add(sql + builder.substring(0,builder.length()-1) +");");
                    builder = new StringBuilder();
                }
                count++;
            }
            System.out.println("数据总条数："+(count-1));
            FileOutputStream outputStream = new FileOutputStream("D:/sql.txt");
            for (String string : sqls) {
                outputStream.write(string.getBytes());
                outputStream.write("\n\r".getBytes());
                outputStream.flush();
            }

            inputStream.close();
            outputStream.close();
            System.out.println("生成sql结束！！！！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
