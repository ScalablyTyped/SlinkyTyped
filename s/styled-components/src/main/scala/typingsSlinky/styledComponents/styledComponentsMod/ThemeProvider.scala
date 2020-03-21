package typingsSlinky.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends Component[
      ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]], 
      ComponentState, 
      js.Any
    ] {
  def this(props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) = this()
  def this(
    props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]],
    context: js.Any
  ) = this()
}

@JSImport("styled-components", "ThemeProvider")
@js.native
object ThemeProvider extends TopLevel[ThemeProviderComponent[AnyIfEmpty[DefaultTheme], AnyIfEmpty[DefaultTheme]]]

