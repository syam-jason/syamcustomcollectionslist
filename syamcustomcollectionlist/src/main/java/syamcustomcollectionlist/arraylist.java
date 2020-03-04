package syamcustomcollectionlist;

import java.util.AbstractList;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class arraylist<T> extends AbstractList<T> {
	private static final Logger LOGGER=(Logger) LogManager.getLogger(arraylist.class);



    private T[] arrayElements;



    arraylist(T[] array) {

        arrayElements = array;

    }



    public T get(int index) {

        return arrayElements[index];

    }



    public T set(int index, T element) {

        T oldValue = arrayElements[index];

        arrayElements[index] = element;

        return oldValue;

    }



    public int size() {

        return arrayElements.length;

    }

    public boolean add(T element) {

		int k=arrayElements.length;

		arrayElements=Arrays.copyOf(arrayElements,k+1);

		arrayElements[k]=element;

		return true;

    }

    public T remove(int index) {

    	if (index >= size() || index < 0) {

            throw new IndexOutOfBoundsException("Index : " + index + ", Size :" + size());

        }

        T item = arrayElements[index];

        int numElts = arrayElements.length - ( index + 1 ) ;

        System.arraycopy( arrayElements, index + 1, arrayElements, index, numElts ) ;

    	arrayElements=Arrays.copyOf(arrayElements,arrayElements.length-1);

		return item;

    }



	public void print() {

		for(int i=0;i<arrayElements.length;i++)

			LOGGER.error(arrayElements[i]+" ");

	}

}


