package com.jobs.view;

import com.jobs.application.JobsController;
import com.jobs.application.MemberDTO;

import java.util.List;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {

		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "6 mesos");
		controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);

		controller.payAllEmployeers();

		try {
            controller.fireMember("Juan Volunteer");
        } catch (Exception e){
		    System.out.print(e.getMessage() + "\n");
        }

		List<MemberDTO> members =controller.getAllEmployees();
		String lineEmployees = "";
		for (MemberDTO m: members){
		    lineEmployees+= m.getName() + ": " + m.getTotalPaid() + "\n";
        }

		System.out.println("EMPLOYEES: " + lineEmployees);

	}

}
