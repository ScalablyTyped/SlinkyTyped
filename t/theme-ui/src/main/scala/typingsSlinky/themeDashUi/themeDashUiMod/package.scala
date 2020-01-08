package typingsSlinky.themeDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themeDashUiMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.atStyledDashSystemCss.atStyledDashSystemCssMod.SystemStyleObject
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick
  import typingsSlinky.themeDashUi.Anon_As

  type ObjectOrArray[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias theme-ui.theme-ui.ObjectOrArray<T> */ js.Object)
  ])
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type SxComponent[T /* <: SxProps */] = ReactComponentClass[T with Anon_As]
  type SxStyleProp = SystemStyleObject
}
