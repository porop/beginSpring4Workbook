package com.sample.spring.bankapp.controller;

import org.apache.log4j.Logger;

import com.sample.spring.bankapp.domain.FixedDepositDetails;
import com.sample.spring.bankapp.service.FixedDepositService;

public class FixedDepositControllerImpl implements FixedDepositController {
	private static Logger logger = Logger.getLogger(FixedDepositControllerImpl.class);
	
	private FixedDepositService fixedDepositService;
	
	public FixedDepositControllerImpl() {
		logger.info("initializing");
	}
	
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		logger.info("Setting fixedDepositService property");
		this.fixedDepositService = fixedDepositService;
	}
	
	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 10000, 365, "user@gmail.com"));
	}
	
	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}
