package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLHRElement
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

object HR {
  
  @JSImport("@storybook/components/dist/html", "HR")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: HR.type): SharedBuilder_DetailedHTMLPropsOmit0_1969706408[HTMLHRElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1969706408[HTMLHRElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_1969706408[HTMLHRElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1969706408[HTMLHRElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}

object Hr {
  
  @JSImport("@storybook/components/dist/html", "components.hr")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Hr.type): SharedBuilder_DetailedHTMLPropsOmit0_1969706408[HTMLHRElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1969706408[HTMLHRElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_1969706408[HTMLHRElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1969706408[HTMLHRElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
