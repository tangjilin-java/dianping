package ab.tjl.dianping.config;

import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpPost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:TangJiLin
 * @Description:接入es搜索
 * @Date: Created in 2020/2/10 11:05
 * @Modified By:
 */
@Configuration
public class ElasticsearchRestClient {

    @Value("${elasticsearch.ip}")
    String ipAddress;

    @Bean(name="highLevelClient")
    public RestHighLevelClient highLevelClient(){
        String[] address = ipAddress.split(":");
        String ip = address[0];
        int port = Integer.valueOf(address[1]);
        HttpHost httpHost = new HttpHost(ip,port,"http");
        return new RestHighLevelClient(RestClient.builder(new HttpHost[]{httpHost}));

    }
}
