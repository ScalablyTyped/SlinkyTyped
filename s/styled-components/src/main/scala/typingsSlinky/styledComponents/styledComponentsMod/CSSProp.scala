package typingsSlinky.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.styledComponents.styledComponentsMod.CSSObject
  - typingsSlinky.styledComponents.styledComponentsMod.FlattenInterpolation[typingsSlinky.styledComponents.styledComponentsMod.ThemeProps[T]]
*/
trait CSSProp[T] extends js.Object

object CSSProp {
  @scala.inline
  implicit def apply[T](value: CSSObject): CSSProp[T] = value.asInstanceOf[CSSProp[T]]
  @scala.inline
  implicit def apply[T](value: FlattenInterpolation[ThemeProps[T]]): CSSProp[T] = value.asInstanceOf[CSSProp[T]]
  @scala.inline
  implicit def apply[T](value: String): CSSProp[T] = value.asInstanceOf[CSSProp[T]]
}

