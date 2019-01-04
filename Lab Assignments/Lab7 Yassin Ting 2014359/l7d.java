class l7d{
	public static void main(String[] args){

		int score = 10;
		int corNum = 5;
		int newnum = 3;
		int input = "H";

		corNum = (int)(Math.random) * 10) + 1;
	

		do{
			System.out.print("Current Number " + corNum);
			System.out.print("<H>igher or <L>ower");

			input = in.nextLine();

			newNum = (int)(Math.random() * 10) + 1;
		}if(newNum == corNum){
			System.out.print("Draw");
			else if(newNum>corNum && input.equals("H"){
				System.out.print("Win");
				score++;
				else if(newNum<corNum && input.equals("H"){
					System.out.print("Lose");
					score--;
				}
				corNum = newNum;
			}
			while(score > 10 );
				}
			}
		}
	}
}
