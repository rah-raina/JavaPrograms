package test.Collections;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "M";
		String result = "";
        switch (day) {
            case "M":
            case "W":
            case "F": {
                result = "MWF";
                break;
            }
            case "T":
            case "TH":
            case "S": {
                result = "TTS";
                break;
            }
        };

        System.out.println("Old Switch Result:");
        System.out.println(result);
	}

	
	
}
