package com.tradeshift.triangle.main;

public enum Triangle {
	EQUILATERAL("Equilateral"), 
	ISOCELES("Isoceles"), 
	SCALENE("Scalene");
	
	private final String name;       

    private Triangle(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}
