package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLDivElement
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

object DocumentWrapper {
  @JSImport("@storybook/components", "DocumentWrapper")
  @js.native
  object component extends js.Object
  
  def withProps(
    p: PropsWithChildren[
      (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with (Omit[js.Object, theme]) with `0`[Theme]
    ]
  ): SharedBuilder_PropsWithChildren562192803[HTMLDivElement] = new SharedBuilder_PropsWithChildren562192803[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DocumentWrapper.type): SharedBuilder_PropsWithChildren562192803[HTMLDivElement] = new SharedBuilder_PropsWithChildren562192803[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}

