package Adapter_Design_Pattern;

public class TCS implements Technology {

	@Override
	public void backendTechnolgy() {
		System.out.println("TCS BackendTechnology");

	}

	@Override
	public void frontendTechnology() {
		System.out.println("TCS FrontendTechnology");

	}

}
