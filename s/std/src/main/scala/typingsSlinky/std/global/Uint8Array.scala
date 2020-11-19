package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Uint8ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Uint8Array")
@js.native
class Uint8Array ()
  extends typingsSlinky.std.Uint8Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: js.Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}
@JSGlobal("Uint8Array")
@js.native
object Uint8Array extends TopLevel[Uint8ArrayConstructor]
