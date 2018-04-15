package it.doamaral

object Chapter1 {

  def main(args: Array[String]) {
    def f[A, B](x: A): B = ???
    def g[B, C](x: B): C = ???
    val composed = g _ compose f
  }
}