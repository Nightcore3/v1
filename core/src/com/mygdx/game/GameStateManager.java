/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;
import java.util.Stack;
/**
 *
 * @author Oscar
 */
public class GameStateManager {
    
    private Game game;
    private Stack<GameState> gameStates;
    
    private static final int NIVEL1=1;
    
    public GameStateManager(Game game){
        this.game=game;
        gameStates=new Stack<GameState>();
    }
    
    public Game Getgame(){
        
        return game;
    }
    
    public void Update(float dt){
        gameStates.peek().Update(dt);
        
    }
    public void render(){
        gameStates.peek().render();
    }
    
    public void dispose(){
        gameStates.peek().dispose();
    }
    
    //metodos para manejar la pila 
    private void PopState(){
        GameState g=gameStates.pop();
        g.dispose();
    }
    
    
    
    private GameState GetState(int state){
        if(state==NIVEL1)
            return null;
        return null;
        
    }
    
    public void SetState(int state){
        PopState();
        pushState(state);
    }
    
    public void pushState(int state){
        gameStates.push(GetState(state));
    }
    
    
    
}
