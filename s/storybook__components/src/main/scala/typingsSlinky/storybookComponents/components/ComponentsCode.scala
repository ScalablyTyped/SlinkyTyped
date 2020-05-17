package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.anon.ThemeTheme
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (typingsSlinky.react.mod.DetailedHTMLProps[
typingsSlinky.react.mod.HTMLAttributes[typingsSlinky.std.HTMLElement], 
typingsSlinky.std.HTMLElement]) with js.Object with typingsSlinky.emotionStyledBase.anon.ThemeTheme[typingsSlinky.storybookTheming.typesMod.Theme] because: IArray(Not a trait) */
object ComponentsCode {
  @JSImport("@storybook/components/dist/html", "components.code")
  @js.native
  object component extends js.Object
  
  def apply(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) with js.Object with ThemeTheme[Theme]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ComponentsCode.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

