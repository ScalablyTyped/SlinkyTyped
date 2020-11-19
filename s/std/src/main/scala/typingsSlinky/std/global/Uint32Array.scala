package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Uint32ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Uint32Array")
@js.native
class Uint32Array ()
  extends typingsSlinky.std.Uint32Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: js.Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}
@JSGlobal("Uint32Array")
@js.native
object Uint32Array extends TopLevel[Uint32ArrayConstructor]
