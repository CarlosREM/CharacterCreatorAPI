/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

import java.util.TreeMap;

/**
 *
 * @author Fabricio Ceciliano
 */
public interface ILookable {
    public AAppearance getAppearance(int level);
    public TreeMap<Integer,AAppearance> getAppearances();
    public void setAppearance(int level, AAppearance appearance);
}
