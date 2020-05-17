package typingsSlinky.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Double
  - java.lang.String
  - typingsSlinky.styledSystemCss.mod.CSSObject
*/
trait CSSInterpolation extends js.Object

object CSSInterpolation {
  @scala.inline
  implicit def apply(value: CSSObject): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: Double): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: String): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CSSInterpolation): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
}

