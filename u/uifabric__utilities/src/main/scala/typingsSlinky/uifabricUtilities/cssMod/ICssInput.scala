package typingsSlinky.uifabricUtilities.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.uifabricUtilities.cssMod.ISerializableObject
  - typingsSlinky.uifabricUtilities.cssMod.IDictionary
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - scala.Boolean
*/
trait ICssInput extends js.Object

object ICssInput {
  @scala.inline
  implicit def apply(value: Boolean): ICssInput = value.asInstanceOf[ICssInput]
  @scala.inline
  implicit def apply(value: IDictionary): ICssInput = value.asInstanceOf[ICssInput]
  @scala.inline
  implicit def apply(value: ISerializableObject): ICssInput = value.asInstanceOf[ICssInput]
  @scala.inline
  implicit def apply(value: Null): ICssInput = value.asInstanceOf[ICssInput]
  @scala.inline
  implicit def apply(value: String): ICssInput = value.asInstanceOf[ICssInput]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ICssInput): ICssInput = value.asInstanceOf[ICssInput]
}

