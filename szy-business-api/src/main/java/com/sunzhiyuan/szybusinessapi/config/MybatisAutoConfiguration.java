package com.sunzhiyuan.szybusinessapi.config;

/**
 * Created by sunzhiyuan on 2019/7/9.
 */
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * mybatis及数据源配置信息
 * <br />
 * 需要配置一下属性:
 * <br />
 * spring.mybatis.configLocation=classpath:config/mybatisConfig.xml
 * <br />
 * spring.mybatis.mapperLocations=classpath:config/mappers/**&nbsp;/*.xml
 *
 */
@ConditionalOnProperty(prefix = "mybatis", name = "auto", havingValue = "true", matchIfMissing = true)
@Configuration
public class MybatisAutoConfiguration {

    public static final String PREIFX = "spring.mybatis";
    private static final Logger logger = LogManager.getLogger(MybatisAutoConfiguration.class);

    @Autowired private ApplicationContext context;

    @Bean
    @ConfigurationProperties(prefix = PREIFX)
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource)
        throws IOException {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        try {
            fb.setConfigLocation(context.getResource("classpath:config/mybatisConfig.xml"));
            fb.setMapperLocations(context.getResources("classpath:**/mappers/**/*.xml"));
        } catch (Exception e) {}
        fb.setDataSource(dataSource);
        return fb;
    }

    @Primary
    @Bean public SqlSessionTemplate sqlSession(SqlSessionFactory ssf) {
        SqlSessionTemplate sqlSession = new SqlSessionTemplate(ssf);
        return sqlSession;
    }

    @Bean(name = "sqlSessionBatch")
    public SqlSessionTemplate sqlSessionBatch(SqlSessionFactory ssf) {
        SqlSessionTemplate sqlSession = new SqlSessionTemplate(ssf, ExecutorType.BATCH);
        return sqlSession;
    }
}
