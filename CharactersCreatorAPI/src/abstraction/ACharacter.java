/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Fabricio Ceciliano
 */

public abstract class ACharacter implements IPrototype, ILookable{
    private String name = "Average Joe";
    private TreeMap<Integer,IAppearance> appearances = new TreeMap<>();
    private int currentHealthPoints = 100;
    private int maxHealthPoints = 100;
    private int hitsPerUnit = 5;
    private int level = 1;
    private int tiles = 1;
    private int unlockLevel = 1;
    private int cost = 1;
    private ArrayList<AWeapon> weapons = new ArrayList<>();
    private int coordinateX;
    private int coordinateY;

    public ACharacter(){
        
    }
    
    public ACharacter(String name, TreeMap<Integer,IAppearance> appearances, int currentHealthPoints, int maxHealthPoints, int hitsPerUnit, int level, int tiles, int unlockLevel, int cost, ArrayList<AWeapon> weapons, int coordinateX, int coordinateY) {
        this.name = name;
        this.appearances = appearances;
        this.currentHealthPoints = currentHealthPoints;
        this.maxHealthPoints = maxHealthPoints;
        this.hitsPerUnit = hitsPerUnit;
        this.level = level;
        this.tiles = tiles;
        this.unlockLevel = unlockLevel;
        this.cost = cost;
        this.weapons = weapons;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }
    public void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }
    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getHitsPerUnit() {
        return hitsPerUnit;
    }
    public void setHitsPerUnit(int hitsPerUnit) {
        this.hitsPerUnit = hitsPerUnit;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getTiles() {
        return tiles;
    }
    public void setTiles(int tiles) {
        this.tiles = tiles;
    }

    public int getUnlockLevel() {
        return unlockLevel;
    }
    public void setUnlockLevel(int unlockLevel) {
        this.unlockLevel = unlockLevel;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public ArrayList<AWeapon> getWeapons() {
        return weapons;
    }
    public void setWeapons(ArrayList<AWeapon> weapons) {
        this.weapons = weapons;
    }

    public int getCoordinateX() {
        return coordinateX;
    }
    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }
    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    
    @Override
    public IAppearance getAppearance(int level){
        return appearances.floorEntry(level).getValue();
    }
    @Override
    public void setAppearance(int level, IAppearance appearance) {
        if(this.appearances.containsKey(level))
            this.appearances.replace(level, appearance);
        else
            this.appearances.put(level, appearance);
    }
     
    @Override
    public TreeMap<Integer,IAppearance> getAppearances() {
        return appearances;
    }

    public abstract void useWeapon(AWeapon weapon, ACharacter character);
    public abstract void useWeapon(int index, ACharacter character) throws IndexOutOfBoundsException;
    public abstract void takeDamage(int damage);
    public abstract void takeHealth(int healthPoints);
    public abstract void levelUp();
    public abstract void levelDown();
    public abstract void addWeapon(AWeapon weapon);
    public abstract void deleteWeapon(AWeapon weapon);
    public abstract void deleteWeapon(int index) throws IndexOutOfBoundsException;
    public abstract void levelUpWeapons();
    public abstract void levelDownWeapons();
    public abstract void move(int x, int y);
}
