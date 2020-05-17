package typingsSlinky.tensorflowTfjsCore.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - scala.Null
  - typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDictArray
  - typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
*/
trait ConfigDictValue extends js.Object

object ConfigDictValue {
  @scala.inline
  implicit def apply(value: Boolean): ConfigDictValue = value.asInstanceOf[ConfigDictValue]
  @scala.inline
  implicit def apply(value: ConfigDict): ConfigDictValue = value.asInstanceOf[ConfigDictValue]
  @scala.inline
  implicit def apply(value: ConfigDictArray): ConfigDictValue = value.asInstanceOf[ConfigDictValue]
  @scala.inline
  implicit def apply(value: Double): ConfigDictValue = value.asInstanceOf[ConfigDictValue]
  @scala.inline
  implicit def apply(value: Null): ConfigDictValue = value.asInstanceOf[ConfigDictValue]
  @scala.inline
  implicit def apply(value: String): ConfigDictValue = value.asInstanceOf[ConfigDictValue]
}

