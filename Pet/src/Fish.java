public class Fish extends Pet implements Swimmable {
	int currentDepth=0;
	/*
	public int dive(int howDeep){
		currentDepth=currentDepth + howDeep;
		System.out.println("����� �� ������� "
		+ howDeep + " �����");
		System.out.println("� �� ������� "
		+ currentDepth + " ����� ���� ������ ����");
		return currentDepth;
	}
	*/
	
	public String say(String something){
		return "�� �� �� ������, ��� ���� �� �������������?";
	}
	
	public String sayme () {
		return "sadfgfdfa";
	}
	
	
	public void sweam (int numberOfMeters) {
		
	}
	public void dive (int howDeap) {
		
	}
}