package com.lambda;

@FunctionalInterface
public interface Storage {

	public void storeInFile(String data, String filename);
}
