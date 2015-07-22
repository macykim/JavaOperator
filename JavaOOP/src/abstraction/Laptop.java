package abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: laptop
*/

public class Laptop extends ProductSpec{
	private String cpu;   // CPU
	private String ram;   // RAM 메모리
	private String hdisk; // 하드디스크 사양
	
	public void writeInfo(String company, String name, String serialNo, String cpu, String ram, String hdisk) {		
		super.writeInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdisk = hdisk;		
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("CPU: " + this.cpu);
		System.out.println("메모리: " + this.ram);
		System.out.println("하드디스크 사양: " + this.hdisk);
	}
	
	
	
}
