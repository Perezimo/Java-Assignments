
import java.util.Scanner;
public class NoKiaMenu{

public static void main (String [ ] args){
int testing;
do{
	Scanner inputCollector = new Scanner(System.in);
 	
	String mainMenu = """

Welcome to Nokia 3310 Menu

	Select 1 for Phone book
 	Select 2 for Messages
 	Select 3 for Chat
 	Select 4 for Call reports
	Select 5 for Tones
	Select 6 for Settings
	Select 7 for Call divert
	Select 8 for Games
	Select 9 for Calculator
	Select 10 for Reminder
	Select 11 for Clock
	Select 12 for Profile
	Select 13 for Sim Services
	

	""";

		System.out.println(mainMenu);


		int mainMenuChoice = inputCollector.nextInt();
		
		switch(mainMenuChoice){
   
		case 1 : System.out.println("Phone Book Menu");
	
	String phoneBookMenu = """
	
	Select 1 for Search 
	Select 2 for Service 
	Select 3 for Add name
	Select 4 for Erase
	Select 5 for Edit
	Select 6 for Assign tones
	Select 7 for Send b'card
	Select 8 for Options
	Select 9 Speed dials
	Select 10 Voice tags
		
	""";
		}
	

		System.out.println(phoneBookMenu);

		int phoneBook = inputCollector.nextInt();
	
		switch(phoneBook){

			case 1 : System.out.println("Search"); break; 
			case 2 : System.out.println("Service"); break; 
			case 3 : System.out.println("address"); break;

			case 4 : System.out.println("Erase"); break; 
			case 5 : System.out.println("Edit"); break;
			case 6 : System.out.println("Assign tones"); break; 
		
			case 7 : System.out.println("Send b'card"); break; 
			case 8 : System.out.println("Options"); 
					String option = """
							1. Type of view
							2. Memory status
							""";
						System.out.println(option);
					int options = inputCollector.nextInt();
				break;
			case 9 : System.out.println("Speed dials"); break; 
			case 10 : System.out.println("Voice tags"); break;
		
		default: System.out.println("No menu selected");
	                 
		}
		break;
		
	

		}
	
		case 2 : System.out.println("Message Menu");

		String messageMenu = """
	
		Select 1 Write Messages
		Select 2 Inbox 
		Select 3 Outbox
		Select 4 Picture messages
		Select 5 Templates
		Select 6 Smileys
		Select 7 Message Settings
		Select 8 Info service
		Select 9 Voice mailbox number
		Select 10 Service command editor
		
		""";
		        
			System.out.println(messageMenu);

			

		int messages = inputCollector.nextInt();
		
		switch(messages){

			case 1 : System.out.println("Write messages"); break; 
			case 2 : System.out.println("Inbox"); break; 
			case 3 : System.out.println("Outbox"); break;

			case 4 : System.out.println("Picture messages"); break; 
			case 5 : System.out.println("Templates"); break;
			case 6 : System.out.println("Smileys"); break; 
		
			case 7 : System.out.println("Messages setting"); 
					String Messagesetting = """
					Press 1 Set1
					Press 2 Common
						""";
			
				System.out.println(Messagesetting);
				
				int messageSets = inputCollector.nextInt();
				switch (messageSets) {	
							case 1 : System.out.println("Set1");
							String setMenu = """
							1.Message centre number
							2. Messages sent as
							3. Message valididty
							
							""";
						
						
						System.out.println(setMenu);
							
						case 2 : System.out.println("Common");
						String Common = """
							1.Delivery reports
							2. Reply via same centre
							3. Character support
								
							""";

						System.out.println(Common);
					default: System.out.println("No value");
				}
				break;
			case 8 : System.out.println("Info service"); break;
			case 9: System.out.println("Voice mailbox number"); break; 
			case 10 : System.out.println("Service command  editor"); break;
		 
			default: System.out.println("No menu selected");
	
		}
		break;

			case 3 : System.out.println("Chat");

		String chatMenu = "Select 1 to Chat";

			System.out.println(chatMenu);

			int chats = inputCollector.nextInt();
		
		switch(chats){
			
			case 1 : System.out.println("Chat"); break;
		default: System.out.println("No menu selected");
		}
		break;

			
			case 4 : System.out.println("Call register");
		
		String callRegister = """

			select 1 Missed calls
			select 2 Received calls
			select 3 Dialled numbers
			select 4 Erase recent call lists
			select 5 Show call duration	
			select 6 Show call costs
			select 7 Call cost settings
			select 8 Prepaid credit

			""";
				System.out.println(callRegister);
	
			int callRegisters = inputCollector.nextInt();
			
			switch(callRegisters){

				case 1: System.out.println("Missed calls"); break;
				case 2: System.out.println("Received calls"); break;
				case 3: System.out.println("Dialled number "); break;
				case 4: System.out.println("Erase recent calls"); break;
				case 5: System.out.println("Show call duration"); break;
				case 6: System.out.println("Show call costs"); break;
				case 7: System.out.println("Call cost settings"); break;
				case 8: System.out.println("Prepaid credit"); break;
					
				default : System.out.println("No menu selected"); break;
				}
			break;
			
		case 5: System.out.println("Tones");

		String Tones = """


				Select 1 Ringing tone
				Select 2 Ringing volume
				Select 3 Incoming call alert
				Select 4 Composer
				Select 5 Message alert tone
				Select 6 Keypad tones
				Select 7 Warning and game tones
				Select 8 Vibrating alert
				Select 9 Screen saver
				
				""";
					
				System.out.println(Tones);

		int tones = inputCollector.nextInt();

		switch(tones){

				case 1: System.out.println("Ring tone"); break;
				case 2: System.out.println("Ringing volume"); break;
				case 3: System.out.println("Incoming call  alert"); break;
				case 4: System.out.println("Composer"); break;
				case 5: System.out.println("Message alert tone"); break;
				case 6: System.out.println("Keypad tones"); break;
				case 7: System.out.println("Warning and game tones"); break;
				case 8: System.out.println("Vibrating alert"); break;
				case 9: System.out.println("Screen saver"); break;
					
				default : System.out.println("No menu selected"); break;
				}
				break;

		case 6: System.out.println("Settings");
			
		String setting = """

				Select 1 Call settings
				Select 2 Phone settings
				Select 3 Security settings
				Select 4 Restore factory settings

				""";
					
				System.out.println(setting);

	
			int settingLine = inputCollector.nextInt();
				
		
		switch(settingLine){

						case 1 : System.out.println("Call Settings");
						    String callSettings = """
 
							1.Automatic redial
							2. Speed dialling
							3. Call waiting options
							4. Own number sending
							5. Phone line in use
							6. Automatic answer
						""";

						System.out.println(callSettings);
						int callSetettingLine = inputCollector.nextInt();
						break;
		
						case 2 :System.out.println("Phone settings");
						    String phoneSettings = """	
							
							1. Language 
							2. Cell info display
							3. Welcome note
							4. Network selection
							5. Lights
							6. Confirm SIM service actions
								""";

						System.out.println(phoneSettings);
						int photoSettingLine = inputCollector.nextInt();
		
						break;	
	
						case 3 :System.out.println("Security settings");
						
						String securitySetting = """ 

							1. PIN code request
							2. Call barring service 
							3. Fixed dialling
							4. Closed user group
							5. Phone Security
							6. Change access codes

							""";

						System.out.println(securitySetting);
						int securitySettings = inputCollector.nextInt();
						
							break;

						case 4 :System.out.println("Restore factory settings"); break;
			
					default : System.out.println("No menu selected"); break;
				      }
					break;

		case 7:  System.out.println("Call divert");
		
		String CallDivert = "Select Call divert";

					System.out.println(CallDivert);

		    			int callDivert = inputCollector.nextInt();

		switch(callDivert){    
					case 1 : System.out.println("Call divert"); break;
					
					default : System.out.println("No menu selected"); break;

					}
					break;

		case 8:  System.out.println("Games");
		
		String Games = "Select Games";

					System.out.println(Games);

					int games = inputCollector.nextInt();

		switch(games){    
					case 1 : System.out.println("Games"); break;
					
					default : System.out.println("No menu selected"); break;

					}
					break;
		case 9:  System.out.println("Calculator");
		
		String Calculator  = "Calculator";

					System.out.println(Calculator);

		int calculator = inputCollector.nextInt();

		switch(calculator){    
					case 1 : System.out.println("Calculator"); break;
					
					default : System.out.println("No menu selected"); break;

					}
					break;

		case 10:  System.out.println("Reminder");
		
		String  Reminder = "Reminder";

				System.out.println(Reminder);

		int reminder = inputCollector.nextInt();

		switch(reminder){    
					case 1 : System.out.println("Reminder"); break;
					
					default : System.out.println("No menu selected"); break;

					}
					break;

		case 11:  System.out.println("Clock");
		
		String  Clock = """
				Select 1 Alarm clock
				Select 2 Clock settings
				Select 3 Date settings
				Select 4 Stopwatch
				Select 5 Countdown timer
				Select 6 Auto update of date and time
				
				""";

					System.out.println(Clock);

		int clock = inputCollector.nextInt();

		switch(clock){    
					case 1 : System.out.println("Alarm clock"); 
					String Clocker = """
						1. Alarm clock
						2. Clock settings
						3. Date setting
						4. Stopwatch
						5. Countdown timer
						6. Auto update of date and time
						
						""";					
						
					System.out.println(Clocker);
					int clocking = inputCollector.nextInt();
break;
					//case 2 : System.out.println("Clocking settings"); break;
					//case 3 : System.out.println("Date setting"); break;
					//case 4 : System.out.println("Stopwatch"); break;
					//case 5 : System.out.println("Countdown timer"); break;
					//case 6 : System.out.println("Auto update of date and time"); break;
					default : System.out.println("No menu selected"); break;

					}
break;



		case 12:  System.out.println("Profiles");
		
		String CallDivert = "Select Call divert";

					System.out.println(CallDivert);

		int profiles = inputCollector.nextInt();

		switch(profiles){    
					case 1 : System.out.println("Profile"); break;
					
					default : System.out.println("No menu selected"); break;

					}
					break;

		case 13:  System.out.println("SIM services");
		
		String CallDivert = "Select Call divert";

					System.out.println(CallDivert);

		int simServices = inputCollector.nextInt();

		switch(simServices){    
					case 1 : System.out.println("SIM services"); break;
					
					default : System.out.println("No menu selected"); break;

					}
					break;
} while(!=0);
	}		
	
}

}