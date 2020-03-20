package study;

import arcatch.ArCatchAPI;
import arcatch.dsl.compartment.grammar.Compartment;
import arcatch.dsl.rule.common.Criticality;


public class FlinkCaseStudy {
	
	private static Compartment flink;	

	public static void main(String[] args) {		
		
		// https://github.com/apache/flink/tree/master/flink-core
		String projetPath = "./Flink/";	
						
		//https://github.com/apache/flink/releases/tag/release-1.0.0
		checkFlink100(projetPath + "Flink_1.0.0/flink-core/src/main/java");		
		
		//https://github.com/apache/flink/releases/tag/release-1.1.0
		checkFlink110(projetPath + "Flink_1.1.0/flink-core/src/main/java");
		
		//https://github.com/apache/flink/releases/tag/release-1.2.0
		checkFlink120(projetPath + "Flink_1.2.0/flink-core/src/main/java");
		
		//https://github.com/apache/flink/releases/tag/release-1.3.0
		checkFlink130(projetPath + "Flink_1.3.0/flink-core/src/main/java");
				
		//https://github.com/apache/flink/releases/tag/release-1.4.0
		checkFlink140(projetPath + "Flink_1.4.0/flink-core/src/main/java");
		
		//https://github.com/apache/flink/releases/tag/release-1.5.0
		checkFlink150(projetPath + "Flink_1.5.0/flink-core/src/main/java");
		
		//https://github.com/apache/flink/releases/tag/release-1.6.0
		checkFlink160(projetPath + "Flink_1.6.0/flink-core/src/main/java");
		
		//https://github.com/apache/flink/releases/tag/release-1.7.0
		checkFlink170(projetPath + "Flink_1.7.0/flink-core/src/main/java");			
												
		//https://github.com/apache/flink/releases/tag/release-1.8.0
		checkFlink180(projetPath + "Flink_1.8.0/flink-core/src/main/java");
		
		//https://github.com/apache/flink/releases/tag/release-1.9.0
		checkFlink190(projetPath + "Flink_1.9.0/flink-core/src/main/java");		
		
	}

	private static void checkRules() {		
			
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoCA = 0.0")
				.build());	
		
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoCI = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoCRN = 0.0")
				.build());		
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoEH = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoDR = 0.0")
				.build());				
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoGH = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoGS = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoNPB = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoOCA = 0.0")
				.build());		
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoOC = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoSF = 0.0")
				.build());
		
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoSKS = 0.0")
				.build());						
		
		// Abstractness violation
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("(Ce / (Ce + Ca)) <= 0.3")
				.build());
		
		//Large Class according PMD tool: https://github.com/pmd/pmd/blob/master/pmd-java/src/main/java/net/sourceforge/pmd/lang/java/rule/design/DataClassRule.java
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("(((NoM + NoA) > 3) & (WMC < 31)) | (((NoM + NoA) > 5) & (WMC < 47))")
				.build());
				
		//TooManyFields according PMD tool: ttps://github.com/pmd/pmd/blob/master/pmd-java/src/main/java/net/sourceforge/pmd/lang/java/rule/design/TooManyFieldsRule.java
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoA > 15")
				.build());		
		
		//TooManyMethods according PMD tool: https://pmd.github.io/pmd-6.19.0/pmd_rules_java_design.html#toomanymethods
		ArCatchAPI.addRule(ArCatchAPI
				.ruleBuilder()
				.antiDrift()
				.criticality(Criticality.WARNING)
				.compartiment(flink)
				.constrainedTo("NoM > 10")
				.build());		
		
		ArCatchAPI.check();
	}
	
	private static void checkFlink100(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.0.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink110(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.1.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink120(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.2.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink130(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.3.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink140(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.4.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink150(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.5.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink160(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.6.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink170(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.7.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink180(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.8.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
	
	private static void checkFlink190(String projectPath) {
		ArCatchAPI.setConfiguration(ArCatchAPI
				.configurationBuilder()
				.projectNameAndVersion("Flink", "1.9.0")
				.projectPath(projectPath)				
				.build());
		
		flink = ArCatchAPI
				.compartmentBuilder()
				.compartment("flink")
				.matching("org.apache.flink.*")
				.build();

		ArCatchAPI.addCompartment(flink);		
		
		checkRules();
	}
}
