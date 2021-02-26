package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLOListElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.OlHTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OL {
  
  @JSImport("@storybook/components/dist/html", "OL")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: OL.type): SharedBuilder_DetailedHTMLPropsOmit0_895764456[HTMLOListElement] = new SharedBuilder_DetailedHTMLPropsOmit0_895764456[HTMLOListElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_895764456[HTMLOListElement] = new SharedBuilder_DetailedHTMLPropsOmit0_895764456[HTMLOListElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

object Ol {
  
  @JSImport("@storybook/components/dist/html", "components.ol")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Ol.type): SharedBuilder_DetailedHTMLPropsOmit0_895764456[HTMLOListElement] = new SharedBuilder_DetailedHTMLPropsOmit0_895764456[HTMLOListElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_895764456[HTMLOListElement] = new SharedBuilder_DetailedHTMLPropsOmit0_895764456[HTMLOListElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
