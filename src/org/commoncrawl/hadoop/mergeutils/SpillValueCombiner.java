package org.commoncrawl.hadoop.mergeutils;

import java.util.Vector;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

/**
 * Combiner Interface ... needs to be flushed out ... 
 * 
 * @author rana
 *
 * @param <KeyType>
 * @param <ValueType>
 */
public interface SpillValueCombiner<KeyType extends WritableComparable,ValueType extends Writable> {
  public ValueType combineValues(KeyType key,Vector<ValueType> values);
}
