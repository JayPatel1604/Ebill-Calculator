package ebill;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		ElectricityBoard electricityBoard = new ElectricityBoard();
		
		String dataFile ="C:\\Users\\Jay K Patel\\Desktop\\Project\\ebill\\ebbill.txt";
		List<ElectricityBill> billList = electricityBoard.generateBill(dataFile);
		System.out.println("Bills Parsed from File...");
		for (ElectricityBill bill : billList) {
			System.out.println(String.format("ID :%s, name :%s ,address :%s,unit :%d,bill Rs.  %f ",
					bill.getConsumerNumber(), bill.getConsumerName(), bill.getConsumerAddress(), bill.getUnitConsumed(),
					bill.getBillAmount()));
		}

		electricityBoard.addBill(billList);
		Connection connection = new DBHandler().establishConnection();
		Statement statement = connection.createStatement();
		String readTable = "Select * from electricitybill";
		ResultSet resultset = statement.executeQuery(readTable);
		System.out.println("Bills retrived from database ElectricityBill...");
		while (resultset.next()) {
			String consumerNumber = resultset.getString(1);
			String consumerName = resultset.getString(2);
			String consumerAddress = resultset.getString(3);
			int unitConsumed = resultset.getInt(4);
			float billAmount = resultset.getFloat(5);
			System.out.println(String.format("id :%s, name :%s,address :%s,units: %d,bill Rs . %f", consumerNumber,
					consumerName, consumerAddress, unitConsumed, billAmount));

		}
	}

}
