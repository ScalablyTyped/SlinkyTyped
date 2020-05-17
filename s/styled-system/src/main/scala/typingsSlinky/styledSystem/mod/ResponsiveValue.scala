package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - scala.Null
  - js.Array[T | scala.Null]
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in styled-system.styled-system.ThemeValue<'breakpoints', ThemeType, any> & string | number ]:? T}
  * / typingsSlinky.styledSystem.styledSystemStrings.ResponsiveValue with org.scalablytyped.runtime.TopLevel[js.Any]
*/
trait ResponsiveValue[T, ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object

object ResponsiveValue {
  @scala.inline
  implicit def apply[T, ThemeType](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in styled-system.styled-system.ThemeValue<'breakpoints', ThemeType, any> & string | number ]:? T}
    */ typingsSlinky.styledSystem.styledSystemStrings.ResponsiveValue with TopLevel[js.Any]
  ): ResponsiveValue[T, ThemeType] = value.asInstanceOf[ResponsiveValue[T, ThemeType]]
  @scala.inline
  implicit def apply[T, ThemeType](value: js.Array[T | Null]): ResponsiveValue[T, ThemeType] = value.asInstanceOf[ResponsiveValue[T, ThemeType]]
  @scala.inline
  implicit def apply[T, ThemeType](value: Null): ResponsiveValue[T, ThemeType] = value.asInstanceOf[ResponsiveValue[T, ThemeType]]
  @scala.inline
  implicit def apply[T, ThemeType](value: T): ResponsiveValue[T, ThemeType] = value.asInstanceOf[ResponsiveValue[T, ThemeType]]
}

