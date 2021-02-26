package typingsSlinky.xstyledStyledComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @scala.inline
  def apply(
    theme: AnyIfEmpty[AnyIfEmpty[DefaultTheme]] | (js.Function1[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]])
  ): Default[tag.type, typingsSlinky.xstyledStyledComponents.mod.ThemeProvider] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.xstyledStyledComponents.mod.ThemeProvider](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]]))
  }
  
  @JSImport("@xstyled/styled-components", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]): Default[tag.type, typingsSlinky.xstyledStyledComponents.mod.ThemeProvider] = new Default[tag.type, typingsSlinky.xstyledStyledComponents.mod.ThemeProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}
