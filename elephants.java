public class elephant {
	
	public static void main(String[] args) {
		
	
	int elephants = 0;
	int answer =0;
	int fullCar =0;
	String elephantsNum = "";
	
	//while loop will keep asking questions as long as the user is answering yes
	while(answer== 0 && fullCar == 0) {
		
		//Ask the user if they want to enter the car?
		answer = JOptionPane.showConfirmDialog(null,
				"wanna enter the car?", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);
		
		//when the user selects yes
		if(answer == 0) {
			elephants++;
			elephantsNum = "there are now "+elephants+ "elephants in the car";
			
		}
		//check if there are more cars in the queue?
		answer = JOptionPane.showConfirmDialog(null,
				"are there more cars in the queue? ", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);
		fullCar = JOptionPane.showConfirmDialog(null,
				"is there room in the car for more? ", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);
		}//end while

	}//end main
}//end class
