package statssystem.ClassList;

import org.bukkit.entity.Player;

import statssystem.SetUpClass.GameClass;
import statssystem.SetUpClass.GameStats;
import statssystem.SetUpClass.Siuuuu;

public class Assassin
{
	public void AboutClass(Player player)
	{
		GameClass assassin = new GameClass();
		assassin.className = "Assassin";
		assassin.baseStats = new GameStats();
		assassin.baseStats.maxHealth = 100.0;
		assassin.baseStats.maxMana = 100.0;
		assassin.baseStats.baseDamage = 100.0;
		
		Siuuuu p = new Siuuuu();
		p.player = player; // org.bukkit.Player
		p.selectedClass = assassin;
	}
}
