

public class ReadTime {
    public String makeReadable(int seconds) {
      int divider=60, sec=0, minute=0, hour=0, tempHolder;
      String timeToReturn="";

      if(seconds>=0 && seconds<=359999){
      sec=seconds%divider;
      seconds-=sec;
      tempHolder=seconds/divider;
      minute=tempHolder%divider;
      tempHolder-=minute;
      hour=tempHolder/divider;

      if(hour<10) timeToReturn="0";
      timeToReturn+=hour+":";
      if(minute<10) timeToReturn+="0";
      timeToReturn+=minute+":";
      if(sec<10) timeToReturn+="0";
      timeToReturn+=sec;

      }

      return (timeToReturn);
    }
  }