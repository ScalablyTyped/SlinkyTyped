package typingsSlinky.std.global.WebAssembly

import typingsSlinky.std.WebAssembly.MemoryDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Memory")
@js.native
class MemoryCls protected ()
  extends typingsSlinky.std.WebAssembly.Memory {
  def this(descriptor: MemoryDescriptor) = this()
  /* CompleteClass */
  override val buffer: js.typedarray.ArrayBuffer = js.native
  /* CompleteClass */
  override def grow(delta: Double): Double = js.native
}

