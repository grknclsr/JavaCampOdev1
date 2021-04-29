package javaCampOdev1;

public class UserManager {

	private BaseLogger logger;

	public UserManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add(User user) {
		System.out.println(user.getFirstName() + " Sisteme eklendi.");
		this.logger.log();
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " Sistemden silindi");
		this.logger.log();
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " Güncellendi");
		this.logger.log();
	}

}
