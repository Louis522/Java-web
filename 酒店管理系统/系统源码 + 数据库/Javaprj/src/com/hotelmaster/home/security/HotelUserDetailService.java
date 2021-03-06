package com.hotelmaster.home.security;

import org.acegisecurity.GrantedAuthority;
import org.acegisecurity.GrantedAuthorityImpl;
import org.acegisecurity.userdetails.User;
import org.acegisecurity.userdetails.UserDetails;
import org.acegisecurity.userdetails.UserDetailsService;
import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

import com.hotelmaster.dao.OperatorDao;
import com.hotelmaster.po.Operator;

public class HotelUserDetailService implements UserDetailsService {
	protected final Logger logger = Logger
			.getLogger(HotelUserDetailService.class);

	private final GrantedAuthority ROLE_ADMIN = new GrantedAuthorityImpl(
			"ROLE_ADMIN");
	private final GrantedAuthority ROLE_USER = new GrantedAuthorityImpl(
			"ROLE_USER");
	private final GrantedAuthority ROLE_RESERV = new GrantedAuthorityImpl(
			"ROLE_RESERV");
	private final GrantedAuthority ROLE_OPERATOR = new GrantedAuthorityImpl(
			"ROLE_OPERATOR");

	private final GrantedAuthority[] AUTHORITY_ADMIN = new GrantedAuthority[] {
			ROLE_ADMIN, ROLE_USER, ROLE_RESERV, ROLE_OPERATOR };
	private final GrantedAuthority[] AUTHORITY_USER = new GrantedAuthority[] { ROLE_USER };
	private final GrantedAuthority[] AUTHORITY_RESERV = new GrantedAuthority[] { ROLE_RESERV };
	private final GrantedAuthority[] AUTHORITY_OPERATOR = new GrantedAuthority[] {
			ROLE_RESERV, ROLE_OPERATOR };
	private OperatorDao operatorDao;

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		Operator operator = new Operator();
		if ((operator = operatorDao.query(username)) == null) {
			logger
					.warn("UserDetails load failed: No such user with username - "
							+ username);
			throw new UsernameNotFoundException("User name is not found.");
		}
		String password = operator.getOpPassword();
		int privilege = operator.getOpPrivilege();
		logger.info("Username " + username + " loaded successfully.");
		return new User(username, password, true, true, true, true,
				privilege == Operator.PRIVILEGE_ADMIN ? AUTHORITY_ADMIN
						: AUTHORITY_USER);
	}

	public OperatorDao getOperatorDao() {
		return operatorDao;
	}

	public void setOperatorDao(OperatorDao operatorDao) {
		this.operatorDao = operatorDao;
	}

}
