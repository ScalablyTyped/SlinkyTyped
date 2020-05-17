package typingsSlinky.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait OutPath extends js.Object

object OutPath {
  @scala.inline
  implicit def apply(value: Null): OutPath = value.asInstanceOf[OutPath]
  @scala.inline
  implicit def apply(value: String): OutPath = value.asInstanceOf[OutPath]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => OutPath): OutPath = value.asInstanceOf[OutPath]
}

