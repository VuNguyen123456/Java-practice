public class TemperatureCalculator {

    public int [] temperatures = {
        15, 22, 18, 25, 30, 
        19, 24, 20, 27, 21, 
        16, 29, 23, 17, 20, 
        28, 31, 26, 24, 19, 
        22, 27, 18, 16, 21, 
        29, 23, 20, 25, 28
    };

    public TemperatureCalculator()
    {}
    
    public int getTempByDay(int day){
        int currTemp = 0;
		try{
			currTemp = temperatures[day-1];
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Invalid day");
			currTemp = 1;
		}
        return currTemp;
    }
	
	public int tempAvg(int firstDay, int lastDay) throws AverageException, IllegalRangeException{
		int tempSum = 0;
		int total = 0;
		
		if(firstDay >= lastDay){
			throw new IllegalRangeException("LastDay must be larger than FirstDay");
		}
		if(firstDay < 1 || lastDay > 30){
			throw new AverageException("firstDay and lastDay must be in range 1-30");
		}
		
		
		for(int i = firstDay-1; i<= lastDay-1; i++){
			tempSum += temperatures[i];
			total += 1;
		}
		int average = tempSum/total;
		
		return average;
	}
}
