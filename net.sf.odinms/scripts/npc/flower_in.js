/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc> 
					   Matthias Butz <matze@odinms.de>
					   Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

/*	  Mysterious Statue(1061006)
	- Sleepywood (105040300)
*/

importPackage(net.sf.odinms.server.pq);
importPackage(net.sf.odinms.client);

var status = 0;
var npcText = "";

function start() {
	status = -1;
	action(1, 0, 0);
}

function action(mode, type, selection) {
	if (mode == -1){
		cm.dispose();
	}else if (mode == 0) {
		cm.sendOk("Alright, see you next time.");
		cm.dispose();
		}else{	
		
		if (mode == 1) {
			status++;
		}
		else {
			status--;
		}
		if (status == 0) {
				if (cm.getLevel() < 15) {
					cm.sendOk("You must be a higher level to enter the mysterious place.");
					cm.dispose();
				}
				else {
					cm.sendYesNo("Once I lay my hand on the statue, a strange light covers me and it feels like I am being sucked into somewhere else. Is it okay to be moved to somewhere else randomly just like that?");
				}
			
		}else if (status == 1){
		npcText += "Please select a #bJumpQuest:\r\n";
		npcText += "#L0#Stage 1#l\r\n";
		npcText += "#L1#Stage 2#l\r\n";
		npcText += "#L2#Stage 3#l\r\n";
		npcText += "#L3#Stage 4#l\r\n";
		npcText += "#L4#Stage 5#l\r\n";
		npcText += "#L5#Stage 6#l\r\n";
		cm.sendSimple(npcText);
		

		} else if (status == 2) {
		if (selection == 0){
		cm.warp(105040310, 0);
		}else if(selection == 1){
		cm.warp(105040312, 0);
		}else if(selection == 2){
		cm.warp(105040314, 0);
		}else if(selection == 3){
		cm.warp(105040310, 0);
		}else if(selection == 4){
		cm.warp(105040312, 0);
		}else if(selection == 5){
		cm.warp(105040314, 0);
		}
		cm.dispose();
			
		}
	}
}
	


