package com.carsonjf8.game.level.tiles;

import com.carsonjf8.game.gfx.Screen;
import com.carsonjf8.game.level.Level;

public class BasicTile extends Tile {

	protected int tileId;
	protected int tileColor;
	
	public BasicTile(int id, int x, int y, int tileColor, int levelColor) {
		super(id, false, false, levelColor);
		this.tileId = x + y * 32;
		this.tileColor = tileColor;
	}
	
	public void tick() {}
	
	public void render(Screen screen, Level level, int x, int y) {
		screen.render(x,  y,  tileId,  tileColor, 0x00, 1);
	}
}
