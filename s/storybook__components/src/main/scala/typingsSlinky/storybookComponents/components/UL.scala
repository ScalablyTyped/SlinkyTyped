package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLUListElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UL {
  
  @JSImport("@storybook/components/dist/html", "UL")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: UL.type): SharedBuilder_DetailedHTMLPropsOmit0_1183046511[HTMLUListElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1183046511[HTMLUListElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_1183046511[HTMLUListElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1183046511[HTMLUListElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

object Ul {
  
  @JSImport("@storybook/components/dist/html", "components.ul")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Ul.type): SharedBuilder_DetailedHTMLPropsOmit0_1183046511[HTMLUListElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1183046511[HTMLUListElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_1183046511[HTMLUListElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1183046511[HTMLUListElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
