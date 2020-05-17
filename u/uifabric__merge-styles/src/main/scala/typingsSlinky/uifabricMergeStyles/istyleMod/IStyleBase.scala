package typingsSlinky.uifabricMergeStyles.istyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
  - java.lang.String
  - typingsSlinky.uifabricMergeStyles.uifabricMergeStylesBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait IStyleBase extends IStyle

object IStyleBase {
  @scala.inline
  def `false`: typingsSlinky.uifabricMergeStyles.uifabricMergeStylesBooleans.`false` = false.asInstanceOf[typingsSlinky.uifabricMergeStyles.uifabricMergeStylesBooleans.`false`]
  @scala.inline
  implicit def apply(value: IRawStyle): IStyleBase = value.asInstanceOf[IStyleBase]
  @scala.inline
  implicit def apply(value: Null): IStyleBase = value.asInstanceOf[IStyleBase]
  @scala.inline
  implicit def apply(value: String): IStyleBase = value.asInstanceOf[IStyleBase]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => IStyleBase): IStyleBase = value.asInstanceOf[IStyleBase]
}

