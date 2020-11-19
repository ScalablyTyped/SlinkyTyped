package typingsSlinky.styledComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("styled-components", "ThemeContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[AnyIfEmpty[DefaultTheme]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: AnyIfEmpty[DefaultTheme]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[AnyIfEmpty[DefaultTheme]]]))
  }
}
