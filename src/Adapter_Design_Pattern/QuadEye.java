package Adapter_Design_Pattern;

public class QuadEye implements Technology {

	@Override
	public void backendTechnolgy() {
		System.out.println("QuadEye BackendTechnology");
	}

	@Override
	public void frontendTechnology() {
		System.out.println("QuadEye FrontendTechnology");
	}

}
