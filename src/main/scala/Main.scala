import java.util.Properties

object HelloWorld extends App {

  def fact(n: Int): BigInt = if (n == 0) 1 else (n * fact(n-1))

  println("Hello, world!")

  val properties = new Properties()
  properties.load(getClass.getResource("config.properties").openStream())
  println(s"Gosh, we're using this password: ${properties.getProperty("db.password")}")

  println(s"I like factorials ${fact(10)}")
}
