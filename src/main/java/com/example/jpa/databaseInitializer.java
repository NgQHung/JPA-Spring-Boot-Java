import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class databaseInitializer {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Bean
    CommandLineRunner initDatabase(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception{
                jdbcTemplate.execute("Create table Employees(id int primary key auto_increment," +
                        " name varchar(30), email varchar(30))");
                jdbcTemplate.execute("INSERT INTO Employees(name,email) VALUES ('Hung Nguyen Quang','hung@hung.hung')");
                jdbcTemplate.execute("INSERT INTO Employees(name,email) VALUES ('Minh Anh','ma@ma.ma')");
            }
        };
    }
}
