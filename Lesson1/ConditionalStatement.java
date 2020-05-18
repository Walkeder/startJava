public class ConditionalStatement {
	public static void main(String []args){
		int age = 29;
		String man = "man";
		String noMan = "Man";
		double height = 2.1;
		char firstLetterName = 'A';

		if(age>20){
			System.out.println("Vozrast bolshe 20");
		}

		if(man.equals("man")){
			System.out.println("Muzhskoi pol");
		}

		if(noMan.equals("noMan")){
			System.out.println("neMuzhkoi pol");
		}

		if(height>1.80){
			System.out.println("Rost vishe srednego");
		}else{
			System.out.println("Sredniy rost");
		}

		if(firstLetterName == 'A'){
			System.out.println("Pervaya bukva A");
		}else if(firstLetterName == 'I'){
			System.out.println("Pervaya bukva I");
		}else{
			System.out.println("Dragaya bukva");
		}

	}
}