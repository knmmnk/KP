package com.aviradigital.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.aviradigital.dao.AbstractCommonDAO;
import com.aviradigital.dao.UserDAO;
import com.aviradigital.dto.UserDTO;

@Repository
public class UserDAOImpl extends AbstractCommonDAO implements UserDAO {

	public static final String USER_LIST_BY_ORG_QUERY = "user.list.by.org";

	private Properties userQueries;
	
	@Autowired
	public UserDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
		userQueries = loadQueries(USER_QUERIES_FILE_NAME, UserDAOImpl.class, USER_LIST_BY_ORG_QUERY);
	}

	@Override
	public List<UserDTO> getUserDetails(long orgId) {
		SqlParameterSource parameters = new MapSqlParameterSource("orgId",orgId);
		return getNamedParameterJdbcTemplate().query(userQueries.getProperty(USER_LIST_BY_ORG_QUERY),  parameters, new RowMapper<UserDTO>() {
			@Override
			public UserDTO mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserId(rs.getLong("user_id"));
				userDTO.setUsername(rs.getString("username"));
				userDTO.setPassword(rs.getString("password"));
				userDTO.setOrgName(rs.getString("org_name"));
				return userDTO;
			}
		});
	}

}
