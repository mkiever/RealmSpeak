/* 
 * RealmSpeak is the Java application for playing the board game Magic Realm.
 * Copyright (c) 2005-2015 Robin Warren
 * E-mail: robin@dewkid.com
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 *
 * http://www.gnu.org/licenses/
 */
package com.robin.magic_realm.RealmBattle;

import java.util.Comparator;

import com.robin.magic_realm.components.BattleChit;

public class BattleChitSpeedComparator implements Comparator {
	public int compare(Object o1,Object o2) {
		int ret = 0;
		BattleChit b1 = (BattleChit)o1;
		BattleChit b2 = (BattleChit)o2;
		ret = b1.getAttackSpeed().compareTo(b2.getAttackSpeed()); // smaller (faster) speeds should be first
		if (ret==0) {
			ret = b2.getLength().compareTo(b1.getLength()); // bigger lengths should be first
		}
		return ret;
	}
}