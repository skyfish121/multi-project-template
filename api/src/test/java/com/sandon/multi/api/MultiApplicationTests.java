package com.sandon.multi.api;
import com.sandon.db.base.dao.ReserveMngDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiApplicationTests {

	private final ReserveMngDao reserveMngDao;

	@Autowired
	MultiApplicationTests(ReserveMngDao reserveMngDao) {
		this.reserveMngDao = reserveMngDao;
	}

	@Test
	void contextLoads() {
	}

}
