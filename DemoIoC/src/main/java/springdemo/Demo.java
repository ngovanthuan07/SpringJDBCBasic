package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        DataSource dataSource = (DataSource) context.getBean("dataSource");


        //JdbcTemplate t = new JdbcTemplate(dataSource);
        JdbcTemplate t = (JdbcTemplate) context.getBean("jdbcTemplate");
        //t.update("UPDATE category SET description=? WHERE id=?", "Tablet", 2);
        List<String> kq = t.query("SELECT * FROM category WHERE name like concat('%', ? ,'%')",
                    (resultSet, i) -> {
                return resultSet.getString("name");
        },"tính");
        kq.forEach(value -> System.out.println(value));
    }
}
