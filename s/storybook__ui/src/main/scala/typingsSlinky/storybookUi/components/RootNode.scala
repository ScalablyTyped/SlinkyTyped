package typingsSlinky.storybookUi.components

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTMLAbout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RootNode {
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "RootNode")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RootNode.type): SharedBuilder_DetailedHTMLPropsOmit01735681597[HTMLSpanElement] = new SharedBuilder_DetailedHTMLPropsOmit01735681597[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]) with (Omit[PickDetailedHTMLPropsHTMLAbout, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit01735681597[HTMLSpanElement] = new SharedBuilder_DetailedHTMLPropsOmit01735681597[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
