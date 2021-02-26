package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  @JSImport("@storybook/components", "TabBar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabBar.type): SharedBuilder_DetailedHTMLPropsOmit0_575095177[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsOmit0_575095177[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with (Omit[PickDetailedHTMLPropsHTML, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0_575095177[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsOmit0_575095177[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
