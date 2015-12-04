package com.devdream.controller;

import javax.swing.JFrame;

import com.devdream.data.bind.Intent;
import com.devdream.model.Commercial;

/**
 * TODO Description
 * 
 * @author Asier Gonzalez
 * @version 1.0
 * @since 1.0
 */
public class LoginController extends Controller {

	public LoginController(JFrame actualView, String newWindowName) {
		super(actualView, newWindowName);
	}
	
	public void login(Commercial comercial) {
		Intent.getInstance().setLoguedCommercial(comercial);
		super.changeView();
	}

}