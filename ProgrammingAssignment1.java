class SY2022bit001{
public int getValidRegistrationsCount(String []number){
	int count =0;
	boolean isValid =false;
	if(number == null){
		return -1;
	}
	for(int i=0;i<number.length;i++){
		isValid =false;
		if(number[i] == null || number[i].length() != 10){
			continue;
	}
		else{
			for(int j=0;j<number[i].length();j++){
				if(j < 4 || (j >= 7 && j < number[i].length())){
				
					char charAtInd = number[i].charAt(j);
					if(Character.isDigit(charAtInd)){	
						isValid = true;
					}
					else{
					    isValid = false;
					    break;
					}
				}
				else{
					Integer year = Integer.parseInt(number[i].substring(0, 4));
					if(year >= 2000 && year <=2024)
					{
						isValid = true;
				}
					else{
					    isValid =false;
					    break;
					}
				}
				if(j >= 4 && j < 7){
					String departmentId = number[i].substring(4,7);
					if(departmentId.equalsIgnoreCase("bit") || departmentId.equalsIgnoreCase("bcs") || departmentId.equalsIgnoreCase("bme") || departmentId.equalsIgnoreCase("bch")){
						isValid =true;
					}
					else{
					    isValid = false;
					    break;
					}
			       }
			}
			if(isValid == true){
				count++;
			}
		}
	}	
		return count;
}
public static void main(String[] args){
	String []RegNum = {null,"2023bsd501","2022bit501","2021BCS001","2025bit111"};
	SY2022bit001 data = new SY2022bit001();
	int count  =data.getValidRegistrationsCount(RegNum);
	System.out.println("The count of valid registraton numbers are="+count);
	}
}
