package intro;

//1.  extend Student with a a class named Software Major
//3. Implement Symposium Presenter and all required methods
public class SoftwareMajor extends Student implements SymposiumPresenter{

	//2. Write a constructor that instantiates two fields, String name and boolean graduated
	private String name;
	private boolean graduated;

	public SoftwareMajor(){
		this.name = "Me";
		this.graduated = false;
	}

	@Override
	public void present() {
		System.out.println("Something I learned...");;
	}

	@Override
	public String getPresentationName() {
		return "The best presentation ever";
	}


	//4. write a methods "void graduate" that is only executed if graduate is false
	public void graduate(){
		if(graduated == false){
			//stuff
		}
	}

	//5. Write a method "boolean isGraduated" that returns the graduated field
	public boolean isGraduated(){
		return graduated;
	}

	//6. Write a method didStudentGraduate that takes a SoftwareMajor as a parameter and returns true if the SoftwareMajor's graduated oolean is also true
	public boolean didStudentGraduate(SoftwareMajor x){
		return x.isGraduated();
	}
	
	//7. Write a method "void githubStatus" that randomly prints either "Github is working" or "Github is nopt working"
	public void githubStatus(){
		if (Math.random() < .5){
			System.out.println("Github is working!");
		}else{
			System.out.println("Github is not working!");
		}
	}
	
	//8. Write a method isMajor that returns true if the Object parameter is an instance of SoftwareMajor
	public boolean isMajor(Object o){
		return o instanceof SoftwareMajor;
	}

}
