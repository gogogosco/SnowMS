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

package net.sf.odinms.net.channel.handler;


import net.sf.odinms.client.MapleClient;
import net.sf.odinms.client.MapleMacro;
import net.sf.odinms.net.AbstractMaplePacketHandler;
import net.sf.odinms.tools.data.input.SeekableLittleEndianAccessor;

public class SkillMacroHandler extends AbstractMaplePacketHandler {

	@Override
	public void handlePacket(SeekableLittleEndianAccessor slea, MapleClient c) {
	    int num = slea.readByte();

		for (int i = 0; i < num; i++) {
			String name = slea.readMapleAsciiString();
			int shout = slea.readByte();
			int skill1 = slea.readInt();
			int skill2 = slea.readInt();
			int skill3 = slea.readInt();

			MapleMacro macro = new MapleMacro(num, skill1, skill2, skill3, shout, name);
			c.getPlayer().updateMacros(i, macro);
		}
	}
}