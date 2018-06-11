package cn.dw.demo;

public class jvmdemo {

	public static void main(String[] args) {
		jvmdemo demo=new jvmdemo();
		demo.setName("admin");
		jvmdemo.setAge(18);
		
		jvmdemo demo2=new jvmdemo();
		demo2.setName("admin2");
		jvmdemo.setAge(19);

		System.out.println(demo.getName()+","+jvmdemo.getAge());
		System.out.println(demo2.getName()+","+jvmdemo.getAge());
	}
	
	private String name;
	
	private static int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		jvmdemo.age = age;
	}
}
