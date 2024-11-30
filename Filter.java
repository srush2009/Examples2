import java.util.function.Predicate;
import java.util.function.Function;

//Predicate/Filter
class Filter {
		public static Predicate<String> nameStartingWithPrefix(String prefix){
			return name -> name.startsWith(prefix);
		}
}
class Mapper{
	    public static Function<String int CharactersCount> getDistinctCharactersCount(){
	    	return s->new CharactersCount(s,(int) s.chars().distinct().count());
	    }
}
//class Mapper {
//    public static Function<String, CharactersCount> getDistinctCharactersCount() {
//        return s -> new CharactersCount(s, (int) s.chars().distinct().count());
//    }
//}