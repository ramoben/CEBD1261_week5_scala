
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.SparkSession
object wordCount_a {
  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val session = SparkSession
      .builder
      .master("local[2]")
      .appName("WordCount")
      .getOrCreate()
    val input = session.read.textFile("TheHungerGames.txt")
    import session.implicits._
    val words = input.flatMap(x => x.split(" "))
    val wordCounts = words.rdd.countByValue()
    wordCounts.foreach(println)
  }
}