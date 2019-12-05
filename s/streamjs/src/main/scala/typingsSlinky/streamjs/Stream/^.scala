package typingsSlinky.streamjs.Stream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Stream")
@js.native
object ^ extends js.Object {
  def from(str: String): typingsSlinky.streamjs.Stream[String] = js.native
  def from[T](elems: js.Array[T]): typingsSlinky.streamjs.Stream[T] = js.native
  def generate[T](supplier: Supplier[T]): typingsSlinky.streamjs.Stream[T] = js.native
  def iterate[T](seed: T, fn: Function[T, T]): typingsSlinky.streamjs.Stream[T] = js.native
  def of[T](elems: T*): typingsSlinky.streamjs.Stream[T] = js.native
  def range(startInclusive: Double, endExclusive: Double): typingsSlinky.streamjs.Stream[Double] = js.native
  def rangeClosed(startInclusive: Double, endInclusive: Double): typingsSlinky.streamjs.Stream[Double] = js.native
}

