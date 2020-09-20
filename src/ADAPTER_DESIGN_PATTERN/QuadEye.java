package ADAPTER_DESIGN_PATTERN;

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
