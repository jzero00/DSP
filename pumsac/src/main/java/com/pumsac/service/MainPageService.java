package com.pumsac.service;

import java.sql.SQLException;
import java.util.Map;

public interface MainPageService {

	public Map<String,Object> getImages() throws SQLException;
}
