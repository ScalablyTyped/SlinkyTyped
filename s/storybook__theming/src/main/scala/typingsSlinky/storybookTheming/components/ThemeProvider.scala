package typingsSlinky.storybookTheming.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emotionTheming.mod.ThemeProviderProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @JSImport("@storybook/theming", "ThemeProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Theme] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[Theme](p: ThemeProviderProps[Theme]): Builder[Theme] = new Builder[Theme](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[Theme](theme: Partial[Theme] | (js.Function1[Theme, Theme])): Builder[Theme] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder[Theme](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[Theme]]))
  }
}
