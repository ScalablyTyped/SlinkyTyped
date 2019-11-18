package typingsSlinky.styledDashComponents.styledDashComponentsMod

import slinky.core.ReactComponentClass
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", "createGlobalStyle")
@js.native
object createGlobalStyle extends js.Object {
  def apply[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  def apply[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  def apply[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
}

