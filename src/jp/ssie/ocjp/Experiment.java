package jp.ssie.ocjp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* 									
 *		実験用								
 */

public class Experiment {
	public static void main(String[] args) {			
		//
	     Player player = new Player("勇者", 50, 100);
		 Enemy enemy1 = new Enemy("スライム", 20, 50);
		 Enemy enemy2 = new Enemy("ドラゴン", 60, 150);

		        ArrayList<Character> characters = new ArrayList<>();
		        characters.add(player);
		        characters.add(enemy1);
		        characters.add(enemy2);
		        Collections.shuffle(characters);

		        for (Character character : characters) {
		            if (character instanceof Player) {
		                Player p = (Player) character;
		                Enemy target = enemy1;
		                p.attack(target);
		            } else if (character instanceof Enemy) {
		                Enemy e = (Enemy) character;
		                Player target = player;
		                e.attack(target);
		            }
		        }
		    }
		}
		
		//
		class Player extends Character {
		    public Player(String name, int attack, int hp) {
		        super(name, attack, hp);
		    }

		    public void attack(Enemy enemy) {
		    	Random random = new Random();
		        double randomNumber = 0.8 + (0.4 * random.nextDouble());
		        double damage =  Math.ceil(this.attack * randomNumber) - (enemy.defense / 2);
		        enemy.hp -= damage;
		        System.out.println(this.name + "の攻撃！" + enemy.name + "に" + damage + "のダメージ！");
		    }
		}
		
		//
		class Enemy extends Character {
		    public Enemy(String name, int attack, int hp) {
		        super(name, attack, hp);
		    }

		    public void attack(Player player) {
		    	Random random = new Random();
		        double randomNumber = 0.8 + (0.4 * random.nextDouble());
		        double damage = Math.ceil(this.attack * randomNumber) - (player.defense / 2);
		        player.hp -= damage;
		        System.out.println(this.name + "の攻撃！" + player.name + "に" + damage + "のダメージ！");
		    }
		}
		
		//
		class Character {
		    protected String name;
		    protected int attack;
		    protected int defense;
		    protected int hp;

		    public Character(String name, int attack, int hp) {
		        this.name = name;
		        this.attack = attack;
		        this.defense = 10; // 仮の数値
		        this.hp = hp;
		    }

}

