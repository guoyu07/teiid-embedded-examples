/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */
package org.teiid.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {

	public static Connection getDriverConnection(String driver, String url, String user, String pass) throws Exception {
		Class.forName(driver);
		return DriverManager.getConnection(url, user, pass);
	}

	public static void close(Connection conn) throws SQLException {
		close(null, null, conn);
	}

	public static void close(Statement stmt) throws SQLException {
		close(null, stmt, null);
	}

	public static void close(ResultSet rs) throws SQLException {
		close(rs, null, null);
	}

	public static void close(Statement stmt, Connection conn) throws SQLException {
		close(null, stmt, conn);
	}

	public static void close(ResultSet rs, Statement stmt) throws SQLException {
		close(rs, stmt, null);
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn) throws SQLException {

		if (null != rs) {
			rs.close();
			rs = null;
		}

		if (null != stmt) {
			stmt.close();
			stmt = null;
		}

		if (null != conn) {
			conn.close();
			conn = null;
		}
	}

}
