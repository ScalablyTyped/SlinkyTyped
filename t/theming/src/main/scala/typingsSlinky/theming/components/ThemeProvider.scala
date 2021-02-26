package typingsSlinky.theming.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.std.NonNullable
import typingsSlinky.theming.mod.DefaultTheme
import typingsSlinky.theming.mod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @scala.inline
  def apply(theme: NonNullable[DefaultTheme] | (js.Function1[DefaultTheme, NonNullable[DefaultTheme]])): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[DefaultTheme]]))
  }
  
  @JSImport("theming", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThemeProviderProps[DefaultTheme]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
