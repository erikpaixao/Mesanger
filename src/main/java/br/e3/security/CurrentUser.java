package br.e3.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CurrentUser {

	public LoginDetailBean getActiveUser() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal == null) {
			return null;
		}

		return (LoginDetailBean)principal;
	}

}
