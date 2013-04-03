import java.util.Properties

object HelloWorld extends App {
  println("Hello, world!")

  val properties = new Properties()
  properties.load(getClass.getResource("config.properties").openStream())
  println(s"Gosh, we're using this password: ${properties.getProperty("db.password")}")
}
