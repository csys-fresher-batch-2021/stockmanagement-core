package com.saran.model.daoTest;

import com.saran.dao.ExportDao;
import com.saran.model.Export;

public class ExportImpl {

	public abstract class ExportDaoimpl implements ExportDao {

		public boolean save(Export export) throws Exception {

			String sql = "insert into Export(productid,exportid,Exportdate,exportDestination,exportcost) values(" + export.productid + ",'" + export.exportid + "',"
					+ export.Exportdate + "','" + export.exportDestination + "','" + export.exportcost "')"; 
			System.out.println(sql);
		}

	}
}