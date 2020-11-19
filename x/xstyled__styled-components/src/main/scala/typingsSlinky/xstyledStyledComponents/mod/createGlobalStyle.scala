package typingsSlinky.xstyledStyledComponents.mod

import slinky.core.ReactComponentClass
import typingsSlinky.std.TemplateStringsArray
import typingsSlinky.styledComponents.styledComponentsMod.CSSObject
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import typingsSlinky.styledComponents.styledComponentsMod.Interpolation
import typingsSlinky.styledComponents.styledComponentsMod.InterpolationFunction
import typingsSlinky.styledComponents.styledComponentsMod.ThemedGlobalStyledClassProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@xstyled/styled-components", "createGlobalStyle")
@js.native
object createGlobalStyle extends js.Object {
  
  def apply[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  def apply[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
  def apply[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): ReactComponentClass[ThemedGlobalStyledClassProps[P, DefaultTheme]] = js.native
}
