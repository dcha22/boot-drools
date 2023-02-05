package com.temporary.test;

import org.springframework.stereotype.Component;

@Component
public class RouterHelper {

	public void printRouterPath(String routeTo) {
		System.out.println("DCR is destined to go to: "+ routeTo);
	}
}
