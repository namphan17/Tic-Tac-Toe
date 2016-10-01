



public class TicTacToeAI
{
	public static void mark(int[][] a, int x, int y, int t)//This method help us make a specific move for the game.
	{	
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (i == x && j == y)
				{
				a[i][j] = t;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static boolean top(int[] a)
	{
		if ((a[0] != 0) && (a[0] == a[1]) && (a[0] == a[2])){return true;}
		else{return false;}
			
	}
	public static boolean bot(int[] a)
	{
		if ((a[6] != 0) && (a[6] == a[7]) && (a[6] == a[8])){return true;}
		else{return false;}
			
	}
	public static boolean right(int[] a)
	{
		if ((a[2] != 0) && (a[2] == a[5] && a[2] == a[8])){return true;}
		else{return false;}
			
	}
	public static boolean left(int[] a)
	{
		if ((a[0] != 0) && (a[0] == a[3]) && (a[3] == a[6])){return true;}
		else{return false;}
			
	}
	public static boolean diag1(int[] a)
	{
		if ((a[0] != 0) && (a[0] == a[4]) && (a[4] == a[8])){return true;}
		else{return false;}
			
	}
	public static boolean diag2(int[] a)
	{
		if ((a[2] != 0) && (a[2] == a[4]) && (a[4] == a[6])){return true;}
		else{return false;}
			
	}
	public static boolean midver(int[] a)
	{
		if ((a[1] != 0) && (a[1] == a[4]) && (a[4] == a[7])){return true;}
		else{return false;}
			
	}
	public static boolean midhor(int[] a)
	{
		if ((a[3] != 0) && (a[3] == a[4]) && (a[4] == a[5])){return true;}
		else{return false;}
			
	}
	public static boolean checkwin(int[] a)
	{
		if (top(a) || bot(a) || right(a) || left(a) || diag1(a) || diag2(a) || midver(a) || midhor(a))
		{	
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static boolean p1w(int[] a)
	{
		if (top(a)) 		{ if (a[1] == 1)  return true;		else return false;}
		if (bot(a)) 		{ if (a[7] == 1)  return true;		else return false;}
		if (right(a)) 		{ if (a[5] == 1)  return true;		else return false;}
		if (left(a)) 		{ if (a[3] == 1)  return true;		else return false;}
		if (diag1(a)) 		{ if (a[4] == 1)  return true;		else return false;}
		if (diag2(a)) 		{ if (a[4] == 1)  return true;		else return false;}
		if (midver(a)) 		{ if (a[4] == 1)  return true;		else return false;}
		if (midhor(a)) 		{ if (a[4] == 1)  return true;		else return false;}
		else return false;
	}
	public static boolean p2w(int[] a)
	{
		if (top(a)) 		{ if (a[1] == 2)  return true;		else return false;}
		if (bot(a)) 		{ if (a[7] == 2)  return true;		else return false;}
		if (right(a)) 		{ if (a[5] == 2)  return true;		else return false;}
		if (left(a)) 		{ if (a[3] == 2)  return true;		else return false;}
		if (diag1(a)) 		{ if (a[4] == 2)  return true;		else return false;}
		if (diag2(a)) 		{ if (a[4] == 2)  return true;		else return false;}
		if (midver(a)) 		{ if (a[4] == 2)  return true;		else return false;}
		if (midhor(a)) 		{ if (a[4] == 2)  return true;		else return false;}
		else return false;
	}
	
	
	public static void mindset(firstMove[] Moves)
	{
		//make an array of best moves for Player2, named Moves.
		
		
		
		
		
		
		for (int move1 = 0; move1 < 9; move1++)
		{
			firstMove fm = new firstMove();
			Moves[move1] = fm;
			fm.play(move1);
		
			int i2 = 0;
			for (int move2 = 0; move2 < 9; move2++)
			{	
				if (move2 !=move1)
				{	secondMove sm = new secondMove();
					fm.a[i2] = sm;
					sm.state[move1] = 1;
					sm.play(move2);
					
					i2++;
					int i3 = 0;
					for (int move3 = 0; move3 < 9; move3++)
					{
						if (move3 != move1 && move3 != move2)
						{
							thirdMove thirm = new thirdMove();
							sm.a[i3] = thirm;
							thirm.state[move1] = 1; thirm.state[move2] = 2;
							thirm.play(move3);
							
							i3++;
							int i4 = 0;
							for (int move4 = 0; move4 < 9; move4++)
							{
								if (move4 != move1 && move4 != move2 && move4 != move3)
								{
									fourthMove form = new fourthMove();
									thirm.a[i4] = form;
									form.state[move1] = 1; form.state[move2] = 2; form.state[move3] = 1;
									form.play(move4);
									
									i4++;	
									int i5 = 0;
		
									
									loop1: for (int move5 = 0; move5 < 9; move5++)
									{
										if (move5 != move1 && move5 != move2 && move5 != move3 && move5 != move4)
										{
											fifthMove fifm = new fifthMove();
											form.a[i5] = fifm;
											fifm.state[move1] = 1; fifm.state[move2] = 2; fifm.state[move3] = 1; fifm.state[move4] = 2;
											fifm.play(move5);
											if (checkwin(fifm.state))
											{
												fifm.p1w = 100000000; form.p1w = fifm.p1w; 
												thirm.p1w = fifm.p1w + thirm.p1w; 
												sm.p1w = thirm.p1w + fifm.p1w + thirm.p1w; 
												fm.p1w = sm.p1w + thirm.p1w + fifm.p1w + thirm.p1w;
												break loop1;
											}
											
											i5++;
											int i6 = 0;
									
									
											loop2: for (int move6 = 0; move6 < 9; move6++)
											{
												if (move6 != move1 && move6 != move2 && move6 != move3 && move6 != move4 && move6 != move5)
												{
													sixthMove sixm = new sixthMove();
													fifm.a[i6] = sixm;
													sixm.state[move1] = 1; sixm.state[move2] = 2; sixm.state[move3] = 1; sixm.state[move4] = 2; sixm.state[move5] = 1;
													sixm.play(move6);
													if (checkwin(sixm.state))
													{
														sixm.p1w = -1000000; fifm.p1w = sixm.p1w; form.p1w--; thirm.p1w--; sm.p1w--; fm.p1w--;
														break loop2;
													}
													
													i6++;
													int i7 = 0;
												
													
													loop3: for (int move7 = 0; move7 < 9; move7++)
													{
														if (move7!= move1 && move7 != move2 && move7 != move3 && move7 != move4 && move7 != move5 && move7 != move6)
														{
															seventhMove sevm = new seventhMove();
															sixm.a[i7] = sevm;
															sevm.state[move1] = 1; sevm.state[move2] = 2; sevm.state[move3] = 1; sevm.state[move4] = 2; sevm.state[move5] = 1; sevm.state[move6] = 2;
															sevm.play(move7);
															if (checkwin(sevm.state))
															{
																sevm.p1w = 1000000; sixm.p1w = sevm.p1w; 
																fifm.p1w = sixm.p1w + sevm.p1w; 
																form.p1w = fifm.p1w + sixm.p1w + sevm.p1w; 
																thirm.p1w = form.p1w + fifm.p1w + sixm.p1w + sevm.p1w; 
																sm.p1w = thirm.p1w + form.p1w + fifm.p1w + sixm.p1w + sevm.p1w; 
																fm.p1w = sm.p1w + thirm.p1w + form.p1w + fifm.p1w + sixm.p1w + sevm.p1w;
																break loop3;
															}
															
															i7++;
															int i8 = 0;
															
															
															loop4: for (int move8 = 0; move8 < 9; move8++)
															{
																if (move8!= move1 && move8 != move2 && move8 != move3 && move8 != move4 && move8 != move5 && move8 != move6 && move8 != move7)
																{
																	eighthMove eim = new eighthMove();
																	sevm.a[i8] = eim;
																	eim.state[move1] = 1; eim.state[move2] = 2; eim.state[move3] = 1; eim.state[move4] = 2; eim.state[move5] = 1; eim.state[move6] = 2; eim.state[move7] = 1;
																	eim.play(move8);
																	if (checkwin(eim.state))
																	{
																		eim.p1w = -10000; sevm.p1w = eim.p1w; sixm.p1w--; fifm.p1w--; form.p1w--; thirm.p1w--; sm.p1w--; fm.p1w--;
																		break loop4;
																	}
																	
																	i8++;
																	
																	
																	loop5: for (int move9 = 0; move9 < 9; move9++)
																	{
																		if (move9!= move1 && move9 != move2 && move9 != move3 && move9 != move4 && move9 != move5 && move9 != move6 && move9 != move7 && move9 != move8)
																		{
																			ninethMove ninem = new ninethMove();
																			eim.a[0] = ninem;
																			ninem.state[move1] = 1; ninem.state[move2] = 2; ninem.state[move3] = 1; ninem.state[move4] = 2; ninem.state[move5] = 1; ninem.state[move6] = 2; ninem.state[move7] = 1; ninem.state[move8] = 2;
																			ninem.play(move9);
																			if (checkwin(ninem.state))
																			{
																				ninem.p1w = 10000; eim.p1w = ninem.p1w; 
																				sevm.p1w = eim.p1w + ninem.p1w; 
																				sixm.p1w = sevm.p1w + eim.p1w + ninem.p1w; 
																				fifm.p1w = sixm.p1w + sevm.p1w + eim.p1w + ninem.p1w; 
																				form.p1w = fifm.p1w + sixm.p1w + sevm.p1w + eim.p1w + ninem.p1w; 
																				thirm.p1w = form.p1w + fifm.p1w + sixm.p1w + sevm.p1w + eim.p1w + ninem.p1w; 
																				sm.p1w = thirm.p1w + form.p1w + fifm.p1w + sixm.p1w + sevm.p1w + eim.p1w + ninem.p1w; 
																				fm.p1w = sm.p1w + thirm.p1w + form.p1w + fifm.p1w + sixm.p1w + sevm.p1w + eim.p1w + ninem.p1w;
																				break loop5;
																			}
																			else
																			{
																				ninem.draw++; eim.draw++; sevm.draw++; sixm.draw++; fifm.draw++; form.draw++; thirm.draw++; sm.draw++; fm.draw++;
																			}
																			
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		/*
		System.out.println(Moves[4].p1w);
		System.out.println();
		System.out.println(Moves[0].a[4].a[0].a[1].a[0].p2w + " and " + Moves[0].p1w + " and " + Moves[4].a[2].draw);
		//each one store an array of the game state.
		*/
	}

}
