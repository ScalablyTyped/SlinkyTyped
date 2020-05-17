package typingsSlinky.tensorflowTfjsCore.kernelRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Boolean | scala.Double | java.lang.String]
  - scala.Boolean
  - java.lang.String
  - typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
*/
trait AttributeValue extends Attribute

object AttributeValue {
  @scala.inline
  implicit def apply(value: js.Array[Boolean | Double | String]): AttributeValue = value.asInstanceOf[AttributeValue]
  @scala.inline
  implicit def apply(value: Boolean): AttributeValue = value.asInstanceOf[AttributeValue]
  @scala.inline
  implicit def apply(value: Double): AttributeValue = value.asInstanceOf[AttributeValue]
  @scala.inline
  implicit def apply(value: NamedAttrMap): AttributeValue = value.asInstanceOf[AttributeValue]
  @scala.inline
  implicit def apply(value: String): AttributeValue = value.asInstanceOf[AttributeValue]
}

