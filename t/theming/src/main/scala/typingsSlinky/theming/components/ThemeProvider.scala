package typingsSlinky.theming.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.std.NonNullable
import typingsSlinky.theming.mod.DefaultTheme
import typingsSlinky.theming.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  @JSImport("theming", "ThemeProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThemeProviderProps[DefaultTheme]): Default[tag.type, typingsSlinky.theming.mod.ThemeProvider] = new Default[tag.type, typingsSlinky.theming.mod.ThemeProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(theme: NonNullable[DefaultTheme] | (js.Function1[DefaultTheme, NonNullable[DefaultTheme]])): Default[tag.type, typingsSlinky.theming.mod.ThemeProvider] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.theming.mod.ThemeProvider](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[DefaultTheme]]))
  }
}

