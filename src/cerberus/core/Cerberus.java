package cerberus.core;

import org.bukkit.plugin.java.JavaPlugin;

public class Cerberus extends JavaPlugin {

	private static Cerberus instance;
	
	public void onEnable(){
		instance = this;
	}
	
	/**
	 * @return Cerberus plugin instance
	 */
	public static Cerberus getInstance(){
		return instance;
	}
	
}
