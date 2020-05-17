package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Int16ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Int16Array")
@js.native
class Int16Array ()
  extends typingsSlinky.std.Int16Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: js.Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Int16Array")
@js.native
object Int16Array extends TopLevel[Int16ArrayConstructor]

