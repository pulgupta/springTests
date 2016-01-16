package springTests.springTests;

public class SampleBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sampleInit(){
		System.out.println("application initialised");
	}
	
}
