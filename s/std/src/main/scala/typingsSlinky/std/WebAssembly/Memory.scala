package typingsSlinky.std.WebAssembly

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memory extends js.Object {
  val buffer: scala.scalajs.js.typedarray.ArrayBuffer
  def grow(delta: Double): Double
}

@JSGlobal("WebAssembly.Memory")
@js.native
object Memory extends Instantiable1[/* descriptor */ MemoryDescriptor, Memory]

