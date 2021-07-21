package com.saran.model;

public class daotest {

	public static void main(String[] args) {



package com.saran.model.daoTest;

import com.saran.dao.stockdetailDao;
import com.saran.model.stockdetai;

public class stockdetailImpl {

	public class stockdetailDaoimpl implements stockdetailDao {

		public boolean save(Export export) throws Exception {

			String sql = "insert into Export(productid,exportid,Exportdate,exportDestination,exportcost) values(" + export.productid + "','" + export.exportid + "','"
					+ export.Exportdate + "','" + export.exportDestination + "'," + export.exportcost +")";
					
			System.out.println(sql);
			
		

	
	return false;
}
	}
}


	}

}
