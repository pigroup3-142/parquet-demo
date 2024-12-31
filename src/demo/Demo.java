package demo;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Demo {
	public static void main(String[] args) throws IOException {
		Configuration hadoop = new Configuration();
		hadoop.set("fs.defaultFS", "hdfs://localhost:9001");
		FileSystem hdfs = FileSystem.get(hadoop);
		
		Path src = new Path("/home/trannguyenhan/CodeFolder/preprocessing-data/csv/datatest.csv");
		Path dst = new Path("/output/datatest.csv");
		
		hdfs.copyFromLocalFile(src, dst);
	}
}
