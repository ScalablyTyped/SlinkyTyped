package typingsSlinky.styledSystemCss.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[T]
  - org.scalablytyped.runtime.StringDictionary[
T | (/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> * / js.Object)]
*/
trait ThemeValue[T] extends js.Object

object ThemeValue {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): ThemeValue[T] = value.asInstanceOf[ThemeValue[T]]
  @scala.inline
  implicit def apply[T](
    value: StringDictionary[
      T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
    ]
  ): ThemeValue[T] = value.asInstanceOf[ThemeValue[T]]
}

