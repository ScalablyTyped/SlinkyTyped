package typingsSlinky.storybookUi.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Description {
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "Description")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Description.type): SharedBuilder_DetailedHTMLPropsOmit0_1853247385[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1853247385[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with (Omit[PickDetailedHTMLPropsHTML, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_1853247385[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsOmit0_1853247385[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
