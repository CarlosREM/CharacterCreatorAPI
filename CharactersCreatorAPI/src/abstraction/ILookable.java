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
    public IAppearance getAppearance(int level);
    public TreeMap<Integer,IAppearance> getAppearances();
    public void setAppearance(int level, IAppearance appearance);
}