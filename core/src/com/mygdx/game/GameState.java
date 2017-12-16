/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Shape2D;

/**
 *
 * @author Oscar
 */
public abstract class GameState {
    
    
    protected Game game;
    protected  GameStateManager gsm;
    protected  SpriteBatch sb;
    protected  ShapeRenderer renderer;
    protected OrthographicCamera camera;
    
    //constructor
    public GameState(GameStateManager gsm){
        this.gsm=gsm;
        
        game=gsm.GetGame();
        sb=game.GetSb();
        renderer=game.GetRender;
        camera=game.GetCamera();
        
    }
    
    
    public abstract void HandleInput();// eventos de las teclas
    public abstract void Update(float dt);// actualiza el juego dt= tiempo de actualziado
    public abstract void render();// render donde se dibuja el juego
    public abstract void dispose(); //liberar recursos de la memoria
    
    
    
}
