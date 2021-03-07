package testMock

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.mockito.Mockito.when
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.mockito.MockitoSugar

class DataBaseCallTest extends FlatSpec with Matchers with MockitoSugar {
  val data = mock[DatabaseConnectivity]

  it should "provide of Database object" in {

    val spark = SparkSession.builder().master("local").getOrCreate()
    import spark.implicits._
    val df:DataFrame = Seq(
      ("1","2"),      ("2","3")    ).toDF("f1","f2")

    when(data.getDBDataFrame("", "",spark)).thenReturn(df)

    // access the df
    val df1 = DataBaseCall.getDataFrame("","",spark,data)
    df1.show()

    // (4) verify the results
    assert("" == "")
    //assert(joehacker == None)
  }

  it should "provide of Database connectivity" in {

  val spark = SparkSession.builder().master("local").getOrCreate()
    import spark.implicits._
    val df:DataFrame = Seq(
      ("1","2"),      ("2","3")    ).toDF("f1","f2")

    when(data.getDBDataFrame("", "",spark)).thenReturn(df)

    // access the df
    val df1 = data.getDBDataFrame("","",spark)
    df1.show()

    // (4) verify the results
    assert("" == "")
    //assert(joehacker == None)
  }
}
