package com.design.template;

import com.design.template.interfaces.Game;
import com.design.template.object.ChessGame;
import com.design.template.object.PoolGame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "=============Game Engine=============" );
        Game chess = new ChessGame();
        chess.play();
        
        Game pool = new PoolGame();
        pool.play();
    }
}
