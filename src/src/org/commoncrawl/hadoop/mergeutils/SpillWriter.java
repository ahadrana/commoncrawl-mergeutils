package org.commoncrawl.hadoop.mergeutils;

import java.io.IOException;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

/**
 * Your basic OutputSink, take typed Key,Value tuples and writes them to some abstract storage destination 
 * 
 * @author rana
 *
 * @param <KeyType> a WritableComparable derived class type 
 * @param <ValueType> a Writable derived class type
 */
public interface SpillWriter<KeyType extends WritableComparable,ValueType extends Writable>  {

  void spillRecord(KeyType key,ValueType value) throws IOException;
  
  void close() throws IOException;

}
