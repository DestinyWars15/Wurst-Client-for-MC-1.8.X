/*
 * Copyright � 2014 - 2015 Alexander01998 and contributors
 * All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.files;

import java.util.TreeMap;

public class DefaultAutoBuildTemplates extends TreeMap<String, int[][]>
{
	public DefaultAutoBuildTemplates()
	{
		put("Bridge", BRIDGE);
		put("Floor", FLOOR);
		put("Nazi", NAZI);
		put("Penis", PENIS);
		put("Pillar", PILLAR);
		put("Wall", WALL);
		put("Wurst", WURST);
	}
	
	public static final int[][] BRIDGE = {{0, 1, 0, 5}, {0, 1, 0, 4},
		{0, 1, 0, 2}, {0, 1, -1, 5}, {0, 1, -1, 4}, {0, 1, -1, 2},
		{0, 1, -2, 5}, {0, 1, -2, 4}, {0, 1, -2, 2}, {0, 1, -3, 5},
		{0, 1, -3, 4}, {0, 1, -3, 2}, {0, 1, -4, 5}, {0, 1, -4, 4},
		{0, 1, -4, 2}, {0, 1, -5, 5}, {0, 1, -5, 4},};
	public static final int[][] FLOOR = {{0, 0, 0}, {1, 0, 1}, {0, 0, 1},
		{-1, 0, 1}, {1, 0, 0}, {-1, 0, 0}, {1, 0, -1}, {0, 0, -1}, {-1, 0, -1},
		{2, 0, 2}, {1, 0, 2}, {0, 0, 2}, {-1, 0, 2}, {-2, 0, 2}, {2, 0, 1},
		{-2, 0, 1}, {2, 0, 0}, {-2, 0, 0}, {2, 0, -1}, {-2, 0, -1}, {2, 0, -2},
		{1, 0, -2}, {0, 0, -2}, {-1, 0, -2}, {-2, 0, -2}, {3, 0, 3}, {2, 0, 3},
		{1, 0, 3}, {0, 0, 3}, {-1, 0, 3}, {-2, 0, 3}, {-3, 0, 3}, {3, 0, 2},
		{-3, 0, 2}, {3, 0, 1}, {-3, 0, 1}, {3, 0, 0}, {-3, 0, 0}, {3, 0, -1},
		{-3, 0, -1}, {3, 0, -2}, {-3, 0, -2}, {3, 0, -3}, {2, 0, -3},
		{1, 0, -3}, {0, 0, -3}, {-1, 0, -3}, {-2, 0, -3}, {-3, 0, -3},};
	public static final int[][] NAZI = {{0, 1, 0, 5}, {1, 1, 0, 5},
		{0, 1, 0, 1}, {0, 2, 0, 1}, {0, 3, 0, 5}, {0, 3, 0, 4}, {1, 3, 0, 5},
		{-1, 3, 0, 4}, {-2, 3, 0, 0}, {-2, 2, 0, 0}, {0, 3, 0, 1},
		{2, 3, 0, 1}, {2, 4, 0, 1}, {0, 4, 0, 1}, {0, 5, 0, 4}, {-1, 5, 0, 4},};
	public static final int[][] PENIS = {{1, 0, 0, 1}, {1, 0, 1, 1},
		{0, 0, 1, 1}, {0, 1, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}, {0, 1, 1, 1},
		{0, 2, 0, 1}, {1, 2, 0, 1}, {1, 2, 1, 1}, {0, 2, 1, 1}, {0, 3, 0, 1},
		{1, 3, 0, 1}, {1, 3, 1, 1}, {0, 3, 1, 1}, {0, 4, 0, 1}, {1, 4, 0, 1},
		{1, 4, 1, 1}, {0, 4, 1, 1}, {0, 5, 0, 1}, {1, 5, 0, 1}, {1, 5, 1, 1},
		{0, 5, 1, 1}, {0, 6, 0, 1}, {1, 6, 0, 1}, {1, 6, 1, 1}, {0, 6, 1, 1},
		{0, 7, 0, 1}, {1, 7, 0, 1}, {1, 7, 1, 1}, {0, 7, 1, 1}, {2, 0, -1, 1},
		{-1, 0, -1, 1}, {3, 0, -1, 1}, {-2, 0, -1, 1}, {3, 0, -2, 1},
		{-2, 0, -2, 1}, {2, 0, -2, 1}, {-1, 0, -2, 1}, {2, 1, -1, 1},
		{-1, 1, -1, 1}, {3, 1, -1, 1}, {-2, 1, -1, 1}, {3, 1, -2, 1},
		{-2, 1, -2, 1}, {2, 1, -2, 1}, {-1, 1, -2, 1},};
	public static final int[][] PILLAR = {{0, 0, 0}, {0, 1, 0}, {0, 2, 0},
		{0, 3, 0}, {0, 4, 0}, {0, 5, 0}, {0, 6, 0},};
	public static final int[][] WALL = {{3, 0, 0}, {2, 0, 0}, {1, 0, 0},
		{0, 0, 0}, {-1, 0, 0}, {-2, 0, 0}, {-3, 0, 0}, {3, 1, 0}, {2, 1, 0},
		{1, 1, 0}, {0, 1, 0}, {-1, 1, 0}, {-2, 1, 0}, {-3, 1, 0}, {3, 2, 0},
		{2, 2, 0}, {1, 2, 0}, {0, 2, 0}, {-1, 2, 0}, {-2, 2, 0}, {-3, 2, 0},
		{3, 3, 0}, {2, 3, 0}, {1, 3, 0}, {0, 3, 0}, {-1, 3, 0}, {-2, 3, 0},
		{-3, 3, 0}, {3, 4, 0}, {2, 4, 0}, {1, 4, 0}, {0, 4, 0}, {-1, 4, 0},
		{-2, 4, 0}, {-3, 4, 0}, {3, 5, 0}, {2, 5, 0}, {1, 5, 0}, {0, 5, 0},
		{-1, 5, 0}, {-2, 5, 0}, {-3, 5, 0}, {3, 6, 0}, {2, 6, 0}, {1, 6, 0},
		{0, 6, 0}, {-1, 6, 0}, {-2, 6, 0}, {-3, 6, 0},};
	public static final int[][] WURST = {{0, 1, 0, 5}, {1, 1, 0, 5},
		{0, 1, 0, 4}, {-1, 1, 0, 4}, {0, 1, 0, 1}, {1, 1, 0, 1}, {-1, 1, 0, 1},
		{2, 1, 0, 1}, {-2, 1, 0, 1}, {2, 2, 0, 5}, {-2, 2, 0, 4}, {0, 2, 0, 3},
		{1, 2, 0, 3}, {-1, 2, 0, 3}, {2, 2, 0, 3}, {-2, 2, 0, 3}, {0, 2, 0, 2},
		{1, 2, 0, 2}, {-1, 2, 0, 2}, {2, 2, 0, 2}, {-2, 2, 0, 2}, {0, 2, 0, 1},
		{1, 2, 0, 1}, {-1, 2, 0, 1}, {2, 2, 0, 1}, {-2, 2, 0, 1},};
}
