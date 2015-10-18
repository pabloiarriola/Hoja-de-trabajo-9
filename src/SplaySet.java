/*
 * Hoja de Trabajo 9
 *Pablo Arriola 131115
 *Cristopher Aju 13171
 *Jorge Manrique 13600
 */

public class SplaySet extends SplayBST implements WordSet{
    
    private SplayBST<String,Word> splayTree;
    
    public SplaySet(){
        splayTree= new SplayBST<String,Word>();
    }

    @Override
    public void add(Word wordObject) {
        String word = wordObject.getWord();       
        splayTree.put(word, wordObject); //key - palabra / value - objeto
    }

    @Override
    public Word get(Word word) {
        Word retornando = splayTree.get(word.getWord());
        return retornando; //retorna el objeto si se tiene o null
    }
    
}
