package org.commoncrawl.hadoop.mergeutils;

import java.io.IOException;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

@SuppressWarnings("unchecked")
public interface SequenceFileIndexWriter<KeyType extends WritableComparable,ValueType extends Writable> {
	
	
	/**
	 * index a given item 
	 * 
	 * @param keyData key bytes
	 * @param keyOffset key offset
	 * @param keyLength key length
	 * @param valueData value bytes 
	 * @param valueOffset value offset 
	 * @param valueLength value length 
	 * @param writerPosition 
	 * 								the sequence writer file position for the current item 
	 */
	void indexItem(byte[] keyData,int keyOffset,int keyLength,byte[] valueData,int valueOffset,int valueLength,long writerPosition)throws IOException;
	
	/** 
	 * flush and close the index file
	 * 
	 * @throws IOException
	 */
	void close() throws IOException;

}
