package typingsSlinky.three

import typingsSlinky.std.ArrayLike
import typingsSlinky.three.srcCoreInterleavedBufferMod.InterleavedBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InstancedInterleavedBuffer", JSImport.Namespace)
@js.native
object srcCoreInstancedInterleavedBufferMod extends js.Object {
  @js.native
  class InstancedInterleavedBuffer protected () extends InterleavedBuffer {
    def this(array: ArrayLike[Double], stride: Double) = this()
    def this(array: ArrayLike[Double], stride: Double, meshPerAttribute: Double) = this()
    var meshPerAttribute: Double = js.native
  }
  
}

