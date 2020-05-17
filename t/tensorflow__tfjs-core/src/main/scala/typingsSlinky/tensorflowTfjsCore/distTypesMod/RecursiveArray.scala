package typingsSlinky.tensorflowTfjsCore.distTypesMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.tensorflowTfjsCore.backendWebglMod.TimerNode
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.Attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecursiveArray[T /* <: js.Any */]
  extends /* index */ NumberDictionary[T | RecursiveArray[T]]
     with Attribute
     with TensorLike
     with TimerNode

object RecursiveArray {
  @scala.inline
  def apply[T](): RecursiveArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursiveArray[T]]
  }
}

