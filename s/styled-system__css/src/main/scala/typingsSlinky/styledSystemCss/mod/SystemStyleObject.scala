package typingsSlinky.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styledSystemCss.mod.SystemCssProperties
  - typingsSlinky.styledSystemCss.mod.CSSPseudoSelectorProps
  - typingsSlinky.styledSystemCss.mod.CSSSelectorObject
  - typingsSlinky.styledSystemCss.mod.VariantProperty
  - typingsSlinky.styledSystemCss.mod.UseThemeFunction
  - scala.Null
*/
trait SystemStyleObject extends js.Object

object SystemStyleObject {
  @scala.inline
  implicit def apply(value: CSSPseudoSelectorProps): SystemStyleObject = value.asInstanceOf[SystemStyleObject]
  @scala.inline
  implicit def apply(value: CSSSelectorObject): SystemStyleObject = value.asInstanceOf[SystemStyleObject]
  @scala.inline
  implicit def apply(value: Null): SystemStyleObject = value.asInstanceOf[SystemStyleObject]
  @scala.inline
  implicit def apply(value: SystemCssProperties): SystemStyleObject = value.asInstanceOf[SystemStyleObject]
  @scala.inline
  implicit def apply(value: UseThemeFunction): SystemStyleObject = value.asInstanceOf[SystemStyleObject]
  @scala.inline
  implicit def apply(value: VariantProperty): SystemStyleObject = value.asInstanceOf[SystemStyleObject]
}

