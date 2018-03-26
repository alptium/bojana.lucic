package elitesports;

public class Candidate {

	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private int height;
	private int weight;
	private String primaryPosition;
	private String preferredPosition;

	public Candidate (String firstName, String lastName, int age, String gender, int height, int weight,
			String primaryPosition, String preferredPosition) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.primaryPosition = primaryPosition;
		this.primaryPosition = preferredPosition;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getage() {
		return age;
	}

	public String getgender() {
		return gender;
	}

	public int height() {
		return height;
	}

	public int weight() {
		return weight;
	}

	public String primaryPosition() {
		return primaryPosition;
	}

	public String preferredPosition() {
		return preferredPosition;
	}
}
