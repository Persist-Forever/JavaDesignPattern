package cn.itcast.factory.prototype;



public class ConcretePrototype1 implements Prototype {
	private String name;
	@Override
	public Prototype clone() {
		ConcretePrototype1 prototype = new ConcretePrototype1();
		prototype.setName(name);
		return prototype;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return "Now in prototype1,name=" + this.name;
	}

}