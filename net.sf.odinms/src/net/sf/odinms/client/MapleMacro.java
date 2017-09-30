/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc> 
                       Matthias Butz <matze@odinms.de>
                       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License version 3
    as published by the Free Software Foundation. You may not use, modify
    or distribute this program under any other version of the
    GNU Affero General Public License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package net.sf.odinms.client;

/**
 *
 * @author Raz
 */
public class MapleMacro {

    private int pos;
    private int skill1;
    private int skill2;
    private int skill3;
    private int shout;
    private String name;

    public MapleMacro(int pos, int skill1, int skill2, int skill3, int shout, String name) {
		this.pos = pos;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.shout = shout;
		this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getShout() {
		return shout;
	}

	public void setShout(int shout) {
		this.shout = shout;
	}

	public int getSkill1() {
		return skill1;
	}

	public void setSkill1(int skill1) {
		this.skill1 = skill1;
	}

	public int getSkill2() {
		return skill2;
	}

	public void setSkill2(int skill2) {
		this.skill2 = skill2;
	}

	public int getSkill3() {
		return skill3;
	}

	public void setSkill3(int skill3) {
		this.skill3 = skill3;
	}
}
