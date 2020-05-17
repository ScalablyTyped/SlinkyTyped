package typingsSlinky.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webgme.GmeCommon.DataObject
  - typingsSlinky.webgme.GmeCommon.Primitive
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait OutAttr extends js.Object

object OutAttr {
  @scala.inline
  implicit def apply(value: DataObject): OutAttr = value.asInstanceOf[OutAttr]
  @scala.inline
  implicit def apply(value: Null): OutAttr = value.asInstanceOf[OutAttr]
  @scala.inline
  implicit def apply(value: Primitive): OutAttr = value.asInstanceOf[OutAttr]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => OutAttr): OutAttr = value.asInstanceOf[OutAttr]
}

