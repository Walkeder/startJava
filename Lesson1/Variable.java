public class Variable{
	public static void main(String []args){
		byte core = 8;
		short ram = 16;
		int videoMemory = 8192;
		long frequencyVideo = 1815;

		float frequencyCPU = 3.2f;
		double readSpeedSSD = 540.4235;

		char c = 001;
		boolean nalichiePC = true;

		System.out.println("There is a computer: " + nalichiePC);
		System.out.println("PC specification: ");
		System.out.println("cores: " + core);
		System.out.println("RAM: " + ram);
		System.out.println("The amount of videomemory: " + videoMemory);
		System.out.println("The frequency of the videocard: " + frequencyVideo);
		System.out.println("The frequency of the CPU: " + frequencyCPU);
		System.out.println("Reading speed SSD: " + readSpeedSSD);
		System.out.println(c);

	}
}