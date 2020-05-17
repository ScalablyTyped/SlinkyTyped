package typingsSlinky.tensorflowTfjsLayers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - scala.Null
  - typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonArray
  - typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
*/
trait PyJsonValue extends js.Object

object PyJsonValue {
  @scala.inline
  implicit def apply(value: Boolean): PyJsonValue = value.asInstanceOf[PyJsonValue]
  @scala.inline
  implicit def apply(value: Double): PyJsonValue = value.asInstanceOf[PyJsonValue]
  @scala.inline
  implicit def apply(value: Null): PyJsonValue = value.asInstanceOf[PyJsonValue]
  @scala.inline
  implicit def apply(value: PyJsonArray): PyJsonValue = value.asInstanceOf[PyJsonValue]
  @scala.inline
  implicit def apply(value: PyJsonDict): PyJsonValue = value.asInstanceOf[PyJsonValue]
  @scala.inline
  implicit def apply(value: String): PyJsonValue = value.asInstanceOf[PyJsonValue]
}

