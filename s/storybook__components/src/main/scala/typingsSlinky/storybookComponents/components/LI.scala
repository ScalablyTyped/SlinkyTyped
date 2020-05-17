package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLLIElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.anon.ThemeTheme
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.LiHTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (typingsSlinky.react.mod.DetailedHTMLProps[
typingsSlinky.react.mod.LiHTMLAttributes[typingsSlinky.std.HTMLLIElement], 
typingsSlinky.std.HTMLLIElement]) with js.Object with typingsSlinky.emotionStyledBase.anon.ThemeTheme[typingsSlinky.storybookTheming.typesMod.Theme] because: IArray(Not a trait) */
object LI {
  @JSImport("@storybook/components/dist/html", "LI")
  @js.native
  object component extends js.Object
  
  def apply(
    p: (DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]) with js.Object with ThemeTheme[Theme]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LI.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

