package testMock

import org.apache.spark.sql.functions.lit
import org.apache.spark.sql.{DataFrame, SparkSession}

object DataBaseCall {
 /* def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").getOrCreate()
    val data = DatabaseConnectivity()
  }*/

  def getDataFrame(user:String,password:String,spark:SparkSession,data:DatabaseConnectivity): DataFrame = {
    val df  = data.getDBDataFrame(user,password,spark)
    df.withColumn("cobdate",lit("2020-02-29"))
      .withColumn("label",lit("2020-02-29-02"))
  }
}
