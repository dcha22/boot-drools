package com.javainuse.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.javainuse.model.HCP;
import com.javainuse.model.Product;

@Service
//@Component
public class HCPRouteService {

	private final KieContainer kieContainer;

	@Autowired
	public HCPRouteService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public HCP getHcpRouteTo(HCP hcp) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(hcp);
		kieSession.fireAllRules();
		kieSession.dispose();
		
		return hcp;
	}
}