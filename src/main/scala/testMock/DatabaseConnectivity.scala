package testMock

import org.apache.spark.sql.{DataFrame, SparkSession}

case class DatabaseConnectivity() {

  def getDBDataFrame(user:String,password:String,spark:SparkSession):DataFrame = {
    null
  }
}
