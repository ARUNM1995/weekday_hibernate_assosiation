package com.oehm2.assosiations.util;

import com.oehm2.assosiations.dao.CommonDao;
import com.oehm2.assosiations.dto.Captain;
import com.oehm2.assosiations.dto.Team;

public class Test {

	public static void main(String[] args) {

		Captain captain = new Captain();
		captain.setName("virat kohli");
		captain.setAge(new Long(30));
		
		Team team = new Team();
		team.setName("India");
		team.setSize(new Long(11));
		team.setCaptain(captain);
		
		CommonDao dao = new CommonDao();
		dao.saveTeam(team);
	}

}
