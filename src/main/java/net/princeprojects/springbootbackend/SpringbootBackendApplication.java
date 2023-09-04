package net.princeprojects.springbootbackend;

import net.princeprojects.springbootbackend.model.User;
import net.princeprojects.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception{
		this.userRepository.save(new User("Prince","Raj","princeraj@gmail.com"));
		this.userRepository.save(new User("Tom","Cruise","tomcruise@gmail.com"));
		this.userRepository.save(new User("Tony","Stark","tonystark@gmail.com"));

	}

}
