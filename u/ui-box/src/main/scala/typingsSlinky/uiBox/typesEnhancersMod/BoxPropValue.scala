package typingsSlinky.uiBox.typesEnhancersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typingsSlinky.uiBox.uiBoxBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait BoxPropValue extends js.Object

object BoxPropValue {
  @scala.inline
  def `false`: typingsSlinky.uiBox.uiBoxBooleans.`false` = false.asInstanceOf[typingsSlinky.uiBox.uiBoxBooleans.`false`]
  @scala.inline
  implicit def apply(value: Double): BoxPropValue = value.asInstanceOf[BoxPropValue]
  @scala.inline
  implicit def apply(value: Null): BoxPropValue = value.asInstanceOf[BoxPropValue]
  @scala.inline
  implicit def apply(value: String): BoxPropValue = value.asInstanceOf[BoxPropValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => BoxPropValue): BoxPropValue = value.asInstanceOf[BoxPropValue]
}

