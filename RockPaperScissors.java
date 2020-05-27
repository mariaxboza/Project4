package sweeper;

import javax.swing.ImageIcon;

import resources.EmptyClass;

public class RockPaperScissors {
	
	JOP w = new JOP();
	String[] optionStart = {"Player VS. Player", "Player VS. Computer", "Rules", "Exit"};
	ImageIcon start = new ImageIcon(EmptyClass.class.getResource("rock-paper-scissors-items.png"));
	ImageIcon question = new ImageIcon(EmptyClass.class.getResource("Question.png"));
	ImageIcon rock = new ImageIcon(EmptyClass.class.getResource("Rock.png"));
	ImageIcon paper = new ImageIcon(EmptyClass.class.getResource("Paper.png"));
	ImageIcon scissors = new ImageIcon(EmptyClass.class.getResource("Scissors.png"));
	ImageIcon[] plays = {rock, paper, scissors};
	String p1 = "";
	String p2 = "";
	int p1Wins = 0;
	int p2Wins = 0;
	int p1p = 0;
	int p2p = 0;
	ImageIcon winner = new ImageIcon(EmptyClass.class.getResource("winner.jpeg"));
	ImageIcon rules = new ImageIcon(EmptyClass.class.getResource("Rules.png"));
	int StartOption = 0;
	

	public RockPaperScissors()
	{
		while(StartOption != -1 && p1p != -1 && p2p != -1)
		{
		StartOption = w.option(optionStart, null, "How do you want to play?", start);
		if(StartOption == 0)
		{
			PlayerVSPlayer();
		}
		else if (StartOption == 1)
		{
			PlayerVSComputer();
		}
		else if (StartOption == 2)
		{
			w.msg(null, "Rules", rules);
		}
		else
			System.exit(0);
		}
	}
	
	public void PlayerVSComputer()
	{
		p1 = w.in("What is your name?", "Name", question);
		p2 = "Computer";
		while(p1p != -1)
		{
			p1p = w.option(plays, p1 + " what is your move?");
			
			if ( p1p != -1)
			{
				p2p = (int)(Math.random() * 3);
				if(p2p == 0)
					w.msg("The computer has picked rock", "Computers play", rock);
				else if(p2p == 1)
					w.msg("The computer has picked paper", "Computers play", paper);
				else
					w.msg("The computer has picked scissors", "Computers play", scissors);
			
				play(p1p, p2p);
			}
		}


	}
	
	public void PlayerVSPlayer()
	{
		p1 = w.in("Player One what is your name?", "Name", question);
		p2 = w.in("Player Two what is your name?", "Name", question);
		while(p1p != -1 && p2p != -1)
		{
			p1p = w.option(plays, p1 + " what is your move?");
			if(p1p != -1)
			{
				p2p = w.option(plays, p2 + " what is your move?");
					if(p2p != -1)
						play(p1p, p2p);
			}
		}
	}
	
	public void play(int p1p, int p2p)
	{	
		if(p1p == 0 && p2p == 1)
		{
			w.msg(p2 + " has won!", "Winner!", winner);
			p2Wins++;
			w.msg(p1 +" has " + p1Wins+ " points" + "\n" + p2 + " has " + p2Wins + " points", "Score Board");
		}
		else if(p1p == 0 && p2p == 2)
		{
			w.msg(p1 + " has won!", "Winner!", winner);
			p1Wins++;
			w.msg(p1 +" has " + p1Wins+ " points" + "\n" + p2 + " has " + p2Wins + " points", "Score Board");
		}
		else if(p1p == 1 && p2p == 0)
		{
			w.msg(p1 + " has won!", "Winner!", winner);
			p1Wins++;
			w.msg(p1 +" has " + p1Wins+ " points" + "\n" + p2 + " has " + p2Wins + " points", "Score Board");
		}
		else if(p1p == 1 && p2p == 2)
		{
			w.msg(p2 + " has won!", "Winner!", winner);
			p2Wins++;
			w.msg(p1 +" has " + p1Wins+ " points" + "\n" + p2 + " has " + p2Wins + " points", "Score Board");
		}
		else if(p1p == 2 && p2p == 0)
		{
			w.msg(p2 + " has won!", "Winner!", winner);
			p2Wins++;
			w.msg(p1 +" has " + p1Wins+ " points" + "\n" + p2 + " has " + p2Wins + " points", "Score Board");
		}
		else if(p1p == 2 && p2p == 1)
		{
			w.msg(p1 + " has won!", "Winner!", winner);
			p1Wins++;
			w.msg(p1 +" has " + p1Wins+ " points" + "\n" + p2 + " has " + p2Wins + " points", "Score Board");
		}
		else
		{
			w.msg("It was a tie!", "Winner!", winner);
			w.msg(p1 +" has " + p1Wins+ " points" + "\n" + p2 + " has " + p2Wins + " points", "Score Board");
		}
		
	}
		
}
