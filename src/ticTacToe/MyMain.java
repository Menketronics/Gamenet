package ticTacToe;


import gameNet.*;



// ***************************************************
public class MyMain extends GameCreator{   

	public GameNet_CoreGame createGame()
	{
		return new MyGame();
	}


	public static void main(String[] args) 
	{   
		MyMain myMain = new MyMain(); 

			
		GameNet_UserInterface  myUserInterface = 
    	  		new MyUserInterface();
		 

		myMain.enterGame(myUserInterface); 
	}// end of main
}// end of class
