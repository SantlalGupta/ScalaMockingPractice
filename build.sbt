name := "ScalaMocking"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "2.8.47" % Test
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0"

