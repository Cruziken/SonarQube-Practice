package practice;

public class Importer {
	public static void main(String[] args) {
		PropsWriter myPropsWriter = new PropsWriter("sonar-project.properties");
		Variables myVariables = new Variables();
		// PullWithGit myPWG = new PullWithGit();
		myVariables.vars("sonarqubework");
		myPropsWriter.propsVars(myVariables);
	}
}

