package org.commoncrawl.hadoop.mergeutils;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

/**
 * The basic Comparator interface. Note: You can compare on Typed keys and/or values
 * 
 * @author rana
 *
 * @param <KeyType>
 * @param <ValueType>
 */
public interface KeyValuePairComparator<KeyType extends WritableComparable,ValueType extends Writable> {
  
  int compare(KeyType key1,ValueType value1,KeyType key2,ValueType value2);
  
}
