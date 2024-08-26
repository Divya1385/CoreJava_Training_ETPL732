package com.evergent.corejava.immutable;
public final class  ImmutableString {
	private String value;
	public ImmutableString(String value) {
		this.value=value;
	}
	public String myvalue() {
		return value;
}
	//override
	public String tostring() {
		return value;
		
	}

	public static void main(String[] args) {
		
	}

}
