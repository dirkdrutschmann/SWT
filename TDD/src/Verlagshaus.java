import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Verlagshaus {


	public double textToEuro(String text){
		if(text == null) {
			throw new IllegalArgumentException("String can't be null!");
		}
	    return Math.round(100*(double)text.length()/1000.0)/100.0;
	}

	public int countPictures(String text) {
        if(text == null) {
			throw new IllegalArgumentException("String can't be null!");
		}
		text = text.toLowerCase();
		Matcher m = Pattern.compile("(?=(picture))").matcher(text);
		List<Integer> pos = new ArrayList<Integer>();
		while (m.find())
		{
		    pos.add(m.start());
		}
		return pos.size();
	}

}