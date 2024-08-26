package com.evergent.corejava.immutable;
/* we can declare class as final
 The class is declared as final as that it cannot be subclassed
 */
public final class PersonImmutable {
	//private final fields
	private final String name;
	private final int age;
	//constructor to initializes the final fields
	public PersonImmutable(String name, int age) {
			this.name=name;
			this.age=age;
		}
	public String MyName() {
		return name;
	}
	public int MyAge() {
		return age;
	}

}
