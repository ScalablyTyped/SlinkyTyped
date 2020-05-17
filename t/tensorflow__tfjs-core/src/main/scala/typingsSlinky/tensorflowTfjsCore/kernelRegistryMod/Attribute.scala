package typingsSlinky.tensorflowTfjsCore.kernelRegistryMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.AttributeValue
  - typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray[typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.AttributeValue]
*/
trait Attribute extends js.Object

object Attribute {
  @scala.inline
  implicit def apply(value: AttributeValue): Attribute = value.asInstanceOf[Attribute]
  @scala.inline
  implicit def apply(value: RecursiveArray[AttributeValue]): Attribute = value.asInstanceOf[Attribute]
}

