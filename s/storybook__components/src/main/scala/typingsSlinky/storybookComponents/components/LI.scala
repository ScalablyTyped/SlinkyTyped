package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLLIElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.LiHTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LI {
  
  @JSImport("@storybook/components/dist/html", "LI")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: LI.type): SharedBuilder_DetailedHTMLPropsOmit0_1557099909[HTMLLIElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1557099909[HTMLLIElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_1557099909[HTMLLIElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1557099909[HTMLLIElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

object Li {
  
  @JSImport("@storybook/components/dist/html", "components.li")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Li.type): SharedBuilder_DetailedHTMLPropsOmit0_1557099909[HTMLLIElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1557099909[HTMLLIElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_1557099909[HTMLLIElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1557099909[HTMLLIElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
