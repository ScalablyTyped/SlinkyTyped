package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabBar {
  @JSImport("@storybook/components", "TabBar")
  @js.native
  object component extends js.Object
  
  def withProps(
    p: PropsWithChildren[
      (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with (Omit[PickDetailedHTMLPropsHTML, theme]) with `0`[Theme]
    ]
  ): SharedBuilder_PropsWithChildren1897537728[HTMLDivElement] = new SharedBuilder_PropsWithChildren1897537728[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabBar.type): SharedBuilder_PropsWithChildren1897537728[HTMLDivElement] = new SharedBuilder_PropsWithChildren1897537728[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}

