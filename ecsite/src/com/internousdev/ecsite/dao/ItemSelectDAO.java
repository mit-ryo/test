package com.internousdev.ecsite.dao;

import java.sql.Connection;

import com.internousdev.ecsite.util.DBConnector;

public class ItemSelectDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

//	public ArrayList<ItemSelectDTO> getItemSelectUserInfo(String item_transaction_id, String user_master_id)throws SQLException{
//		ArrayList<ItemSelectDTO> myPageDTO = new ArrayList<ItemSelectDTO>();
//
//		String sql = "SELECT"
//				+ " ubit.id, iit.item_name, ubit.total_price, ubit.total_count, ubit.pay, ubit.insert_date"
//				+ " FROM "
//				+ "user_buy_item_transaction ubit "
//				+ "LEFT JOIN "
//				+ "item_info_transaction iit "
//				+ "ON "
//				+ "ubit.item_transaction_id = iit.id "
//				+ "WHERE "
//				+ "ubit.item_transaction_id = ? AND ubit.user_master_id = ? "
//				+ "ORDER BY "
//				+ "ubit.insert_date DESC";
//
//		try{
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setString(1, item_transaction_id);
//			preparedStatement.setString(2, user_master_id);
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			while(resultSet.next()){
//				ItemSelectDTO dto = new ItemSelectDTO();
//				dto.setId(resultSet.getString("id"));
//				dto.setItemName(resultSet.getString("item_name"));
//				dto.setTotalPrice(resultSet.getString("total_price"));
//				dto.setTotalCount(resultSet.getString("total_count"));
//				dto.setPayment(resultSet.getString("pay"));
//				dto.setInsert_date(resultSet.getString("insert_date"));
//				myPageDTO.add(dto);
//
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			connection.close();
//		}
//		return myPageDTO;
//	}
}
