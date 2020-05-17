package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - js.Object
  - typingsSlinky.slonik.mod.SerializableValueObject
  - typingsSlinky.slonik.mod.SerializableValueArray
*/
trait SerializableValueType extends js.Object

object SerializableValueType {
  @scala.inline
  implicit def apply(value: Boolean): SerializableValueType = value.asInstanceOf[SerializableValueType]
  @scala.inline
  implicit def apply(value: Double): SerializableValueType = value.asInstanceOf[SerializableValueType]
  @scala.inline
  implicit def apply(value: Null): SerializableValueType = value.asInstanceOf[SerializableValueType]
  @scala.inline
  implicit def apply(value: js.Object): SerializableValueType = value.asInstanceOf[SerializableValueType]
  @scala.inline
  implicit def apply(value: SerializableValueArray): SerializableValueType = value.asInstanceOf[SerializableValueType]
  @scala.inline
  implicit def apply(value: SerializableValueObject): SerializableValueType = value.asInstanceOf[SerializableValueType]
  @scala.inline
  implicit def apply(value: String): SerializableValueType = value.asInstanceOf[SerializableValueType]
}

