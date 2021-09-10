package verify.exam05;

public class Question {
	public void method1() throws NumberFormatException,ClassNotFoundException {
		//try { method1(); } catch(Exception e) {}
		//void method2() throws Exception { method1(); }
		try { method1(); } catch(Exception e) {} catch(ClassNotFoundException e) {}
		//try { method1(); } catch(ClassNotFoundException e) {} catch(NumberFormatException e) {}
	
	}