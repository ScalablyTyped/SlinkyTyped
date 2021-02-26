package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLDivElement
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

object DocumentWrapper {
  
  @JSImport("@storybook/components", "DocumentWrapper")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DocumentWrapper.type): SharedBuilder_DetailedHTMLPropsOmit0823375440[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsOmit0823375440[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with (Omit[js.Object, theme]) with `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsOmit0823375440[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsOmit0823375440[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
