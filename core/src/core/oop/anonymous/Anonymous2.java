package core.oop.anonymous;
// Anonymous inner class that implements an interface

interface Softwate{
	public void develop();
}
public class Anonymous2 {
	public static void main(String[] args) {
		Softwate s = new Softwate() {
			@Override
			public void develop() {
				System.out.println("Software Developed in Java");
			}
		};
		s.develop();
		System.out.println(s.getClass().getName());
	}
}
