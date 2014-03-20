package com.apress.pss.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.ldap.userdetails.InetOrgPerson;
import org.springframework.security.ldap.userdetails.LdapUserDetailsImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.apress.pss.model.UserInfo;

@Controller
public class UserDetailsController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/userInfo")
	public ModelAndView getUserInfo()
	{
		ModelAndView mv = new ModelAndView("userInfo");
		
		UserInfo user = new UserInfo();
		
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		/*
		String username;

	    if (principal instanceof UserDetails) {
	      username = ((UserDetails)principal).getUsername();

	    } else {
	      username = principal.toString();

	    }
	    */
	    /*
	cn = U0167995
	co = United States
	distinguishedName = CN=U0167995,OU=Users,OU=Online Services,DC=truven,DC=local
	displayName = Sobczak, Michael
	department = Life Sciences
	description = Software Eng Sr
	division = Commercial
	givenName = Michael
	mail = mike.sobczak@truvenhealth.com
	manager = CN=U0088815,OU=Users,OU=Online Services,DC=truven,DC=local
	memberOf = CN=TSH-Solucient-AmgenDev,OU=Groups,OU=Online Services,DC=truven,DC=local
	name = U0167995
	postalAddress = 777 E. Eisenhower Parkway
	postalCode = 48108
	sAMAccountName = U0167995
	sn = Sobczak
	st = MI
	streetAddress = 777 E. Eisenhower Parkway
	title = Software Eng Sr
	userPrincipalName = mike.sobczak@truvenhealth.com  
	     */
	    	
			//UserDetails userDetails = (UserDetails)principal;
	        //String cn = ((InetOrgPerson) userDetails).getCn().toString();
	        String dn = ((LdapUserDetailsImpl) principal).getDn();
	        /*
	        String displayName = ((LdapUserDetailsImpl) principal).getDisplayName();
	        String postalAddress = ((LdapUserDetailsImpl) principal).getPostalAddress();
	        String postalCode = ((LdapUserDetailsImpl) principal).getPostalCode();
	        String sn = ((LdapUserDetailsImpl) principal).getSn();
	        String street = ((LdapUserDetailsImpl) principal).getStreet();
	        String title = ((LdapUserDetailsImpl) principal).getTitle();
	        String username = ((LdapUserDetailsImpl) principal).getUsername();
	        
	        user.setCn(cn);
	        user.setDescription(description);
	        user.setDisplayName(displayName);
	        user.setPostalCode(postalCode);
	        user.setPostalAddress(postalAddress);
	        user.setSn(sn);
	        user.setStreet(street);
	        user.setTitle(title);
	        user.setUsername(username);
	        */
		
		mv.addObject("user", user);
		return mv;
	}

}
