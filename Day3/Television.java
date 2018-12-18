public class Television{
	static String state="";
	static int volume=0;
	static String channels[]={"Pogo","CN","TV9","STAR MAA"};
	static String channel="";
	static String currentChannelAndVolume="";
	static int count=0;
	public Television(String string, String string2, int i)//constructor for state
	{
		// TODO Auto-generated constructor stub
		this.state=string;
		for(int i1=0;i1<channels.length;i1++)
		{
			this.channel=string2;
		}
	
		this.volume=i;
	}
	public static boolean TelivisionFunctionalityCheck(
			Television televisionStateCheck) {
		 	if(televisionStateCheck.state=="ON")
		 		return true;
		 	else
		 		return false;
	}
	public static String TelevisionCurrentstateCheck(
			Television televisionStateCheck)
	{
			if(televisionStateCheck.state=="ON")
			{
				currentChannelAndVolume="Channel is "+televisionStateCheck.channel+" and volume is "+televisionStateCheck.volume ;
			}
			else
			{
				
				currentChannelAndVolume="Turn on the TV!!!";
			}
			return currentChannelAndVolume;
	}
	public static int TelevisionVolumeIncrease(
			Television televisionStateCheck) {
		if(televisionStateCheck.state=="ON")
		{
		
			volume=++(televisionStateCheck.volume);
		}
		else
		{
			volume=0;
		}
		
		return volume;
	}
	public static int TelevisionVolumeDecrease(
			Television televisionStateCheck) {
		
		if(televisionStateCheck.state=="ON")
		{
		
			volume=--(televisionStateCheck.volume);
		}
		else
		{
			volume=0;
		}
		
		return volume;
	}
	public static String TelevisionChannelChangeUp(
			Television televisionStateCheck) {
		if(televisionStateCheck.state=="ON")
		{
		
		
				channel=channels[++count];
			
		}
		
		return channel;
	}
	public static String TelevisionChannelChangeDown(
			Television televisionStateCheck) {
		if(televisionStateCheck.state=="ON")
		{
		
		
				channel=channels[--count];
			
		}
		
		return channel;
	}
	public static String TelevisionCurrentChannel(
			Television televisionStateCheck) {
		
		if(televisionStateCheck.state=="ON")
		{
		
		
				channel=channels[count];
			
		}
		
		return channel;
	}
	public static int TelevisionCurrentVolume(
			Television televisionStateCheck) {
		if(televisionStateCheck.state=="ON")
		{
		
			volume=televisionStateCheck.volume;
		}
		else
		{
			volume=0;
		}
		
		return volume;
	}
	public static String TelevisionTurnOnOrOff(
			Television televisionStateCheck) {
		if(state=="OFF")
			state="ON";
		else
			state="OFF";
		return state;
	}
	
}