package testpkg

import scala.concurrent.ExecutionContext

object Main {
  def main(args: Array[String]): Unit = {
    val executionContext: ExecutionContext = ExecutionContext.global
    println(executionContext)
  }
}
