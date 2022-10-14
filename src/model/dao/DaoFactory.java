package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactory {
	public static SellerDAO createSellerDao() {
		return new SellerDaoImplJDBC(DB.getConnection());
	}
}
