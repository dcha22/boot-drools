package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.HCP;
import com.javainuse.model.Product;
import com.javainuse.service.HCPRouteService;
import com.javainuse.service.JewelleryShopService;
import com.temporary.test.RouterHelper;

@RestController
public class HCPRouteController {

	private final HCPRouteService hcpRouteService;

	@Autowired
	public HCPRouteController(HCPRouteService hcpRouteService) {
		this.hcpRouteService = hcpRouteService;
	}
	
	@Autowired
	RouterHelper routerHelper;
	
	@RequestMapping(value = "/hcpRouteTo", method = RequestMethod.GET, produces = "application/json")
	public HCP getQuestions(@RequestParam(required = true) String country) {

		HCP hcp = new HCP();
		hcp.setCountry(country);

		hcpRouteService.getHcpRouteTo(hcp);
		
		routerHelper.printRouterPath(hcp.getRouteTo());
		
		return hcp;
	}

	@RequestMapping(value = "/hcpRouteTo2", method = RequestMethod.GET, produces = "application/json")
	public HCP getQuestions2(@RequestParam(required = true) String name) {

		HCP hcp = new HCP();
		hcp.setName(name);

		hcpRouteService.getHcpRouteTo(hcp);
		
		return hcp;
	}
	
	@RequestMapping(value = "/hcpRouteTo3", method = RequestMethod.GET, produces = "application/json")
	public HCP getQuestions3(@RequestParam(required = true) String address) {

		HCP hcp = new HCP();
		hcp.setAddress(address);
		// devtools works on the office machine, not here :( ??
		System.out.println("This is test for devtools-- TUGLAR88");
		System.out.println("this is another test");
		hcpRouteService.getHcpRouteTo(hcp);
		
		return hcp;
	}
}
