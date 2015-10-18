
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Hoja de Trabajo 9
 *Pablo Arriola 131115
 *Cristopher Aju 13171
 *Jorge Manrique 13600
 */

public class HashTable implements WordSet{

    Map<String,Word> hashmap;
    
        public HashTable(){
            hashmap = new HashMap<String,Word>();
        }
    
    @Override
	public void add(Word wordObject){
            String word = wordObject.getWord();
            hashmap.put(word, wordObject); //key - palabra / value - objeto
        }
        
    @Override
	public Word get(Word word){
            Word retornando = hashmap.get(word.getWord());
            return retornando; //retorna el objeto si se tiene o null
        }
    
}
