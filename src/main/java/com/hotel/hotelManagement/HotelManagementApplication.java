package com.hotel.hotelManagement;

import com.hotel.hotelManagement.dao.*;
import com.hotel.hotelManagement.view.MenuClient;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.util.Scanner;

@SpringBootApplication
public class HotelManagementApplication {

	private static final String MAIN_MENU_OPTION_EMPLOYEES = "Employees";
	private static final String MAIN_MENU_OPTION_DEPARTMENTS = "Departments";
	private static final String MAIN_MENU_OPTION_ROOM = "Rooms";
	private static final String MAIN_MENU_OPTION_RESERVATION ="Reservation";
	private static final String MAIN_MENU_OPTION_BILLING = "Billing";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";

	private static final String[] MAIN_MENU_OPTIONS = new String[] { MAIN_MENU_OPTION_RESERVATION,
			MAIN_MENU_OPTION_BILLING,
			MAIN_MENU_OPTION_ROOM,MAIN_MENU_OPTION_EMPLOYEES,MAIN_MENU_OPTION_DEPARTMENTS,
			MAIN_MENU_OPTION_EXIT };

	private static final String MENU_OPTION_RETURN_TO_MAIN = "Return to main menu";

	private static final String DEPT_MENU_OPTION_ALL_DEPARTMENTS = "Show all departments";
	private static final String DEPT_MENU_OPTION_CREATE = "Create department name";
	private static final String[] DEPARTMENT_MENU_OPTIONS = new String[] { DEPT_MENU_OPTION_ALL_DEPARTMENTS,
			DEPT_MENU_OPTION_CREATE,
			MENU_OPTION_RETURN_TO_MAIN};

	private static final String EMPL_MENU_OPTION_ALL_EMPLOYEES = "Show all employees";
	private static final String EMPL_MENU_OPTION_SEARCH_BY_department = "Employee search by Department";
	private static final String EMPL_MENU_OPTION_EMPLOYEES_RAISE = "Raised employee salary";
	private static final String EMPL_MENU_OPTION_EMPLOYEE_BY_SCHEDULE = "Show employee by schedule";
	private static final String EMPL_MENU_OPTION_ADD_="Add a new employee";
	private static final String EMPL_MENU_OPTION_DELETE ="Delete employee who quite or have been fire";
	private static final String[] EMPL_MENU_OPTIONS = new String[] { EMPL_MENU_OPTION_ALL_EMPLOYEES,
			EMPL_MENU_OPTION_SEARCH_BY_department,EMPL_MENU_OPTION_EMPLOYEE_BY_SCHEDULE,
			EMPL_MENU_OPTION_EMPLOYEES_RAISE,EMPL_MENU_OPTION_ADD_,EMPL_MENU_OPTION_DELETE,
			MENU_OPTION_RETURN_TO_MAIN};

	private static final String RESERV_MENU_OPTION_ACTIVE_RESERVATION = "Show all active reservation";
	private static final String RESERV_MENU_OPTION_CREATE_RESERVATION = "Create reservation";
	private static final String RESERV_MENU_OPTION_CANCEL_RESERVATION = "Cancel reservation";
	private static final String RESERV_MENU_OPTION_ACTIVE_RESERVATION_NEXT_DAY = "Show reservation of the next day";
	private static final String RESERV_MENU_OPTION_ACTIVE_RESERVATION_FOR_NEXT_N_DAY  = "Show incoming reservation";
	private static final String[] PROJ_MENU_OPTIONS = new String[] { RESERV_MENU_OPTION_CREATE_RESERVATION,RESERV_MENU_OPTION_ACTIVE_RESERVATION,RESERV_MENU_OPTION_ACTIVE_RESERVATION_FOR_NEXT_N_DAY,
			RESERV_MENU_OPTION_ACTIVE_RESERVATION_FOR_NEXT_N_DAY,RESERV_MENU_OPTION_CANCEL_RESERVATION,
			MENU_OPTION_RETURN_TO_MAIN };

	private final MenuClient menu;
	private final JDBCDepartmentDao jdbcDepartmentDao;
	private final JDBCBillingDao jdbcBillingDao;
	private final JDBCEmployeeDao jdbcEmployeeDao;
	private final JDBCReservationDao jdbcReservationDao;
	private final JDBCRoomDao jdbcRoomDao;



	public static void main(String[] args) {

		BasicDataSource dataSource = getBasicDataSource();
		HotelManagementApplication application = new HotelManagementApplication(dataSource);
		application.run();
	}

	private static BasicDataSource getBasicDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5434/Hotel");
		dataSource.setUsername("postgres");
		dataSource.setPassword("Latuine86");
		return dataSource;
	}

	public HotelManagementApplication(DataSource dataSource) {
		this.menu = new MenuClient(System.in,System.out);
		this.jdbcDepartmentDao = new JDBCDepartmentDao(dataSource);
		this.jdbcBillingDao = new JDBCBillingDao(dataSource);
		this.jdbcEmployeeDao = new JDBCEmployeeDao(dataSource);
		this.jdbcReservationDao = new JDBCReservationDao(dataSource);
		this.jdbcRoomDao = new JDBCRoomDao(dataSource);
	}

	private void run() {
		displayApplicationBanner();
		boolean running = true;
		while(running) {
			printHeading("Main Menu");
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if(choice.equals(MAIN_MENU_OPTION_DEPARTMENTS)) {
				handleDepartments();
			} else if(choice.equals(MAIN_MENU_OPTION_EMPLOYEES)) {
				handleEmployees();
			} else if(choice.equals(MAIN_MENU_OPTION_RESERVATION)) {
				handleReservation();
			} else if (choice.equals(MAIN_MENU_OPTION_BILLING)){
				handleBilling();
			} else if(choice.equals(MAIN_MENU_OPTION_EXIT)) {
				running = false;
			}
		}
	}

	private void handleReservation() {
	printHeading("create reservation");
	}

	private void handleBilling() {
	}


	private void handleEmployees() {
	}

	private void handleDepartments() {
	}




	private void printHeading(String headingText) {
		System.out.println("\n"+headingText);
		for(int i = 0; i < headingText.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	private String getUserInput(String prompt) {
		System.out.print(prompt + " >>> ");
		return new Scanner(System.in).nextLine();
	}


	private void displayApplicationBanner() {
		System.out.println("|		|");
		System.out.println("|		|");
		System.out.println("|		|");
		System.out.println("|_______|");
		System.out.println("|-------|");
		System.out.println("|		|");
		System.out.println("|		|");
		System.out.println("|		|");
	}

}
