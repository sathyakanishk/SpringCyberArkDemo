package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.demo.model.Login;
import com.demo.model.User;

public class UserDaoImpl implements UserDao {

	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * 
	 * @Autowired DataSource datasource;
	 * 
	 * @Autowired JdbcTemplate jdbcTemplate;
	 * 
	 * public void register(User user) {
	 * 
	 * String sql = "insert into users values(?,?,?,?,?,?,?)";
	 * 
	 * jdbcTemplate.update(sql, new Object[] { user.getUsername(),
	 * user.getPassword(), user.getFirstname(), user.getLastname(), user.getEmail(),
	 * user.getAddress(), user.getPhone() }); }
	 * 
	 * public User validateUser(Login login) {
	 * 
	 * String sql = "select * from users where username='" + login.getUsername() +
	 * "' and password='" + login.getPassword() + "'";
	 * 
	 * List<User> users = jdbcTemplate.query(sql, new UserMapper());
	 * 
	 * return users.size() > 0 ? users.get(0) : null; }
	 * 
	 */}

/*	class UserMapper implements RowMapper<User> {

	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();

	    user.setUsername(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    user.setFirstname(rs.getString("firstname"));
	    user.setLastname(rs.getString("lastname"));
	    user.setEmail(rs.getString("email"));
	    user.setAddress(rs.getString("address"));
	    user.setPhone(rs.getInt("phone"));

	    return user;
	  }*/
//}
