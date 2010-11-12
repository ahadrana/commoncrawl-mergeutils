package org.commoncrawl.hadoop.mergeutils;

import java.io.IOException;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

/**
 * Extends SpillWriter with the ability to handle RAW (as well as Typed) records
 * 
 * @author rana
 *
 * @param <KeyType> 
 * @param <ValueType>
 */
public interface RawDataSpillWriter<KeyType extends WritableComparable,ValueType extends Writable> extends SpillWriter<KeyType,ValueType>  {
  
	/**
	 * spill a key/value pair in raw format
	 * 
	 * @param keyData
	 * @param keyOffset
	 * @param keyLength
	 * @param valueData
	 * @param valueOffset
	 * @param valueLength
	 * @throws IOException
	 */
  void spillRawRecord(byte[] keyData,int keyOffset,int keyLength,byte[] valueData,int valueOffset,int valueLength) throws IOException;

}
