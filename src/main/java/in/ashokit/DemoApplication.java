package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(DemoApplication.class, args);
		BookRepository repo = ctxt.getBean(BookRepository.class);

		Book b = new Book();
		b.setBookId(102);
		b.setBookName("Core Java");
		b.setBookPrice(2003.00);

		repo.save(b);

		System.out.println("Record inserted.....");

//		Optional<Book> findById = repo.findById(101);
//		System.out.println(findById.get());
	}

}
