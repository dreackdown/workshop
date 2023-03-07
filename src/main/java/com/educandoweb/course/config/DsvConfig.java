package com.educandoweb.course.config;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("prod")
public class DsvConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Barry", "venenatis@icloud.org", "6115416", "CIL64MNN1BZ");
        User u4 = new User(null, "Guy", "mauris.nulla.integer@aol.ca", "8746562", "XBX27SVQ8EV");
        User u5 = new User(null, "Keane", "vel.sapien@aol.ca", "4204787", "ZGG63WSQ9TO");
        User u6 = new User(null, "Willow", "arcu.aliquam@aol.edu", "2945714", "TRK85UHH5TF");
        User u7 = new User(null, "Bethany", "tristique.aliquet@hotmail.org", "1747237", "WBH71JUH7IG");
        User u8 = new User(null, "Molly", "pellentesque.eget@protonmail.org", "1846359486", "UZR73GRQ8KB");
        User u9 = new User(null, "Preston", "vel.convallis@icloud.ca", "6726253", "AQC73SGV0YF");
        User u10 = new User(null, "Jakeem", "sem@yahoo.edu", "6177336", "RDQ15TLI2RN");
        User u11 = new User(null, "Sylvia", "proin@icloud.edu", "8141417", "LPH32IJQ3ML");
        User u12 = new User(null, "Randall", "euismod.est.arcu@google.com", "6096116", "EWX27BNU2NV");
        User u13 = new User(null, "Cameron", "sem@google.com", "4561373", "THO47PYG6CR");
        User u14 = new User(null, "Herrod", "dapibus.id.blandit@aol.edu", "1415792", "RTQ71OVF6XV");
        User u15 = new User(null, "Vincent", "feugiat.tellus.lorem@outlook.couk", "5923642", "OVO12TNX4VS");
        User u16 = new User(null, "Laith", "donec.non@google.edu", "2599702", "UPK54XLD8KS");
        User u17 = new User(null, "Quamar", "ullamcorper@outlook.org", "14346152354", "FKX27KWH8IK");

        Order o1 = new Order(null, Instant.parse("2023-01-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2023-01-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2023-02-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
