import java.util.*;

class PeekingIterators implements Iterator<Integer> 
{
    private Iterator<Integer> iter;
    private Integer v;
	public PeekingIterators(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iter = iterator;
	    v = null;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(v == null){
            v = iter.next();
        }
        return v;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer tmp = null;
	    if(v == null){
	        tmp = iter.next();
	        return tmp;
	    }
	    tmp = v;
	    v = null;
	    return tmp;
	}

	@Override
	public boolean hasNext() {
	    if(v!=null){
	        return true;
	    }
	    return iter.hasNext();
	}
}