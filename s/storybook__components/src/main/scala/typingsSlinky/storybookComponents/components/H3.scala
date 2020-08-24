package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object H3 {
  @JSImport("@storybook/components/dist/html", "H3")
  @js.native
  object component extends js.Object
  
  def withProps(
    p: PropsWithChildren[
      (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) with (Omit[js.Object, theme]) with `0`[Theme]
    ]
  ): SharedBuilder_PropsWithChildren_1724821862[HTMLHeadingElement] = new SharedBuilder_PropsWithChildren_1724821862[HTMLHeadingElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: H3.type): SharedBuilder_PropsWithChildren_1724821862[HTMLHeadingElement] = new SharedBuilder_PropsWithChildren_1724821862[HTMLHeadingElement](js.Array(this.component, js.Dictionary.empty))()
}

