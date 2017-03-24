
import java.util.Map;

public class Association<K extends Comparable<K>,V> implements Comparable<Association<K,V>>{
    protected K theKey;
    
    protected V theValue; 
  
    /**
     * @param key
     * @param value
     */
    public Association(K key, V value){
        
        theKey = key;
        theValue = value;
    }


    /**
     * @param key
     */
    public Association(K key){
        this(key,null);
    }

  
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other){
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }
    
 
    public int hashCode(){
        return getKey().hashCode();
    }
    
  
    public V getValue(){
        return theValue;
    }


    public K getKey(){
        return theKey;
    }


    /**
     * @param value
     * @return
     */
    public V setValue(V value){
        V oldValue = theValue;
        theValue = value;
        return oldValue;
    }
    
 
    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append("<Association: "+getKey()+"="+getValue()+">");
        return s.toString();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Association<K, V> arg0) {
		return theKey.compareTo(arg0.getKey());
	}
    

}