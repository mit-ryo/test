package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<ItemListDTO> getitemListUserInfo(String item_transaction_id, String user_master_id)throws SQLException{
		ArrayList<ItemListDTO> itemListDTO = new ArrayList<ItemListDTO>();
//ここを直す
		String sql = "SELECT"
				+ " ubit.id, iit.item_name, ubit.item_price, ubit.item_stock, ubit.insert_date"
				+ " FROM "
				+ "user_buy_item_transaction ubit "
				+ "LEFT JOIN "
				+ "item_info_transaction iit "
				+ "ON "
				+ "ubit.item_transaction_id = iit.id "
				+ "WHERE "
				+ "ubit.item_transaction_id = ? AND ubit.user_master_id = ? "
				+ "ORDER BY "
				+ "ubit.insert_date DESC";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ItemListDTO dto = new ItemListDTO();
				dto.setId(resultSet.getString("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getString("item_stock"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				itemListDTO.add(dto);

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return itemListDTO;
	}

	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id)throws SQLException{

		String sql = "DELETE FROM "
				+ "user_buy_item_transaction "
				+ "WHERE "
				+ "item_transaction_id = ? AND user_master_id = ?";
		PreparedStatement preparedStatement;
		int result = 0;

		try{
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2,user_master_id);

			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}
}
