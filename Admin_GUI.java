import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.JSplitPane;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTable;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;

import javafx.scene.layout.VBox;

import javax.swing.JTextArea;

public class Admin_GUI {
	private ArrayList<String>food = new ArrayList<String>();
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_GUI window = new Admin_GUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_GUI() {
		 frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Object rowData[][] = { { "NORMAL", "", "","" },
				{ "JR", "", "", "" } };
		Object columnNames[] = { "Bread", "Current", "Min Restock", "Quantity to order" };
		JTable bread = new JTable(rowData, columnNames);

		JScrollPane scrollPane = new JScrollPane(bread);
		scrollPane.setPreferredSize(new Dimension(800,50));
		bread.setRowHeight(60);
		

		//---------------------------------//  

		Object rowData1[][] = { { "Row1-Column1", "Row1-Column2", "Burger", "" },
				{ "Row2-Column1", "Row2-Column2", "Row2-Column3" , "asdhasjhdkjas"} };
		Object columnNames1[] = { "base", "Current", "Min restockLevel","Quntity to order" };
		JTable table1 = new JTable(rowData1, columnNames1);
		table1.setRowHeight(60);
		JScrollPane scrollPane1 = new JScrollPane(table1); 
		scrollPane1.setPreferredSize(new Dimension(800,50));

		
		Object rowData2[][] = { { "Row1-Column1", "Row1-Column2", "Burger", "" },
				{ "Row2-Column1", "Row2-Column2", "Row2-Column3" , "asdhasjhdkjas"} };
		Object columnNames2[] = { "base", "Current", "Min restockLevel","Quntity to order" };
		JTable table2 = new JTable(rowData2, columnNames2);
		table2.setRowHeight(60);
		JScrollPane scrollPane2 = new JScrollPane(table2); 
		scrollPane2.setPreferredSize(new Dimension(800,50));
		
		
		Object rowData3[][] = { { "Row1-Column1", "Row1-Column2", "Burger", "" },
				{ "Row2-Column1", "Row2-Column2", "Row2-Column3" , "asdhasjhdkjas"} };
		Object columnNames3[] = { "Column Onvvbvbvbe", "Column Two", "Column Three","gjhgjh" };
		JTable table3 = new JTable(rowData3, columnNames3);
		table3.setRowHeight(60);
		JScrollPane scrollPane3 = new JScrollPane(table3); 
		scrollPane3.setPreferredSize(new Dimension(800,50));
		
		Object rowData4[][] = { { "Row1-Column1", "Row1-Column2", "Burger", "" },
				{ "Row2-Column1", "Row2-Column2", "Row2-Column3" , "asdhasjhdkjas"} };
		Object columnNames4[] ={ "base", "Current", "Min restockLevel","Quntity to order" };
		JTable table4 = new JTable(rowData4, columnNames4);
		table4.setRowHeight(50);//resize thr rows
		JScrollPane scrollPane4 = new JScrollPane(table4); 
		scrollPane4.setPreferredSize(new Dimension(800,50));
		Container c  = frame.getContentPane();// the container is the important one to add on the top of each other
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		c.add(bread.getTableHeader());
		c.add(bread);
		c.add(table1.getTableHeader());
		c.add(table1);
		
		c.add(table2.getTableHeader());
		c.add(table2);
		c.add(table3.getTableHeader());
		c.add(table3);
		c.add(table4.getTableHeader());
		c.add(table4);
		JButton save = new JButton("  SAVE  ");	
		JButton load = new JButton("SUBMIT");
		
		c.add(load);
		c.add(save);
		
		frame.pack();
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
}	

