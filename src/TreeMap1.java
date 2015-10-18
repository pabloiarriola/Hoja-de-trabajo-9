
import java.util.Map;

import java.util.TreeMap;

/*
 * Hoja de Trabajo 9
 *Pablo Arriola 131115
 *Cristopher Aju 13171
 *Jorge Manrique 13600
 */

public class TreeMap1 implements WordSet {
    Map<String,Word> treemap;
    
        public TreeMap1(){
            treemap = new TreeMap<String,Word>();
        }
    
    @Override
	public void add(Word wordObject){
            String word = wordObject.getWord();
            treemap.put(word, wordObject); //agrega objeto al arbol
        }
        
    @Override
	public Word get(Word word){
            Word retornando = treemap.get(word.getWord());
            return retornando; //retorna el objeto si se tiene o null
        }
    
}
