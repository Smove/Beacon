/**	
 * Beacon - Open Source Minecraft Server
 * Copyright (C) 2014  Marvin Seidl
 * Copyright (C) 2014  Blazecube
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * @author Marvin Seidl
 */
 package org.beaconmc.world;

import lombok.Data;

import org.beaconmc.utils.Vector3i;

@Data
public class BlockLocation {
	private final World w;
	private final int x;
	private final int y;
	private final int z;
	
	public BlockLocation(World w,Vector3i pos){
		this(w,pos.getX(),pos.getY(),pos.getZ());
	}
	
	public BlockLocation(World w,int x,int y,int z){
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Block getBlock(){
		return new Block(w, x, y, z);
	}
}
