package typingsSlinky.themeUi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[T]
  - org.scalablytyped.runtime.StringDictionary[
T | (/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias theme-ui.theme-ui.ObjectOrArray<T> * / js.Object)]
*/
trait ObjectOrArray[T] extends js.Object

object ObjectOrArray {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): ObjectOrArray[T] = value.asInstanceOf[ObjectOrArray[T]]
  @scala.inline
  implicit def apply[T](
    value: StringDictionary[
      T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias theme-ui.theme-ui.ObjectOrArray<T> */ js.Object)
    ]
  ): ObjectOrArray[T] = value.asInstanceOf[ObjectOrArray[T]]
}

