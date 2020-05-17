package typingsSlinky.wordpressUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.wordpressUrl.mod.InputArgsObject
  - typingsSlinky.wordpressUrl.mod.InputArgsArray
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait InputArgsValue extends js.Object

object InputArgsValue {
  @scala.inline
  implicit def apply(value: Boolean): InputArgsValue = value.asInstanceOf[InputArgsValue]
  @scala.inline
  implicit def apply(value: Double): InputArgsValue = value.asInstanceOf[InputArgsValue]
  @scala.inline
  implicit def apply(value: InputArgsArray): InputArgsValue = value.asInstanceOf[InputArgsValue]
  @scala.inline
  implicit def apply(value: InputArgsObject): InputArgsValue = value.asInstanceOf[InputArgsValue]
  @scala.inline
  implicit def apply(value: Null): InputArgsValue = value.asInstanceOf[InputArgsValue]
  @scala.inline
  implicit def apply(value: String): InputArgsValue = value.asInstanceOf[InputArgsValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => InputArgsValue): InputArgsValue = value.asInstanceOf[InputArgsValue]
}

