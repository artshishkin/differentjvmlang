class HelloFromScala {

  def main(args: Array[String]): Unit = {
    val hi = new JavaHello
    val message = hi.getMessage

    println(message)
  }

}
