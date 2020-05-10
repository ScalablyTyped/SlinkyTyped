package typingsSlinky.std.WebAssembly

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Memory extends _ExportValue {
  val buffer: js.typedarray.ArrayBuffer = js.native
  def grow(delta: Double): Double = js.native
}

@JSGlobal("WebAssembly.Memory")
@js.native
object Memory extends Instantiable1[/* descriptor */ MemoryDescriptor, Memory]

